package com.org.nettylearn.selector.multithread;

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
    private Thread thread;

    private AtomicBoolean started = new AtomicBoolean(false);
    private String name;


    public WorkerEventLoop(String name) throws IOException {
        this.name = name;
        selector = Selector.open();
    }

    public void register(SocketChannel socketChannel) throws Exception {
        // 第一次注册的时候启动线程
        if (started.compareAndSet(false, true)) {
            thread = new Thread(this, name);
            thread.start();
        }
        socketChannel.configureBlocking(false);
        // 将SocketChannel注册到selector上，并告知对读事件感兴趣
        socketChannel.register(selector, SelectionKey.OP_READ, null);
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
                        String msg = read(selectionKey);
                        write(selectionKey, msg);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String read(SelectionKey key) {
        SocketChannel socketChannel = (SocketChannel)key.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
        try {
            int readByteCount = socketChannel.read(byteBuffer);
            if (readByteCount == -1) {
                Utils.closeQuiet(key, socketChannel);
                return null;
            }
            String received = new String(byteBuffer.array());
            System.out.println("server received: " + received);
            return received;
        } catch (IOException e) {
            Utils.closeQuiet(key, socketChannel);
        }
        return null;
    }

    private static void write(SelectionKey key, String msg) {
        if (msg == null) {
            return;
        }
        SocketChannel socketChannel = (SocketChannel)key.channel();
        try {
            socketChannel.write(ByteBuffer.wrap(msg.getBytes()));
        } catch (Exception e) {
        }
        System.out.println("server send: " + msg);
    }
}
