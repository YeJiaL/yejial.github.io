package com.org.nettylearn.bio.multithread;

import com.org.nettylearn.utils.Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/10 17:11
 */
public class BioClient1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1", 9999));

            System.out.println("client start ...");

            write(socket, "hello\n");

            read(socket);

            Utils.sleep();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void write(Socket socket, String msg) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(msg);
            bw.flush();
            System.out.println("client send a message: " + msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String read(Socket socket) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readLine = in.readLine();
            System.out.println("client read a new message: " + readLine);
            return readLine;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
