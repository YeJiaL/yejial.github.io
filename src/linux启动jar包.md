[TOC]



# 目录

## linux下启动jar包

```
java -jar XXX.jar
 
 
java -jar XXX.jar &
 
 
nohup java -jar XXX.jar &
 
 
nohup java -jar XXX.jar >temp.txt &



nohup java -jar robot-api-0.0.1-SNAPSHOT.jar & （推荐使用这种）

nohup java -jar robot-api-0.0.1-SNAPSHOT.jar >temp.log &

nohup java -jar robot-api-0.0.1-SNAPSHOT.jar --spring.config.location=/usr/local/mapp/temp/test2/application.yml >temp.log &

nohup java -jar robot-api-0.0.1-SNAPSHOT.jar --spring.config.location=/usr/local/mapp/temp/application-dev.yml >temp.log &

nohup java -jar robot-api-0.0.1-SNAPSHOT.jar --spring.config.location=/usr/local/mapp/temp3/application-dev.yml >temp.log &

nohup java -jar robot-api-0.0.1-SNAPSHOT.jar --spring.config.location=/usr/local/mapp/temp2/application.yml >temp.log &

/bin/elasticsearch-d

```



## 查询端口号

```
ps aux|grep robot-api-0.0.1-SNAPSHOT.jar 
kill -9 pid
```



## linux下后台启动执行es及head

```
再次执行./elasticsearch -d即可启动 
.bin/elasticsearch -d
使用ps aux|grep elasticsearch可以查看是否启动 
```

linux下后台启动执行eshead

```
nohup npm run start &
```

## linux系统根据端口号查找项目路径的两种方法

```
netstat -nlp|grep :8086
netstat -lnp | grep 8086
netstat -lnp|grep 8086
```

```
1、如果知道项目部署在tomcat里
		ps -ef|grep 44629
2、只知道端口号
		（1） 首先根据端口号查找进程 
			比如我要找端口为 10010 的项目，那输入如下命令
			netstat -apn|grep 10010
			
	    （2）然后根据进程号去查找项目路径
		ll /proc/44629（44629是进程好）
		cwd->
		
			其中 44629 即是当前10010 端口所占用的进程号
			ps -ef|grep 44629
		（3）如果你第二步没有找到项目路径的话 实在是找不到，那用下边这个，反正我是找到了。
			lsof -p 44629
```



## docker

```
docker log
	docker logs -f --tail=100 bd338a9a92d0
	docker logs -f

docker images
docker imi imageid
docker im containId
docker ps -a
docker build -t 10.6.5.152/com.uih.uplus/chatbot-intelligent .

docker-compose up -d
docker-compose up
docker-compose ps(查看文件夹中所有容器)
```

## 查看ik分词器是否安装成功

```
post：http://localhost:9200/blog1/_analyze    

{
   "text":"中华人民共和国MN","tokenizer": "ik_max_word"
}
{
  "analyzer": "ik_smart",
  "text": "中华人民共和国国歌"
}
```





## es

> (1）添加别名
>
>   ```
> client.admin().indices().prepareAliases().addAlias("my_index_v1","my_index");
>   ```
>
> 
>
> （2）移除别名
>
>         client.admin().indices().prepareAliases().removeAlias("my_index_v1","my_index");
> 
> （3）删除一个别名后再添加一个
>
> ```
> client.admin().indices().prepareAliases().removeAlias("my_index_v1","my_index")
>                 .addAlias("my_index_v2","my_index").execute().actionGet();
> ```
>
> 
>
> 当别名添加完毕后，我们在删除，搜索，更新都可以直接使用：
>
>  SearchRequestBuilder search=client.prepareSearch("my_index");
>
>  

### es 注解查询

>      @Query("{\"bool\": {\"must\": [{\"field\": {\"name\": \"?0\"}}]}}")
>     //@Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}")
>     Page<EsBusinessModel> findByQuestion( String question, Pageable page);



## VmWare

```
图形界面到dos命令行：ctrl+alt+f2
dos命令行到图形界面：输入startx
```

