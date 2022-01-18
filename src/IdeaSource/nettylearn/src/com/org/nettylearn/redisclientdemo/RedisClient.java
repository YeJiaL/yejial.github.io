package com.org.nettylearn.redisclientdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/12 15:18
 */
public class RedisClient {
    private String host;
    private int port;


    public RedisClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private void launch() throws Exception {
        // 1. 配置worker线程数
        EventLoopGroup workerGroup = new NioEventLoopGroup(1);
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(workerGroup).channel(NioSocketChannel.class).handler(new ChannelInitializer<>() {
                @Override
                protected void initChannel(Channel ch) {
                    // 2. 为channel pipeline添加handler
                    ChannelPipeline pipeline = ch.pipeline();
                    pipeline.addLast(new MyRedisEncoder());
                    pipeline.addLast(new MyRedisDecoder());
                }
            });
            // 3. 与redis服务器建立连接
            Channel channel = bootstrap.connect(host, port).sync().channel();
            System.out.println(" connected to host : " + host + ", port : " + port);
            System.out.println(" type redis's command to communicate with redis-server or type 'quit' to shutdown ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            for (; ; ) {
                String s = in.readLine();
                if (s.equalsIgnoreCase("quit")) {
                    break;
                }
                System.out.print(">");
                // 4.向redis服务器发送从终端接收到的命令
                channel.writeAndFlush(s);
            }
            System.out.println(" bye ");
        } finally{
            workerGroup.shutdownGracefully();
        }
    }


    public static void main(String[] args) throws Exception {
        RedisClient redisClient = new RedisClient("127.0.0.1", 6379);
        redisClient.launch();
    }


}
