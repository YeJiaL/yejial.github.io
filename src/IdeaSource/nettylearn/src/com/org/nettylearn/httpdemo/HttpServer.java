package com.org.nettylearn.httpdemo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/12 14:41
 */
public class HttpServer {
    public static void main(String[] args) {
        // 1. 配置boss work线程数
        EventLoopGroup boss = new NioEventLoopGroup(1);
        EventLoopGroup work = new NioEventLoopGroup(3);

        try {
            ServerBootstrap server = new ServerBootstrap().group(boss, work).channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) {
                            // 2. pipeline添加handler
                            ch.pipeline().addLast(new HttpServerCodec());
                            ch.pipeline().addLast(new SimpleChannelInboundHandler<HttpRequest>() {
                                @Override
                                protected void channelRead0(ChannelHandlerContext ctx, HttpRequest msg) {
                                    System.out.println("read url: " + msg.uri() + "  method:" + msg.method());

                                    byte[] bytes = "<h1> United-Imaging.com </h1>".getBytes();
                                    DefaultFullHttpResponse response =
                                            new DefaultFullHttpResponse(msg.protocolVersion(), HttpResponseStatus.OK);
                                    response.headers().setInt("content-length", bytes.length);
                                    response.content().writeBytes(bytes);

                                    ctx.writeAndFlush(response);
                                }
                            });
                        }
                    });
            // 3. 绑定端口
            ChannelFuture future = server.bind(8080).sync();
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            boss.shutdownGracefully();
            work.shutdownGracefully();
        }
    }
}
