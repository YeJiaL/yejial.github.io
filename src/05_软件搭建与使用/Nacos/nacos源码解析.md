







## 1.4.1



![image-20230116174043003](assets/image-20230116174043003.png)



![image-20230116174057507](assets/image-20230116174057507.png)





```
NacosConfigBootstrapConfiguration>NacosConfigManager>createConfigService>NacosFactory.createConfigService>constructor.newInstance(properties)>NacosConfigService(Properties properties)
```













![image-20230116134123027](assets/image-20230116134123027.png)

```
SpringApplication->applyInitializers>initializer.initialize(context)
	
	PropertySourceBootstrapConfiguration.class>initialize>source = locator.locateCollection(environment);>
	     data = this.configService.getConfig(dataId, group, this.timeout);
		
```



```
NacosConfigProperties
```





变更通知

```
AsyncNotifyService
```