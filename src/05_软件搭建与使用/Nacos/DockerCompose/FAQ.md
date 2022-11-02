## Nacos常规问题

#### Nacos是什么

Nacos 致力于帮助您发现、配置和管理微服务。Nacos 提供了一组简单易用的特性集，帮助您快速实现动态服务发现、服务配置、服务元数据及流量管理。详情可以参考[Nacos官网介绍](https://nacos.io/zh-cn/docs/what-is-nacos.html)。

#### Nacos如何支持多环境

在日常使用中常常需要不同的环境，比如日常，预发，线上环境，如果是逻辑隔离可以使用命名空间，Nacos支持命名空间来支持多环境隔离，可以在Nacos控制台创建多个命名空间。如果需要物理隔离，就要部署多套Nacos环境。

#### Nacos是否生产可用

Nacos在2019.1发布了Pre-GA版本，支持了安全隔离、监控和服务迁移等上生产的最后一公里，以更稳定的支撑用户的生产环境。详情可以参考[Nacos 发布 v0.8.0 Pre-GA 版本，安全稳定上生产](https://www.oschina.net/news/104019/nacos-0-8-0-pre-ga)。

#### Nacos版本计划

Nacos 0.8.0 开始支持生产可用，1.0版本达到大规模生产可用，2.0版本计划与K8s、Spring Cloud、Service Mesh、Serverless进一步融合，具体的详情参考[Nacos规划](https://nacos.io/zh-cn/docs/roadmap.html)。

#### Nacos有什么依赖

在单机模式下，Nacos没有任何依赖，在集群模式下，Nacos依赖Mysql做存储，详情可以参考[Nacos部署](https://nacos.io/zh-cn/docs/deployment.html)。

#### Nacos使用什么开源协议

Nacos使用[Apache 2.0](https://github.com/alibaba/nacos/blob/master/LICENSE)。