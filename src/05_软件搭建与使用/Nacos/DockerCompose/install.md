[TOC]



# docker下nacos安装

## 运行环境

- 需安装docker环境，版本 19+

## 注意事项

- U+针对nacos做了部分增强性功能（目前nacos版本是2.1.0）
- 第一次启动Nacos前需要手动初始化 数据库common_nacos.sql和ddl_v1.sql
- 

## 安装步骤

### Standalone

1. 在mysql数据中执行common_nacos.sql和ddl_v1.sql初始化脚本
2. 定位到standalone文件夹，执行 sh install_standalone.sh
3. 打开 http://docker-host-ip:30122/nacos ，用户名/密码为 nacos/nacos

![image-20221101120201926](install.assets/image-20221101120201926.png)

### 集群模式

1. 在mysql数据中执行common_nacos.sql和ddl_v1.sql初始化脚本
2. 定位到install_cluster文件夹，执行 sh install_cluster.sh
3. 查看log，有图中所示即代表集群模式成功

![image-20221101115940026](install.assets/image-20221101115940026.png)



