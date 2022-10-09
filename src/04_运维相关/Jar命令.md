





# Jar命令解压缩文件的方法

```
1. 在命令提示符窗口中输入 jar 可以列出 所有Jar 命令的用法；

2.创建 jar 文件： jar -cvf ___.jar ___ 然后回车即可 （第一个空格写上压缩后的文件名， 第二个空格写要压缩的目标文件;

3.解压Jar文件： jar -xvf ____.jar 然后回车即可;

4.查看Jar文件内容：jar -tvf ___.jar 然后回车即可;

5.查看jdk 文件中 rt.jar 文件： jar -tvf rt.jar >1.txt 然后回车即可;

6.压缩两个文件到同一Jar文件中：jar -cvf ___.jar ___ ___ 然后回车即可;
————————————————
版权声明：本文为CSDN博主「llqyhl」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/llqyhl/article/details/84536666
```





inux后台执行adminjar文件并将日志打印到admin.log的命令是 ：

> nohup java -jar admin.jar -> admin.log &