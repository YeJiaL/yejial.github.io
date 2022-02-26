package com.org.nettylearn.nio;

import com.org.nettylearn.utils.Utils;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/11 14:45
 */
public class NioClient2 {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
        socketChannel.configureBlocking(true);
        System.out.println("client start ...");

        Utils.sleep();
    }
}
