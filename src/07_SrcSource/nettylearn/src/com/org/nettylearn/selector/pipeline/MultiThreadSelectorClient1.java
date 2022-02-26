package com.org.nettylearn.selector.pipeline;

import com.org.nettylearn.utils.Utils;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/11 15:24
 */
public class MultiThreadSelectorClient1 {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
        socketChannel.configureBlocking(true);
        System.out.println("client start ...");


        String msg = "hello\n";
        socketChannel.write(ByteBuffer.wrap(msg.getBytes()));
        System.out.println("client write " + msg);

        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
        socketChannel.read(byteBuffer);
        System.out.println("client receive " + new String(byteBuffer.array()));

        Utils.sleep();
    }
}
