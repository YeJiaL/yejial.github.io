# Git使用技巧



## Git提交branch到remote

1. 远程已有branch1分支, 并且已经关联本地分支branch1,已经切换到branch1了。

   > git push

2. 远程已有branch1分支但未关联本地分支branch1，本地已经在branch1上

    > git push -u origin/branch1

    

3. 远程还没有有remote_branch2分支并，本地已经在local_branch2，现在要提交到创建远程的remote_branch2分支。

   > git push origin local_branch2:remote_branch2
   >
   > git push origin 本地分支名:远程分支名 （例如 git push origin Develop:Develop）
   >
   >  git push gitee hexo 可行

$ **git push** origin test:master     // 提交本地test分支作为远程的master分支 //好像只写这一句，远程的github就会自动创建一个test分支
$ **git push** origin test:test       // 提交本地test分支作为远程的test分支

如果想删除远程的分支呢？类似于上面，如果:左边的分支为空，那么将删除:右边的远程的分支。

$ **git push** origin :test       // 刚提交到远程的test将被删除，但是本地还会保存的，不用担心

## 合并上一次提交

```
git commit -a --amend
```

