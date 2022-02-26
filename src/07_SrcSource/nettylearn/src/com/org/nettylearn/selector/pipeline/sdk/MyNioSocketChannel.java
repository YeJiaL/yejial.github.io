package com.org.nettylearn.selector.pipeline.sdk;

import java.nio.channels.SocketChannel;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/13 11:08
 */
public class MyNioSocketChannel {
    private SocketChannel socketChannel;
    public MyPipeLine myPipeLine = new MyPipeLine();

    public MyNioSocketChannel(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }

    public SocketChannel getSocketChannel() {
        return socketChannel;
    }

    public MyPipeLine pipeLine() {
        return myPipeLine;
    }
}
