# [SpringBoot集成Nacos](https://www.cnblogs.com/runningA/p/13654777.html)

> **一、环境说明**

1.CentOS7
2.Jdk1.8
3.Mysql5.7
4.Nacos1.3
5.SpringBoot2.3.1.RELEASE
6.Maven3.6



[NACOS多配置加载和共享配置](https://www.freesion.com/article/8623164910/)





window下单机启动

> startup.cmd -m standalone (https://so.csdn.net/so/search?q=cmd&spm=1001.2101.3001.7020
>
> curl -X POST "http://127.0.0.1:8848/nacos/v1/ns/instance?serviceName=nacos.naming.serviceName&ip=20.18.7.10&port=8080"
> curl -X GET "http://127.0.0.1:8848/nacos/v1/ns/instance/list?serviceName=nacos.naming.serviceName"
>
>
> curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test&content=tests1a: 123\n" + "tee: 123\n" + "abc: \"abc\""
>
> curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test&type=yaml&content=221111tests1abc:%20123%0Atee:%20123%0Aabc:%20%22abc%22"
> tests1:%20123%0Atee:%20123%0Aabc:%20%22abc%22





[window下搭建高可用nacos，nginx vip](https://huaweicloud.csdn.net/6356684fd3efff3090b5deaa.html?spm=1001.2101.3001.6650.3&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7Eactivity-3-123288507-blog-123565017.pc_relevant_3mothn_strategy_recovery&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7Eactivity-3-123288507-blog-123565017.pc_relevant_3mothn_strategy_recovery&utm_relevant_index=6)



 [Docker之nacos集群部署](https://blog.csdn.net/weixin_60389087/article/details/123097097?spm=1001.2101.3001.6650.6&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EOPENSEARCH%7ERate-6-123097097-blog-91775010.pc_relevant_recovery_v2&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EOPENSEARCH%7ERate-6-123097097-blog-91775010.pc_relevant_recovery_v2&utm_relevant_index=7)





## [docker从容器里面拷文件到宿主机或从宿主机拷文件到docker容器里面](https://www.cnblogs.com/areyouready/p/8973495.html)

1. 从容器里面拷文件到宿主机

   ```
   docker cp 容器名：要拷贝的文件在容器里面的路径       要拷贝到宿主机的相应路径 
   docker cp nacos_test:/root/nacos/target/nacos-server.jar /root/nacos/config/nacos-server.jar
   ```

   

2. 从宿主机拷文件到容器里面

```
docker cp /opt/test.js testtomcat：/usr/local/tomcat/webapps/test/js
```





集成了traefik

\\10.2.53.1\DAPENG_Publish\R14\nacos\20230518-182327.tar.gz



\\10.2.53.1\DAPENG_Publish\R14\nacos\20230518-182394.tar.gz