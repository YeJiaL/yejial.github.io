package com.org.nettylearn.selector.pipeline.sdk;

import com.org.nettylearn.utils.Utils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/12 10:30
 */
public class WorkerEventLoop implements Runnable {
    private Selector selector;
    private Thread thread = new Thread();

    private AtomicBoolean started = new AtomicBoolean(false);
    private String name;


    public WorkerEventLoop(String name) throws IOException {
        this.name = name;
        selector = Selector.open();
    }

    public void register(MyNioSocketChannel nioSocketChannel) throws Exception {
        if (started.compareAndSet(false, true)) {
            thread = new Thread(this, name);
            thread.start();
        }
        nioSocketChannel.getSocketChannel().configureBlocking(false);
        nioSocketChannel.getSocketChannel().register(selector, SelectionKey.OP_READ, nioSocketChannel);
        // 防止先select()再register情况发生
        selector.wakeup();
    }


    @Override
    public void run() {
        while (true) {
            try {
                selector.select();
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();
                    if (selectionKey.isReadable()) {
                        read(selectionKey);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void read(SelectionKey key) {
        SocketChannel socketChannel = (SocketChannel)key.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
        try {
            int readByteCount = socketChannel.read(byteBuffer);
            if (readByteCount == -1) {
                Utils.closeQuiet(key, socketChannel);
                return;
            }

            // 从 key 上获取附件(包含SocketChannel pipeline)
            MyNioSocketChannel nioSocketChannel = (MyNioSocketChannel)key.attachment();
            MyPipeLine myPipeLine = nioSocketChannel.pipeLine();

            MyChannelHandlerContext context = new MyChannelHandlerContext(nioSocketChannel);
            context.withResult(byteBuffer);

            // 依次执行pipeline上的channelHandler上的操作
            for (MyChannelHandler channelHandler : myPipeLine.getChannelHandlers()) {
                if (channelHandler instanceof MyChannelInboundHandler) {
                    ((MyChannelInboundHandler)channelHandler).inBound(context);
                }
            }
        } catch (IOException e) {
            Utils.closeQuiet(key, socketChannel);
        }
    }
}
