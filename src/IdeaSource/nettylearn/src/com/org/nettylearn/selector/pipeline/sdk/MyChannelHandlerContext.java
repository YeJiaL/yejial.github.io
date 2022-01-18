package com.org.nettylearn.selector.pipeline.sdk;


import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.List;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/13 17:37
 */
public class MyChannelHandlerContext {
    private MyNioSocketChannel myNioSocketChannel;

    private Object result;

    public MyChannelHandlerContext(MyNioSocketChannel myNioSocketChannel) {
        this.myNioSocketChannel = myNioSocketChannel;
    }

    public void withResult(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }

    public void write(Object object) {
        this.result = object;
        MyPipeLine myPipeLine = myNioSocketChannel.myPipeLine;
        List<MyChannelHandler> channelHandlers = myPipeLine.getChannelHandlers();
        for (int i = channelHandlers.size() - 1; i >= 0; i--) {
            if (channelHandlers.get(i) instanceof MyChannelOutboundHandler) {
                MyChannelOutboundHandler outboundHandler = (MyChannelOutboundHandler)channelHandlers.get(i);
                outboundHandler.outBound(this);
            }
        }
        SocketChannel socketChannel = myNioSocketChannel.getSocketChannel();
        try {
            socketChannel.write((ByteBuffer)result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
