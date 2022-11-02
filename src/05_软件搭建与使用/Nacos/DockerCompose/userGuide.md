

ref:https://navi.united-imaging.com/uGalaxy/UCloud/_wiki/wikis/UCloud.wiki/1508/11.-common-nacos





### 接入规范

1. 命名空间为upacs-{env name}，使用不同的命名空间区分不同环境的配置项

1. 配置项的 data id **应使用****子系统****的名称作为前缀**，group为UPACS，data id 推荐不包含文件类型后缀，data id 推荐使用小写字符

1. 针对dev环境的配置统一在upacs-dev命名空间下进行配置，命名采用“产品名-配置名-环境名”的格式，如ris-appsettings-dev

| 命名空间  | 子系统 | 配置项 data id      | 对应配置            |
| --------- | ------ | ------------------- | ------------------- |
| upacs-dev | ris    | ris-appsettings-dev | appsettings-dev.yml |
| upacs-sit | ris    | ris-appsettings-sit | appsettings-sit.yml |



# 基本概念

1. nacos 是阿里开源的一款管理微服务的组件,提供了一组简单易用的特性集，帮助您快速实现动态服务发现、服务配置、服务元数据及流量管理.[官方网址](https://nacos.io/zh-cn/docs/what-is-nacos.html) 
2. common-nacos 是基于 naocs 进行一些二次开发,使其更适合联影的业务场景,详细可以参考 [改造说明WIKI](https://navi.united-imaging.com/UplusTestCollection/UCloud/_wiki/wikis/UCloud.wiki/1622/common-nacos-改造说明)

# 运维规范说明

1. dev 和 生产环境账号信息隔离,生产环境的写权限账号信息由运维掌管,生产环境的配置修改需要运维的同事来操作,读权限可以根据需要开放
 2. 账号的创建,权限的分配由运维来操作

 3. Namespace 的创建要和 [CICD环境信息](https://navi.united-imaging.com/UplusTestCollection/UCloud/_wiki/wikis/UCloud.wiki/344/CICD环境信息)中的 **命名空间/环境编码** 保持一致

4. nacos 数据库需要每天备份

# 开发相关命名规范

## 1. Nacos的数据模型与SpringBoot的对应关系

![image.png](https://navi.united-imaging.com/uGalaxy/b7a8ee72-c9aa-4962-91e2-48bcf3f4f10f/_apis/git/repositories/d9d1d5a9-4794-4e6b-b629-154a88520079/Items?path=%2F.attachments%2Fimage-b3b21414-66cc-453c-97dd-74cac2f90eec.png&download=false&resolveLfs=true&%24format=octetStream&api-version=5.0-preview.1&sanitize=true&versionDescriptor.version=wikiMaster)

## 2. 在运维配置Value文件中指定Profile的value

![image.png](https://navi.united-imaging.com/uGalaxy/b7a8ee72-c9aa-4962-91e2-48bcf3f4f10f/_apis/git/repositories/d9d1d5a9-4794-4e6b-b629-154a88520079/Items?path=%2F.attachments%2Fimage-750ea37f-60b1-40a1-8f3e-de9191805994.png&download=false&resolveLfs=true&%24format=octetStream&api-version=5.0-preview.1&sanitize=true&versionDescriptor.version=wikiMaster)

# 权限操作说明

1. 运维同学在新增授权的时候需要给角色指定所属组,不同的组配置是隔离的
   ![image.png](https://navi.united-imaging.com/uGalaxy/b7a8ee72-c9aa-4962-91e2-48bcf3f4f10f/_apis/git/repositories/d9d1d5a9-4794-4e6b-b629-154a88520079/Items?path=%2F.attachments%2Fimage-09891677-4437-4b8f-afef-8c0eb52424c8.png&download=false&resolveLfs=true&%24format=octetStream&api-version=5.0-preview.1&sanitize=true&versionDescriptor.version=wikiMaster)
2. 目前正在使用的权限是没有组概念的,所以所属组都为空,这个需要Scrum 提出设置所属组需求
   然后运维的同学先添加所属组,然后将组为空的权限删除即可,
   ![image.png](https://navi.united-imaging.com/uGalaxy/b7a8ee72-c9aa-4962-91e2-48bcf3f4f10f/_apis/git/repositories/d9d1d5a9-4794-4e6b-b629-154a88520079/Items?path=%2F.attachments%2Fimage-e568e5ce-0155-45de-becf-ca1c64a639fb.png&download=false&resolveLfs=true&%24format=octetStream&api-version=5.0-preview.1&sanitize=true&versionDescriptor.version=wikiMaster)
   ,详细见附录1现有配置迁移指南
3. 之前创建了很多不在 CICD环境信息 中的命名空间,待Scrum team 都迁移到 CICD环境的命名空间以后进行删除

# 注册中心使用

![image.png](https://navi.united-imaging.com/uGalaxy/b7a8ee72-c9aa-4962-91e2-48bcf3f4f10f/_apis/git/repositories/d9d1d5a9-4794-4e6b-b629-154a88520079/Items?path=%2F.attachments%2Fimage-8aff2e53-f723-48a6-88e3-e868ffdd045d.png&download=false&resolveLfs=true&%24format=octetStream&api-version=5.0-preview.1&sanitize=true&versionDescriptor.version=wikiMaster)

# 配置中心使用

![image.png](https://navi.united-imaging.com/uGalaxy/b7a8ee72-c9aa-4962-91e2-48bcf3f4f10f/_apis/git/repositories/d9d1d5a9-4794-4e6b-b629-154a88520079/Items?path=%2F.attachments%2Fimage-0d1589a2-e369-480d-9579-1ae811ccb726.png&download=false&resolveLfs=true&%24format=octetStream&api-version=5.0-preview.1&sanitize=true&versionDescriptor.version=wikiMaster)







#### 如何依赖最新的Nacos客户端？

很多用户都是通过Spring Cloud Alibaba或者Dubbo依赖的Nacos客户端，那么Spring Cloud Alibaba和Dubbo中依赖的Nacos客户端版本，往往会落后于Nacos最新发布的版本。在一些情况下，用户需要强制将Nacos客户端升级到最新，此时却往往不知道该升级哪个依赖，这里将Spring Cloud Alibaba和Dubbo的依赖升级说明如下：

##### Spring Cloud Alibaba

用户通常是配置以下Maven依赖来使用的Nacos：

```xml
<!--Nacos Discovery-->
<dependency>
     <groupId>com.alibaba.cloud</groupId>
     <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
     <version>[latest version]</version>
 </dependency>

<!--Nacos Config-->
<dependency>
     <groupId>com.alibaba.cloud</groupId>
     <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
     <version>[latest version]</version>
 </dependency>
```

这两个jar包实际上又依赖了以下的jar包：

```xml
<dependency>
  <groupId>com.alibaba.nacos</groupId>
  <artifactId>nacos-client</artifactId>
  <version>[a particular version]</version>
</dependency>
```

如果nacos-client升级了，对应的spring-cloud客户端版本不一定也同步升级，这个时候可以采用如下的方式强制升级nacos-client（以nacos-discovery为例）：

```xml
<dependency>
     <groupId>com.alibaba.cloud</groupId>
     <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
     <version>[latest version]</version>
     <excludes>
          <exclude>
                 <groupId>com.alibaba.nacos</groupId>
                 <artifactId>nacos-client</artifactId>
          </exclude>
     </excludes>
 </dependency>

<dependency>
  <groupId>com.alibaba.nacos</groupId>
  <artifactId>nacos-client</artifactId>
  <version>[latest version]</version>
</dependency>
```

##### Dubbo

Dubbo也是类似的道理，用户通常引入的是以下的依赖：

```xml
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>dubbo-registry-nacos</artifactId>
        <version>[latest version]</version>
    </dependency>   
    
    <!-- Dubbo dependency -->
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>dubbo</artifactId>
        <version>[latest version]</version>
    </dependency>
```

需要升级Nacos客户端时，只需要如下修改依赖：

```xml
 <dependency>
  <groupId>com.alibaba.nacos</groupId>
  <artifactId>nacos-client</artifactId>
  <version>[latest version]</version>
</dependency>
```