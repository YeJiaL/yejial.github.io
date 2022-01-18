package com.org.nettylearn.selector.pipeline.sdk;

import com.org.nettylearn.selector.pipeline.sdk.WorkerEventLoop;

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

    public WorkerEventLoop next() {
        return workers[atomicInteger.getAndIncrement() % workers.length];
    }
}
