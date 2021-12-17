## docker

Ubuntu 14.04.1

### dockerfile

```
FROM java:8
COPY robot-api.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","app.jar"]
```



service  docker status



```
docker images 
docker image rm imageid  //删除某个imageid

  docker build -t my/demo .  //注意后面有个.


 docker rmi $(docker images -f "dangling=true" -q) //我们在不断构建的时候，会出现或名称或标签为 none 的无用镜像，我们可以删除它

docker rm containid //删除容器

docker ps -a //看到本机上存在的所有容器
 
docker ps -a -q //列出当前运行的容器， -a 会列出所有，包括已停止的， -q 只列出容器 ID，使用如下命令：

docker ps -a -q | xargs docker rm //删除所有未运行的容器，使用如下命令：
 
docker run -it --name=jialinye/test . //注意后面有个.
 
docker run -d --name test -p 8086:8086 jialinye/test


docker logs --tail  300 -f  test  //查看启动日志,test为容器名称

 docker update –-restart=always test   //已经运行的docker容器怎么设置自动重启 test为容器名称
 
```





> docker exec –it mycat /bin/bash  //mycat为名称，进入一个running状态的容器



### docker-compose安装

http://get.daocloud.io/   





### docker进入，退出容器命令

```
进入容器命令：

docker attach 容器ID
或者

docker exec -it 容器ID /bin/bash 
或者

docker exec -it 容器的name bash
退出容器命令

exit
或者

Ctrl+P+Q
```



### docker启动命令

```
docker ps -a　查看本地所有运行的容器
docker ps        产看正在运行的容器
docker start 容器id 运行容器
docker rm 容器id    移出容器


docker ps // 查看所有正在运行容器
$ docker stop containerId // containerId 是容器的ID

$ docker ps -a // 查看所有容器
$ docker ps -a -q // 查看所有容器ID

$ docker stop $(docker ps -a -q) //  stop停止所有容器
$ docker  rm $(docker ps -a -q) //   remove删除所有容器
```



参考-[莫小安Docker-compose常用命令 - 特别实用](https://www.cnblogs.com/moxiaoan/p/9299404.html)