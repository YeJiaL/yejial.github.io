Failed to delete  [WinError 5] 拒绝访问python 





 **已有功能不要写在验收标准里面**





## 使用方法

### 安装

1. 检测config中的配置是否正确(若使用configMap，查看configMap中配置是否正确)
2. 进入安装解压文件夹script文件夹中：`sh install.sh` 

### 卸载

1. 检测config中的配置是否正确

2. 进入安装解压文件夹script文件夹中：`sh install.sh` 

   


## 异常状况

| 描述                                                         | 情况说明                                |
| ------------------------------------------------------------ | --------------------------------------- |
| kubectl 未找到，请先安装 kubectl！                           | k8s环境未安装，检测k8s使用环境          |
| helm 未找到，请先安装 helm！                                 | helm环境未安装，检测helm使用环境        |
| Traefik 未找到，请先安装 Traefik！                           | Traefik 环境未安装，检测Traefik使用环境 |
| mysql client  pull failed                                    | mysql镜像拉取失败，检测相关配置         |
| mysql install failed                                         | 数据库脚本安装失败，联系开发人员        |
| docker push xxx failed                                       | 离线push到本地harber失败，检测相关配置  |
| xxx healthy_check failed                                     | 健康检查安装失败，联系开发人员          |
| namespace=xx,release_name=xx no app                          | 当前环境不存在卸载的app                 |
| error:the server doesn't have a resource type "cm"<br />error:the server doesn't have a resource type "secrets" | 未执行kubectl apply -f cm.yaml          |





开发模式

人员组织与架构

晋升制度


