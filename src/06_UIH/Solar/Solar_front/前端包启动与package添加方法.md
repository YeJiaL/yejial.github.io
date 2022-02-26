# 前端包启动与package添加方法

## yarn安装命令

 [yarn的安装与使用及与npm对应的命令](https://www.cnblogs.com/bluestorm/p/9814141.html)

 [yarn 基本用法](https://www.cnblogs.com/mengfangui/p/8953432.html)



> yarn add [package]==npm install --sava [package]



## 前端启动与增加包

> yarn add  包
>
> yarn start:local

```
const config = {
  define: {
    'process.env.authServerUrl': 'https://auth-admin-dev.uihcloud.cn/v1', //多租户登录认证服务地址(dev)
    'process.env.uapPortalWebUrl': 'https://portal-admin-dev.uihcloud.cn/', // 多租户首页(dev)
    'process.env.uapPortalUrl': 'https://portal-admin-dev.uihcloud.cn/portal-api/v1/', //多租户后端接口地址(dev)
    'process.env.apiService': 'http://10.3.13.171:8086', // 智能客服后台api地址
    'process.env.loginCallback': 'http://localhost:8003/auth/loginCallback',
    'process.env.silentRenewCallback': 'http://localhost:8003/auth/silentRenewCallback',
  },
};

export default config;

```

