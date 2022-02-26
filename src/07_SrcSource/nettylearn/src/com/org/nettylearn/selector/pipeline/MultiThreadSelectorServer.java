package com.org.nettylearn.selector.pipeline;

import com.org.nettylearn.selector.pipeline.sdk.ByteStringConvertHandler;
import com.org.nettylearn.selector.pipeline.sdk.LogHandler;
import com.org.nettylearn.selector.pipeline.sdk.MyChannelInboundHandler;
import com.org.nettylearn.selector.pipeline.sdk.MyNioSocketChannel;
import com.org.nettylearn.selector.pipeline.sdk.MyPipeLine;
import com.org.nettylearn.selector.pipeline.sdk.WorkEventLoopGroup;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/11 15:52
 */
public class MultiThreadSelectorServer {

    public static void main(String[] args) throws Exception {
        Thread.currentThread().setName("boss");

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);

        Selector bossSelector = Selector.open();
        serverSocketChannel.register(bossSelector, SelectionKey.OP_ACCEPT);
        serverSocketChannel.bind(new InetSocketAddress(9999));

        WorkEventLoopGroup workEventLoopGroup = new WorkEventLoopGroup(4);

        while (true) {
            // 阻塞方法，没事件则阻塞，有事件则线程恢复运行
            bossSelector.select();
            // 返回所有发生的事件
            Iterator<SelectionKey> iterator = bossSelector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isAcceptable()) {
                    SocketChannel socketChannel = accept(key);

                    // 将channelPipeline绑定到SocketChannel上
                    MyNioSocketChannel nioSocketChannel = new MyNioSocketChannel(socketChannel);
                    MyPipeLine pipeline = nioSocketChannel.pipeLine();
                    pipeline.addLast(new ByteStringConvertHandler());  // 字节与字符串之间相互转换的Handler
                    pipeline.addLast(new LogHandler());  // 日志handler
                    pipeline.addLast((MyChannelInboundHandler)context -> context.write(context.getResult()));

                    workEventLoopGroup.next().register(nioSocketChannel);
                }
            }
        }
    }

    private static SocketChannel accept(SelectionKey key) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel)key.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        System.out.println("server accepted a new connection ...");
        return socketChannel;
    }
}
