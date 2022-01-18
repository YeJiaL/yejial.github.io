package com.org.nettylearn.helloworld;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2021/11/12 17:34
 */
public class HelloWorldClient {
    private String host;
    private int port;

    public HelloWorldClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap client =
                    new Bootstrap().group(group).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) {
                            socketChannel.pipeline().addLast(new StringDecoder()).addLast(new StringEncoder())
                                    .addLast(new HelloWorldClientHandler());
                        }
                    });
            ChannelFuture future = client.connect(host, port).sync();
            String msg = "hello";
            future.channel().writeAndFlush(msg);
            System.out.println("client send msg:" + msg);
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            group.shutdownGracefully();
        }
    }

    public static class HelloWorldClientHandler extends ChannelInboundHandlerAdapter {
        @Override
        public void channelActive(ChannelHandlerContext ctx) {
            System.out.println("client channel active");
        }

        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) {
            System.out.println("client received msg: " + msg);
        }
    }

    public static void main(String[] args) {
        new HelloWorldClient("127.0.0.1", 9999).start();
    }

}
