package com.org.nettylearn.selector.pipeline.sdk;


/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/13 11:34
 */
public interface MyChannelInboundHandler extends MyChannelHandler {

    void inBound(MyChannelHandlerContext context);

}
