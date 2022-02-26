package com.org.nettylearn.helloworld;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2021/11/12 17:21
 */
public class HelloWorldServer {
    private int port;

    public HelloWorldServer(int port) {
        this.port = port;
    }

    public void start() {
        // 1. 配置boss work线程数
        EventLoopGroup boss = new NioEventLoopGroup(1);
        EventLoopGroup work = new NioEventLoopGroup(3);

        try {
            ServerBootstrap server = new ServerBootstrap().group(boss, work).channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) {
                            // 2. pipeline中添加channelHandler
                            socketChannel.pipeline().addLast(new StringDecoder()).addLast(new StringEncoder())
                                    .addLast(new HelloWorldServerHandler());
                        }
                    });
            // 3. 绑定端口
            ChannelFuture future = server.bind(port).sync();
            System.out.println("server started and listen " + port);
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            boss.shutdownGracefully();
            work.shutdownGracefully();
        }
    }

    public static class HelloWorldServerHandler extends ChannelInboundHandlerAdapter {
        @Override
        public void channelActive(ChannelHandlerContext ctx) {
            System.out.println("server channel active");
        }

        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) {
            System.out.println("server received msg:" + msg.toString());
            ctx.write(msg);
            System.out.println("server send msg: " + msg.toString());
            ctx.flush();
        }
    }

    public static void main(String[] args) {
        new HelloWorldServer(9999).start();
    }
}
