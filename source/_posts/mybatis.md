
---
title: mybatis
date: 2020-12-04 14:33:11
categories:
- Diary
tags:
- PS3
- Game
---
## 使用 Wrapper 自定义SQL



官网链接：https://baomidou.com/guide/wrapper.html#setsql



网上解析部分：https://www.cnblogs.com/lyf906522290/p/13224568.html?utm_source=tuicool





```
select @@tx_isolation 事务级别
```



> ### 5.3、使用MySQL数据库演示不同隔离级别下的并发问题
>
> 　　同时打开两个窗口模拟2个用户并发访问数据库
>
> 1、当把事务的隔离级别设置为read uncommitted时，会引发脏读、不可重复读和虚读
>
> 　　A窗口
> 　　　　set transaction isolation level read uncommitted;--设置A用户的数据库隔离级别为Read uncommitted(读未提交)
> 　　　　start transaction;--开启事务
> 　　　　select * from account;--查询A账户中现有的钱，转到B窗口进行操作
> 　　　　select * from account--发现a多了100元，这时候A读到了B未提交的数据（脏读）
>
> 　　B窗口
> 　　　　start transaction;--开启事务
> 　　　　update account set money=money+100 where name='A';--不要提交，转到A窗口查询
>
> 2、当把事务的隔离级别设置为read committed时，会引发不可重复读和虚读，但避免了脏读
>
> 　　A窗口
> 　　　　set transaction isolation level read committed;
> 　　　　start transaction;
> 　　　　select * from account;--发现a帐户是1000元，转到b窗口
> 　　　　select * from account;--发现a帐户多了100,这时候，a读到了别的事务提交的数据，两次读取a帐户读到的是不同的结果（不可重复读）
> 　　B窗口
> 　　　　start transaction;
> 　　　　update account set money=money+100 where name='aaa';
> 　　　　commit;--转到a窗口
>
> 3、当把事务的隔离级别设置为repeatable read(mysql默认级别)时，会引发虚读，但避免了脏读、不可重复读
>
> 　　A窗口
> 　　　　set transaction isolation level repeatable read;
> 　　　　start transaction;
> 　　　　select * from account;--发现表有4个记录，转到b窗口
> 　　　　select * from account;--可能发现表有5条记录，这时候发生了a读取到另外一个事务插入的数据（虚读）
> 　　B窗口
> 　　　　start transaction;
> 　　　　insert into account(name,money) values('ggg',1000);
> 　　　　commit;--转到a窗口
>
> 4、当把事务的隔离级别设置为Serializable时，会避免所有问题
>
> 　　A窗口
> 　　　　set transaction isolation level Serializable;
> 　　　　start transaction;
> 　　　　select * from account;--转到b窗口
>
> 　　B窗口
> 　　　　start transaction;
> 　　　　insert into account(name,money) values('ggg',1000);--发现不能插入，只能等待a结束事务才能插入