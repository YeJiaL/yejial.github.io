https://blog.csdn.net/bai_shuang/article/details/122939884 

alter user user() identified by "Max1qaz@WSX";



linux下，在mysql正常运行的情况下，输入mysql提示：
mysql command not found

遇上-bash: mysql: command not found的情况别着急，这个是因为/usr/local/bin目录下缺失mysql导致，只需要一下方法建立软链接，即可以解决：
把mysql安装目录，比如MYSQLPATH/bin/mysql，映射到/usr/local/bin目录下：
\# cd /usr/local/bin
\# ln -fs /MYSQLPATH/bin/mysql mysql







1. 解压Hotfix包（只需要在安装程序的节点上执行hotfix包即可。保证安装节点配置文件在/usr/src/uih_gateway/config.ini,ansible配置在/usr/src/uih_gateway/uih_gateway/inventory.ini）

2. 直接进入 Hotfix-UIHAPIGateway-R12SP2M5-R001.0.5.155247-Re-20230414 目录;cd Hotfix-UIHAPIGateway-R12SP2M5-R001.0.5.155247-Re-20230414(以Hotfix-UIHAPIGateway-R12SP2M5-R001.0.5.155247-Re-20230414为例)

3. cd /usr/src/Hotfix-UIHAPIGateway-R12SP2M5-R001.0.5.155247-Re-20230414/目录下，chmod +x execute.sh,chmod +x rollback.sh,执行补丁升级脚本;sh execute.sh

4. 等待补丁包的安装

5. 安装完毕,检查/usr/local/backup_apigateway/backup.hotfix_20230322.tar.gz 是否有此备份文件

6. 请访问API网关集成配置平台9996,进入9996（注意若是高可用，每台机器都要进入）中，先取消预约Appoint,叫号QueueAPI二个服务的勾选（若配置），“生成拓扑”，再“保存”，再重新添加预约Appoint,叫号QueueAPI进行配置，“生成拓扑”，再“保存”，再“重启”

   

7. 注意其中子路径的设置配置文件在/usr/local/apigateway/subpath.ini（针对已支持子路径的系统设为true,否则设置为false，默认预约，叫号开启，后面若有子系统支持，可手动调整）
