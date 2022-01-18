package com.org.nettylearn.bio.multithread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2021/12/10 17:27
 */
public class BioServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(9999));
            System.out.println("server start ....");

            while (true) {
                // 服务端与客户端建立连接
                Socket socket = serverSocket.accept();
                System.out.println("server accepted a new connection ...");

                new Thread(() -> {
                    // 读数据
                    String msg = read(socket);

                    // 写数据
                    write(socket, msg);
                }).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String read(Socket socket) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readLine = in.readLine();
            System.out.println("server read a new message: " + readLine);
            return readLine;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void write(Socket socket, String msg) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(msg + "\n");
            bw.flush();
            System.out.println("server send message: " + msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
