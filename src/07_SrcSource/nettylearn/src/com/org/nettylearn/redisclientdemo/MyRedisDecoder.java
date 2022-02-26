package com.org.nettylearn.redisclientdemo;

import java.nio.charset.Charset;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/12 19:38
 */
public class MyRedisDecoder extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf byteBuf = (ByteBuf)msg;
        System.out.println(byteBuf.toString(Charset.defaultCharset()));
    }
}
