# spring

 [Spring Bean的生命周期（非常详细）](https://www.cnblogs.com/zrtqsk/p/3735273.html)

![image-20220105144315734](spring.assets/image-20220105144315734.png)





[九次beanprocess][https://www.cnblogs.com/wl20200316/p/12560920.html]

[Spring 源码之 强大的后置处理器][https://juejin.cn/post/6847902215571505160]

 [springboot aop 自定义注解方式实现完善日志记录（完整源码）](https://www.cnblogs.com/wenjunwei/p/9639909.html)







[如何记忆 Spring Bean 的生命周期](https://juejin.cn/post/6844904065457979405)





[ Spring IOC详解及Bean生命周期详细过程，看完直接吊打面试官](https://juejin.cn/post/6966158157202587662)





# Springboot配置文件的加载顺序、外部配置加载顺序



配置文件的加载顺序
Springboot启动会扫描以下位置的application.properties或者application.yml文件作为Springboot的默认配置文件。
-file: /config/
-file: ./
-classpath: /config/
-classpath: /
以上是按照优先级从高到低的顺序，所有位置的文件都会被加载，高优先级配置内容会覆盖低优先级配置内容。
也可以通过配置spring.config.location来改变默认配置

外部配置加载顺序
1、命令行参数
2、来自java:comp/env的JNDI属性
3、Java系统属性（System.getProperties()）
4、操作系统环境变量
5、RandomValuePropertySource配置的random.*属性值
6、jar包外部的application-{profile}.properties或application.yml（带spirng.profile）配置文件
7、jar包内部的application-{profile}.properties或application.yml（带spirng.profile）配置文件
8、jar包外部的application.properties或application.yml（不带spirng.profile）配置文件
9、jar包内部的application.properties或application.yml（不带spirng.profile）配置文件
10、@Configuration注解类上的@PropertySource
11、通过SpringApplication.setDefaultProperties指定的默认属性
————————————————
版权声明：本文为CSDN博主「学习不易」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_43656233/article/details/104536856