- 2021-12-23 14:28:15.141 ERROR [reactor-executor-4] reactor.core.publisher.Operators : Operator called default onErrorDropped

  ```
  2021-12-23 14:28:15.141 ERROR [reactor-executor-4] reactor.core.publisher.Operators : Operator called default onErrorDropped 
   
  reactor.core.Exceptions$ErrorCallbackNotImplemented: com.azure.core.amqp.exception.AmqpException: Connection reset by peer, errorContext[NAMESPACE: iothub-ns-uplusiothu-15464428-1c9f105fd7.servicebus.windows.net. ERROR CONTEXT: N/A] 
  Caused by: com.azure.core.amqp.exception.AmqpException: Connection reset by peer, errorContext[NAMESPACE: iothub-ns-uplusiothu-15464428-1c9f105fd7.servicebus.windows.net. ERROR CONTEXT: N/A] 
  	at com.azure.core.amqp.implementation.ExceptionUtil.toException(ExceptionUtil.java:85) 
  	at com.azure.core.amqp.implementation.handler.ConnectionHandler.notifyErrorContext(ConnectionHandler.java:325) 
  	at com.azure.core.amqp.implementation.handler.ConnectionHandler.onTransportError(ConnectionHandler.java:228) 
  	at org.apache.qpid.proton.engine.BaseHandler.handle(BaseHandler.java:191) 
  	at org.apache.qpid.proton.engine.impl.EventImpl.dispatch(EventImpl.java:108) 
  	at org.apache.qpid.proton.reactor.impl.ReactorImpl.dispatch(ReactorImpl.java:324) 
  	at org.apache.qpid.proton.reactor.impl.ReactorImpl.process(ReactorImpl.java:291) 
  	at com.azure.core.amqp.implementation.ReactorExecutor.run(ReactorExecutor.java:92) 
  	at reactor.core.scheduler.SchedulerTask.call(SchedulerTask.java:68) 
  	at reactor.core.scheduler.SchedulerTask.call(SchedulerTask.java:28) 
  	at java.base/java.util.concurrent.FutureTask.run(Unknown Source) 
  	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(Unknown Source) 
  	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source) 
  	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source) 
  	at java.base/java.lang.Thread.run(Unknown Source) 
  ```

  

- ​	2021-12-23 14:28:39.763 ERROR [parallel-1] c.a.c.a.i.RequestResponseChannel : connectionId[MF_5a8102_1640228421791] linkName[cbs]: Unable to open send and receive link. 

- 2021-12-23 14:28:39.763 ERROR [parallel-1] reactor.core.publisher.Operators : Operator called default onErrorDropped 

```
2021-12-23 14:28:39.763 ERROR [parallel-1] c.a.c.a.i.RequestResponseChannel : connectionId[MF_5a8102_1640228421791] linkName[cbs]: Unable to open send and receive link. 
2021-12-23 14:28:39.763  WARN [parallel-1] c.a.c.a.i.RequestResponseChannel:$cbs : namespace[MF_5a8102_1640228421791] entityPath[$cbs]: Retry #1. Retry attempts exhausted or exception was not retriable. 
connectionId[MF_5a8102_1640228421791] linkName[cbs]: Unable to open send and receive link. 
2021-12-23 14:28:39.763  INFO [parallel-1] c.a.c.a.i.RequestResponseChannel:$cbs : namespace[MF_5a8102_1640228421791] entityPath[$cbs]: Error in AMQP channel processor. Notifying 1 subscribers. 
2021-12-23 14:28:39.763 ERROR [parallel-1] reactor.core.publisher.Operators : Operator called default onErrorDropped 
 
java.lang.RuntimeException: connectionId[MF_5a8102_1640228421791] linkName[cbs]: Unable to open send and receive link. 
	at com.azure.core.amqp.implementation.RequestResponseChannel.<init>(RequestResponseChannel.java:216) 
	at com.azure.core.amqp.implementation.ReactorConnection.lambda$createRequestResponseChannel$16(ReactorConnection.java:389) 
	at reactor.core.publisher.FluxMapFuseable$MapFuseableSubscriber.onNext(FluxMapFuseable.java:113) 
	at reactor.core.publisher.FluxMapFuseable$MapFuseableSubscriber.onNext(FluxMapFuseable.java:127) 
	at reactor.core.publisher.Operators$MonoSubscriber.request(Operators.java:1906) 
	at reactor.core.publisher.FluxMapFuseable$MapFuseableSubscriber.request(FluxMapFuseable.java:169) 
	at reactor.core.publisher.FluxMapFuseable$MapFuseableSubscriber.request(FluxMapFuseable.java:169) 
	at reactor.core.publisher.FluxPeekFuseable$PeekFuseableSubscriber.request(FluxPeekFuseable.java:144) 
	at reactor.core.publisher.Operators$MultiSubscriptionSubscriber.request(Operators.java:2158) 
	at com.azure.core.amqp.implementation.AmqpChannelProcessor.requestUpstream(AmqpChannelProcessor.java:311) 
	at com.azure.core.amqp.implementation.AmqpChannelProcessor.lambda$onNext$3(AmqpChannelProcessor.java:119) 
	at reactor.core.publisher.LambdaSubscriber.onComplete(LambdaSubscriber.java:132) 
	at reactor.core.publisher.EmitterProcessor.checkTerminated(EmitterProcessor.java:554) 
	at reactor.core.publisher.EmitterProcessor.drain(EmitterProcessor.java:415) 
	at reactor.core.publisher.EmitterProcessor.tryEmitComplete(EmitterProcessor.java:234) 
	at reactor.core.publisher.SinkManySerialized.tryEmitComplete(SinkManySerialized.java:64) 
	at reactor.core.publisher.InternalManySink.emitComplete(InternalManySink.java:68) 
	at com.azure.core.amqp.implementation.RequestResponseChannel.onTerminalState(RequestResponseChannel.java:429) 
	at com.azure.core.amqp.implementation.RequestResponseChannel.lambda$closeAsync$9(RequestResponseChannel.java:241) 
	at reactor.core.publisher.MonoRunnable.subscribe(MonoRunnable.java:49) 
	at reactor.core.publisher.Mono.subscribe(Mono.java:4338) 
	at reactor.core.publisher.FluxOnErrorResume$ResumeSubscriber.onError(FluxOnErrorResume.java:103) 
	at reactor.core.publisher.SerializedSubscriber.onError(SerializedSubscriber.java:124) 
	at reactor.core.publisher.SerializedSubscriber.onError(SerializedSubscriber.java:124) 
	at reactor.core.publisher.FluxTimeout$TimeoutMainSubscriber.handleTimeout(FluxTimeout.java:295) 
	at reactor.core.publisher.FluxTimeout$TimeoutMainSubscriber.doTimeout(FluxTimeout.java:280) 
	at reactor.core.publisher.FluxTimeout$TimeoutTimeoutSubscriber.onNext(FluxTimeout.java:419) 
	at reactor.core.publisher.FluxOnErrorResume$ResumeSubscriber.onNext(FluxOnErrorResume.java:79) 
	at reactor.core.publisher.MonoDelay$MonoDelayRunnable.propagateDelay(MonoDelay.java:271) 
	at reactor.core.publisher.MonoDelay$MonoDelayRunnable.run(MonoDelay.java:286) 
	at reactor.core.scheduler.SchedulerTask.call(SchedulerTask.java:68) 
	at reactor.core.scheduler.SchedulerTask.call(SchedulerTask.java:28) 
	at java.base/java.util.concurrent.FutureTask.run(Unknown Source) 
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(Unknown Source) 
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source) 
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source) 
	at java.base/java.lang.Thread.run(Unknown Source) 
Caused by: java.util.concurrent.RejectedExecutionException: ReactorDispatcher instance is closed. Should not continue dispatching work to this reactor. 
	at com.azure.core.amqp.implementation.ReactorDispatcher.throwIfSchedulerError(ReactorDispatcher.java:136) 
	at com.azure.core.amqp.implementation.ReactorDispatcher.invoke(ReactorDispatcher.java:100) 
	at com.azure.core.amqp.implementation.RequestResponseChannel.<init>(RequestResponseChannel.java:211) 
	... 36 common frames omitted 
```



- 2021-12-23 14:28:15.141 ERROR [reactor-executor-4] reactor.core.publisher.Operators : Operator called default onErrorDropped 

  ```
  2021-12-23 14:28:15.141 ERROR [reactor-executor-4] reactor.core.publisher.Operators : Operator called default onErrorDropped 
   
  reactor.core.Exceptions$ErrorCallbackNotImplemented: com.azure.core.amqp.exception.AmqpException: Connection reset by peer, errorContext[NAMESPACE: iothub-ns-uplusiothu-15464428-1c9f105fd7.servicebus.windows.net. ERROR CONTEXT: N/A] 
  Caused by: com.azure.core.amqp.exception.AmqpException: Connection reset by peer, errorContext[NAMESPACE: iothub-ns-uplusiothu-15464428-1c9f105fd7.servicebus.windows.net. ERROR CONTEXT: N/A] 
  	at com.azure.core.amqp.implementation.ExceptionUtil.toException(ExceptionUtil.java:85) 
  	at com.azure.core.amqp.implementation.handler.ConnectionHandler.notifyErrorContext(ConnectionHandler.java:325) 
  	at com.azure.core.amqp.implementation.handler.ConnectionHandler.onTransportError(ConnectionHandler.java:228) 
  	at org.apache.qpid.proton.engine.BaseHandler.handle(BaseHandler.java:191) 
  	at org.apache.qpid.proton.engine.impl.EventImpl.dispatch(EventImpl.java:108) 
  	at org.apache.qpid.proton.reactor.impl.ReactorImpl.dispatch(ReactorImpl.java:324) 
  	at org.apache.qpid.proton.reactor.impl.ReactorImpl.process(ReactorImpl.java:291) 
  	at com.azure.core.amqp.implementation.ReactorExecutor.run(ReactorExecutor.java:92) 
  	at reactor.core.scheduler.SchedulerTask.call(SchedulerTask.java:68) 
  	at reactor.core.scheduler.SchedulerTask.call(SchedulerTask.java:28) 
  	at java.base/java.util.concurrent.FutureTask.run(Unknown Source) 
  	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(Unknown Source) 
  	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source) 
  	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source) 
  	at java.base/java.lang.Thread.run(Unknown Source) 
  ```

  