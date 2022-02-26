package com.org.nettylearn.utils;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/10 19:13
 */
public class Utils {
    public static void sleep() {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void closeQuiet(SelectionKey key, SocketChannel socketChannel) {
        try {
            key.cancel();
            if (socketChannel != null) {
                socketChannel.close();
            }
        } catch (Exception e) {

        }
    }
}
