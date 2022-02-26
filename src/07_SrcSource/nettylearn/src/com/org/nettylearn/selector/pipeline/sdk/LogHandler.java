package com.org.nettylearn.selector.pipeline.sdk;


/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/13 18:44
 */
public class LogHandler implements MyChannelInboundHandler, MyChannelOutboundHandler {

    @Override
    public void inBound(MyChannelHandlerContext context) {
        System.out.println("server received msg " + context.getResult().toString());
    }

    @Override
    public void outBound(MyChannelHandlerContext context) {
        System.out.println("server send msg: " + context.getResult().toString());
    }
}
