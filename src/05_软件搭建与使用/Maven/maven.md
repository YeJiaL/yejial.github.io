# maven的package与install命令区别

```
maven install 是将打好的jar包安装到本地库中，一般没有设置过是在 用户目录下的 .m2\下面。
maven package 只是将你的代码打包到输出目录，一般的是 target下面。

mvn -X dependency:tree>tree.txt
mvn dependency:tree -Dverbose -Dincludes=commons-collections 查看冲突
mvn dependency:tree -Dincludes=jline
mvn -X -U clean package
```

