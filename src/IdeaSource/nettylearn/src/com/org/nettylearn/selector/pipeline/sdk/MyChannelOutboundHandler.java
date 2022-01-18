package com.org.nettylearn.selector.pipeline.sdk;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/13 11:38
 */
public interface MyChannelOutboundHandler extends MyChannelHandler{
    void outBound(MyChannelHandlerContext context);
}
