# Git提交branch到remote



1. 远程已有branch1分支, 并且已经关联本地分支branch1,已经切换到branch1了。

   git push

2. 远程已有branch1分支但未关联本地分支branch1，本地已经在branch1上

    git push -u origin/branch1

3. 远程还没有有remote_branch2分支并，本地已经在local_branch2，现在要提交到创建远程的remote_branch2分支。

   git push origin local_branch2:remote_branch2