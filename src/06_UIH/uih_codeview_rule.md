

# DIM修复填写规范

```
Problem Analysis:填写发生问题的原因分析
Solved Solution:填写该DIM的解决方案或解决步骤
Impact Analysis:填写解决该DIM可能造成的其他影响
Solved Version:解决版本
Test Instruction:如适用,填写需要提供给验证者的说明
Unit Test Case No./Name:如适用,填写单元测试的ID号
Changeset Number : 变更号,仅对软件适用.硬件不适用

Problem Analysis:初始化脚本调整
Solved Solution:去除8026对外暴露端口
Impact Analysis:N/A
Solved Version:develop
Test Instruction:redo the test
Unit Test Case No./Name:
Changeset Number :查看links

```





# **CodeReview流程**

**SonarLint与SonarQube检测规则需要保持统一**

1. Coder实时检测（Checklist、SonarLint）待提交的本地仓库代码，并修复检测出的问题；
1. Coder发起PR，Reviewer根据本地代码检测结果进行CodeReview，并决定是否代码准入；
1. Jenkins集成SonarQube Scanner，实时对各分支进行静态代码检测；
1. 邮件通知FeatureTeam，由Coder修复，然后重复步骤1-3；

# **CodeReview权属**
1. 任何一次PR操作，都需要通过CodeReview过程来保证代码质量
1. Feature、Develop、Release、Hotfix、Master分支的CodeReview由FeatureTeam内部负责，能力中心可选
1. 代码合入Develop分支时，必须有1个评审者，已默认有Master，PR发起者可以再另外附加评审者
1. 代码合入Master分支时，必须有2个评审者，已默认有Master，须PR发起者再选择一个评审者。

# **CodeReview流程描述**
**一、部门/FeatureTeam内定期活动**
1. 知识分享
1. 代码走查
1. 专项辅导

**二、本地代码提交到Feature分支时**
**开发人员需要提供：**
1. checklist自查结果
1. Sonarlint静态代码检查结果---在PR的Description /附件中提供本地SonarLint检查结果截图
1. Jacoco UT覆盖率统计结果--在PR的Description /附件中提供本地UT截图

**审核人员：**
1. 变更的代码与PR描述是否一致---在PR的Description给出检查结果描述
1. 新功能是否编写UT代码---在PR的Description给出检查结果描述
1. 变更的代码是否符合编码规范---在PR的Description给出检查结果描述
1. 变更的代码是否添加必要的注释---在PR的Description给出检查结果描述

**三、向Dev分支、Master分支、Release分支合入代码时**
**PR发起人需要提供：**
1. SonarQube链接---在PR的Description中加入对应代码SonarQube检查结果的链接，用于证明所提交代码的UT覆盖率、Bug、安全性、Code Smells是否达标；
1. CI/CD链接---在PR的Description中加入CI/CD自动化测试结果的链接，用于证明代码API接口、UI的自动化测试是否满足指标；

**审核人员：**
1. 变更的代码与PR描述是否一致---在PR的Description给出检查结果描述
1. UT覆盖率是否达标---在PR的Description中加入UT覆盖率是否达标的检查结果

# **不同角色的CHECKLIST**
**一、开发人员的Checklist**
1. 是否实现了正常的功能，自己验证过吗？
1. 是否遵循编码规范？
1. 有必要的UT，SSIT吗？
1. 你考虑了哪些异常情况，处理了吗？
1. 性能是否达标，有没有造成衰退？
1. 本次实现会影响其他模块吗？
1. 功能实现是否和产品定义一致，有方法清晰的传递给测试、实施同事吗？
1. 设计方案（思路）和代码有被review过吗？
1. 提交的是正式Release的代码吗？（调试日志关闭，调试代码删除等）

**二、代码审查人员的Checklist**
1. 变更的代码与PR描述是否一致
1. 程序是否已经正确build
1. 程序是否实现预期的功能
1. 变更的代码是否符合编码规范
1. 变更的代码是否添加必要的注释





## PR&&codereview流程

```
本地到feature分支
开发人员需要提供：
1、checklist自查
2、Sonarlint结果--截图
3、jococo结果--截图
审核人员：
1、变更的代码与PR描述是否一致
2、程序是否已经正确build--删除
3、程序是否实现预期的功能---改为新功能是否编写UT代码
4、变更的代码是否符合编码规范---描述里填写
5、变更的代码是否添加必要的注释

feature到dev
PR发起人：
1、SonarQube链接
2、CI/CD链接
审核人员：
1、变更的代码与PR描述是否一致
2、程序是否已经正确build--删除
3、UT覆盖率是否达标---SonarQube链接
```

