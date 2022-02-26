package com.org.nettylearn.selector.pipeline.sdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/13 11:12
 */
public class MyPipeLine {
    private List<MyChannelHandler> channelHandlers = new ArrayList<>();

    public void addLast(MyChannelHandler channelHandler) {
        channelHandlers.add(channelHandler);
    }

    public List<MyChannelHandler> getChannelHandlers() {
        return channelHandlers;
    }

}
