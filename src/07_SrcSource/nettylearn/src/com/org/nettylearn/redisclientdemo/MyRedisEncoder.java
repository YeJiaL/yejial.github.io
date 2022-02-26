package com.org.nettylearn.redisclientdemo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/12 19:37
 */
public class MyRedisEncoder extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {
        String redisCommand = toRedisCommand(msg);
        ByteBuf byteBuf = ctx.alloc().buffer();
        byteBuf.writeBytes(redisCommand.getBytes());
        ctx.write(byteBuf, promise);
    }

    private static String toRedisCommand(Object msg) {
        /**
         * redis协议规则如下：
         * set company united-imaging
         *  *3
         *  $3
         *  set
         *  $7
         *  company
         *  $14
         *  united-imaging
         */
        String[] commands = ((String)msg).split("\\s+");
        StringBuilder builder = new StringBuilder();
        String LINE = "\r\n";
        builder.append("*").append(commands.length).append(LINE);
        for (int i = 0; i < commands.length; i++) {
            builder.append("$").append(commands[i].length()).append(LINE);
            builder.append(commands[i]).append(LINE);
        }
        return builder.toString();
    }
}
