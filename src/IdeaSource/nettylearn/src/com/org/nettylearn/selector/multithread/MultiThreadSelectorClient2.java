package com.org.nettylearn.selector.multithread;

import com.org.nettylearn.utils.Utils;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/11 15:24
 */
public class MultiThreadSelectorClient2 {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
        socketChannel.configureBlocking(true);
        System.out.println("client start ...");

        Utils.sleep();
    }
}
