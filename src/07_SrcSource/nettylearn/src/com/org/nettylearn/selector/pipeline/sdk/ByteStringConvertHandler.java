package com.org.nettylearn.selector.pipeline.sdk;


import java.nio.ByteBuffer;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/13 18:32
 */
public class ByteStringConvertHandler implements MyChannelInboundHandler, MyChannelOutboundHandler {

    @Override
    public void inBound(MyChannelHandlerContext context) {
        ByteBuffer byteBuffer = (ByteBuffer)context.getResult();
        String msg = new String(byteBuffer.array());
        context.withResult(msg);
    }

    @Override
    public void outBound(MyChannelHandlerContext context) {
        String msg = (String)context.getResult();
        ByteBuffer byteBuffer = ByteBuffer.wrap(msg.getBytes());
        context.withResult(byteBuffer);
    }
}
