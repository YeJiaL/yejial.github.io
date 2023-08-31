Windows下如何查看某个端口被谁占用https://www.runoob.com/w3cnote/windows-finds-port-usage.html

如何查询 Windows 环境下的端口占用？https://blog.csdn.net/weixin_43518498/article/details/126612283





```
C:\Users\jialin.ye>netstat -ano|findstr 8848
  TCP    0.0.0.0:8848           0.0.0.0:0              LISTENING       30540
  TCP    [::]:8848              [::]:0                 LISTENING       30540

C:\Users\jialin.ye>netstat -ano|findstr 8848
  TCP    0.0.0.0:8848           0.0.0.0:0              LISTENING       30540
  TCP    [::]:8848              [::]:0                 LISTENING       30540

C:\Users\jialin.ye>netstat -ano|findstr 8848
  TCP    0.0.0.0:8848           0.0.0.0:0              LISTENING       30540
  TCP    [::]:8848              [::]:0                 LISTENING       30540

C:\Users\jialin.ye>tasklist|findstr 30540
javaw.exe                    30540 Console                    1    136,044 K

C:\Users\jialin.ye>taskkill -pid 30540 -f
成功: 已终止 PID 为 30540 的进程。

C:\Users\jialin.ye>netstat -ano|findstr 8848

C:\Users\jialin.ye>
```





可打开window任务管理器查找pid=30540的程序

