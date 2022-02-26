[TOC]



# linuxCommand

## [linux解压命令](https://www.cnblogs.com/xin-jun/p/8461750.html)

```
.tar
解包：tar xvf FileName.tar
打包：tar cvf FileName.tar DirName
（注：tar是打包，不是压缩！）
———————————————
.gz
解压1：gunzip FileName.gz
解压2：gzip -d FileName.gz
压缩：gzip FileName

.tar.gz 和 .tgz
解压：tar zxvf FileName.tar.gz
压缩：tar zcvf FileName.tar.gz DirName
———————————————
.bz2
解压1：bzip2 -d FileName.bz2
解压2：bunzip2 FileName.bz2
压缩： bzip2 -z FileName

.tar.bz2
解压：tar jxvf FileName.tar.bz2
压缩：tar jcvf FileName.tar.bz2 DirName
———————————————
.bz
解压1：bzip2 -d FileName.bz
解压2：bunzip2 FileName.bz
压缩：未知

.tar.bz
解压：tar jxvf FileName.tar.bz
压缩：未知
———————————————
.Z
解压：uncompress FileName.Z
压缩：compress FileName
.tar.Z

解压：tar Zxvf FileName.tar.Z
压缩：tar Zcvf FileName.tar.Z DirName
———————————————
.zip
解压：unzip FileName.zip
压缩：zip FileName.zip DirName
———————————————
.rar
解压：rar x FileName.rar
压缩：rar a FileName.rar DirName
———————————————
.lha
解压：lha -e FileName.lha
压缩：lha -a FileName.lha FileName
———————————————
.rpm
解包：rpm2cpio FileName.rpm | cpio -div
———————————————
.deb
解包：ar p FileName.deb data.tar.gz | tar zxf -
———————————————
.tar .tgz .tar.gz .tar.Z .tar.bz .tar.bz2 .zip .cpio .rpm .deb .slp .arj .rar .ace .lha .lzh .lzx .lzs .arc .sda .sfx .lnx .zoo .cab .kar .cpt .pit .sit .sea
解压：sEx x FileName.*
压缩：sEx a FileName.* FileName

sEx只是调用相关程序，本身并无压缩、解压功能，请注意！

gzip 命令
减少文件大小有两个明显的好处，一是可以减少存储空间，二是通过网络传输文件时，可以减少传输的时间。gzip 是在 Linux 系统中经常使用的一个对文件进行压缩和解压缩的命令，既方便又好用。

语法：gzip [选项] 压缩（解压缩）的文件名该命令的各选项含义如下：

-c 将输出写到标准输出上，并保留原有文件。-d 将压缩文件解压。-l 对每个压缩文件，显示下列字段： 压缩文件的大小；未压缩文件的大小；压缩比；未压缩文件的名字-r 递归式地查找指定目录并压缩其中的所有文件或者是解压缩。-t 测试，检查压缩文件是否完整。-v 对每一个压缩和解压的文件，显示文件名和压缩比。-num 用指定的数字 num 调整压缩的速度，-1 或 --fast 表示最快压缩方法（低压缩比），-9 或--best表示最慢压缩方法（高压缩比）。系统缺省值为 6。指令实例：

gzip *% 把当前目录下的每个文件压缩成 .gz 文件。gzip -dv *% 把当前目录下每个压缩的文件解压，并列出详细的信息。gzip -l *% 详细显示例1中每个压缩的文件的信息，并不解压。gzip usr.tar% 压缩 tar 备份文件 usr.tar，此时压缩文件的扩展名为.tar.gz。
```

## 文件命令

### 删除命令

```
rm -rf /var/log/httpd/access 将会删除/var/log/httpd/access目录以及其下所有文件、文件夹  
！！慎重
rm -rf * 删除当前文件夹下的所有文件和文件夹
rm -f filename
mkdir 
创建文件 touch
```



### 复制命令

```

1、将一个文件夹下的所有内容复制到另一个文件夹下
cp -r /home/packageA/* /home/cp/packageB/
或
cp -r /home/packageA/. /home/cp/packageB/

2、将一个文件夹复制到另一个文件夹下
cp -r /home/packageA /home/packageB

运行命令之后packageB文件夹下就有packageA文件夹了。
```

### 重命名

```
例子：将目录A重命名为B

mv A B

例子：将/a目录移动到/b下，并重命名为c

mv /a /b/c
```



## vim命令

```
How to exit the Vim editor?

点击ESC进入“正常模式”，然后输入“:”，进入“命令模式”。此时屏幕的下方会出现一个冒号，你可以输入以下命令，并按“ENTER”执行：

:q ，退出（:quit的缩写）

:q!，退出且不保存（:quit!的缩写）

:wq，保存并退出

:wq!，保存并退出即使文件没有写入权限（强制保存退出）

:x，保存并退出（类似:wq，但是只有在有更改的情况下才保存）

:exit，保存并退出（和:x相同）

:qa，退出所有(:quitall的缩写)

:cq，退出且不保存（即便有错误）

你也可以直接在“正常模式”下输入“ZZ”来保存并退出Vim（和:x相同），或者“ZQ”不保存并退出（和:q!相同）注意此处ZZ大写和小写是完全不同的。

Vim还有一个帮助菜单，可以通过“:help”调出来，基本能够解决你的绝大多数问题
```



## 查看文件大小

```
du -h ljl.txt
```



## 返回上一级目录

```
cd -  

 

-  ==  $OLDPWD

可以 echo $OLDPWD查看

cd -   ==   cd $OLDPWD
```



## ctrl键+esc组合

```
ctrl+a:光标移到行首。

ctrl+b:光标左移一个字母

ctrl+c:杀死当前进程。

ctrl+d:退出当前 Shell。

ctrl+e:光标移到行尾。

ctrl+h:删除光标前一个字符，同 backspace 键相同。

ctrl+k:清除光标后至行尾的内容。

ctrl+l:清屏，相当于clear。

ctrl+r:搜索之前打过的命令。会有一个提示，根据你输入的关键字进行搜索bash的history

ctrl+u: 清除光标前至行首间的所有内容。

ctrl+w: 移除光标前的一个单词

ctrl+t: 交换光标位置前的两个字符

ctrl+y: 粘贴或者恢复上次的删除

ctrl+d: 删除光标所在字母;注意和backspace以及ctrl+h的区别，这2个是删除光标前的字符

ctrl+f: 光标右移

ctrl+z : 把当前进程转到后台运行，使用’ fg ‘命令恢复。比如top -d1 然后ctrl+z ，到后台，然后fg,重新恢复

esc组合

esc+d: 删除光标后的一个词

esc+f: 往右跳一个词

esc+b: 往左跳一个词

esc+t: 交换光标位置前的两个单词
```

