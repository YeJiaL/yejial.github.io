package com.org.nettylearn.selector.multithread;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Author: yongdi.wu
 * @Date: 2022/1/12 10:29
 */
public class WorkEventLoopGroup {
    private WorkerEventLoop[] workers;
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public WorkEventLoopGroup(int eventLoopCount) throws IOException {
        workers = new WorkerEventLoop[eventLoopCount];
        for (int workerIndex = 0; workerIndex < workers.length; workerIndex++) {
            workers[workerIndex] = new WorkerEventLoop("worker-" + workerIndex);
        }
    }

    /**
     * 简单的负载均衡
     * 第一个worker处理  第 1,5,9 ... 个channel的读写
     * 第二个worker处理  第 2,6,10... 个channel的读写
     * 第三个worker处理  第 3,7,11... 个channel的读写
     * 第四个worker处理  第 4,8,12... 个channel的读写
     */
    public WorkerEventLoop next() {
        return workers[atomicInteger.getAndIncrement() % workers.length];
    }

}
