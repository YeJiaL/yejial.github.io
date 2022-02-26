package com.org.nettylearn.selector.multithread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/11 15:52
 */
public class MultiThreadSelectorServer {

    public static void main(String[] args) throws Exception {
        Thread.currentThread().setName("boss");

        // 新建ServerSocketChannel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);

        // 新建selector
        Selector bossSelector = Selector.open();
        // 将serverSocketChannel注册到selector上，并告知对连接事件感兴趣
        serverSocketChannel.register(bossSelector, SelectionKey.OP_ACCEPT);
        // 绑定端口
        serverSocketChannel.bind(new InetSocketAddress(9999));

        // 新建worker组，包含4个worker
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
                    // 选择一个worker进行register
                    workEventLoopGroup.next().register(socketChannel);
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
