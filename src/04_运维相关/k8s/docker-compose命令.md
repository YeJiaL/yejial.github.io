docker-compose 命令

```
#构建建启动nignx容器
docker-compose up -d nginx                     

#进入nginx容器中
docker-compose exec nginx bash            

#将会停止UP命令启动的容器，并删除容器
docker-compose down                             

#显示所有容器
docker-compose ps                                   

#重新启动nginx容器
docker-compose restart nginx                   

#构建镜像
docker-compose build nginx      

#不带缓存的构建
docker-compose build --no-cache nginx 

#查看nginx的日志
docker-compose logs  nginx                      

#查看nginx的实时日志
docker-compose logs -f nginx                   

#验证（docker-compose.yml）文件配置，
#当配置正确时，不输出任何内容，当文件配置错误，输出错误信息
docker-compose config  -q                        

#以json的形式输出nginx的docker日志
docker-compose events --json nginx       

#暂停nignx容器
docker-compose pause nginx                 

#恢复ningx容器
docker-compose unpause nginx             

#删除容器
docker-compose rm nginx                       

#停止nignx容器
docker-compose stop nginx                    

#启动nignx容器
docker-compose start nginx
```



参考-[莫小安Docker-compose常用命令 - 特别实用](https://www.cnblogs.com/moxiaoan/p/9299404.html)



 [Docker Compose](https://www.cnblogs.com/wtzbk/p/15125977.html)系列文章