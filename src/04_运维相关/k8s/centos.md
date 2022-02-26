

[[_TOC_]]



# 环境安装



## vmware中安装centos





 [在VMware workstations中安装CentOS-7-x86_64-Everything-1611.ISO](https://blog.csdn.net/z69183787/article/details/79283308)



查看用户列表

> cat /etc/passwd|grep -v nologin|grep -v halt|grep -v shutdown|awk -F":" '{ print $1"|"$3"|"$4 }'|more



## docker安装





## 安装 Docker Compose

[安装 Docker Compose](http://get.daocloud.io/#install-docker)

```

Docker Compose 存放在Git Hub，不太稳定。
你可以也通过执行下面的命令，高速安装Docker Compose。

curl -L https://get.daocloud.io/docker/compose/releases/download/1.26.2/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose
```





```
1、rpm包安装的，可以用rpm -qa看到，如果要查找某软件包是否安装，用 rpm -qa | grep “软件或者包的名字”。

[root@hexuweb102 ~] rpm -qa | grep ruby

2、以deb包安装的，可以用dpkg -l能看到。如果是查找指定软件包，用dpkg -l | grep “软件或者包的名字”；

[root@hexuweb102~]dpkg-l|grepruby

3、yum方法安装的，可以用yum list installed查找，如果是查找指定包，命令后加 | grep “软件名或者包名”；

[root@hexuweb102 ~] yum list installed | grep ruby

4、如果是以源码包自己编译安装的，例如.tar.gz或者tar.bz2形式的，这个只能看可执行文件是否存在了，

上面两种方法都看不到这种源码形式安装的包。如果是以root用户安装的，可执行程序通常都在/sbin:/usr/bin目录下。

说明：其中rpm yum 是Redhat系linux的软件包管理命令，dpkg是debian系列的软件包管理命令
```

