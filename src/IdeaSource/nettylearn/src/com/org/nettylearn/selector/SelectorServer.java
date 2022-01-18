package com.org.nettylearn.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/11 14:50
 */
public class SelectorServer {
    public static void main(String[] args) throws Exception {
        // 新建 ServerSocketChannel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // ServerSocketChannel 绑定端口
        serverSocketChannel.bind(new InetSocketAddress(9999));
        // 设置成非阻塞
        serverSocketChannel.configureBlocking(false);

        // 新建Selector
        Selector selector = Selector.open();
        // 将ServerSocketChannel注册到selector上，并告知对连接事件感兴趣
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            // 从selector上获取可以操作的事件，阻塞方法，没事件则阻塞，有事件则线程恢复运行
            selector.select();
            // 返回所有发生的事件
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                // 是可连接事件
                if (key.isAcceptable()) {
                    SocketChannel socketChannel = accept(key);
                    socketChannel.configureBlocking(false);
                    // 将socketChannel注册到selector上，并告知对读事件感兴趣
                    socketChannel.register(selector, SelectionKey.OP_READ);
                }
                // 是可读事件
                else if (key.isReadable()) {
                    String msg = read(key);
                    write(key, msg);
                }
                iterator.remove();
            }
        }
    }

    private static SocketChannel accept(SelectionKey key) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel)key.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        System.out.println("server accepted a new connection ...");
        return socketChannel;
    }

    private static String read(SelectionKey key) throws Exception {
        SocketChannel socketChannel = (SocketChannel)key.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
        socketChannel.read(byteBuffer);
        String received = new String(byteBuffer.array());
        System.out.println("server received: " + received);
        return received;
    }

    private static void write(SelectionKey key, String msg) throws IOException {
        SocketChannel socketChannel = (SocketChannel)key.channel();
        socketChannel.write(ByteBuffer.wrap(msg.getBytes()));
        System.out.println("server send: " + msg);
    }

}
