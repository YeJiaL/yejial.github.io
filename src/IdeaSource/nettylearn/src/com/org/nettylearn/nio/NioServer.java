package com.org.nettylearn.nio;

import com.org.nettylearn.utils.Utils;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/11 13:47
 */
public class NioServer {

    public static void main(String[] args) throws Exception {
        // 新建ServerSocketChannel
        ServerSocketChannel ssc = ServerSocketChannel.open();
        // 绑定端口
        ssc.bind(new InetSocketAddress(9999));
        // 设置成非阻塞模式
        ssc.configureBlocking(false);
        System.out.println("server start ....");

        List<SocketChannel> socketChannels = new ArrayList<>();

        while (true) {
            // 接收客户端连接，非阻塞，没有连接返回null,有连接返回SocketChannel
            SocketChannel socketChannel = ssc.accept();
            if (socketChannel != null) {
                System.out.println("server accepted a new connection ...");
                // SocketChannel设置成非阻塞
                socketChannel.configureBlocking(false);
                socketChannels.add(socketChannel);
            }
            Iterator<SocketChannel> iterator = socketChannels.iterator();
            while (iterator.hasNext()) {
                SocketChannel channel = iterator.next();
                String received = read(channel);
                if (received != null) {
                    socketChannel.write(ByteBuffer.wrap(received.getBytes()));
                    System.out.println("server send: " + received);
                    iterator.remove();
                }
            }
            Utils.sleepMoment();
        }
    }

    private static String read(SocketChannel socketChannel) {
        try {
            ByteBuffer byteBuffer = ByteBuffer.allocate(256);
            // 读取数据，有数据返回值>0
            int read = socketChannel.read(byteBuffer);
            if (read > 0) {
                String received = new String(byteBuffer.array());
                System.out.println("server received: " + received);
                return received;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
