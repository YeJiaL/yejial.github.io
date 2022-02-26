package com.org.nettylearn.bio;

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
public class BioClient2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1", 9999));

            System.out.println("client start ...");


            Utils.sleep();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
