[TOC]

# 目录



## 前端启动

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





## 合并上一次提交

```
git commit -a --amend
```

## 获取时间磋

```
var timestamp=(new Date()).valueOf();
console.log(timestamp)

    private final String oneId= "f3300686dacb7824d4acd6557a78b96e";       
    private final String upadteFeedbackId = "53f84c3f05b6f39afb2175b1b5487e55";
    private final String ruleType = "4229177055679435755";
```





```


```



## es查询语句



```
        SearchRequestBuilder businessSearchRequestBuilder = esUtil.getBusinessSearchRequestBuilder(EsChatHistoryConst.INDEX, EsChatHistoryConst.TYPE);
        SearchRequestBuilder searchRequestBuilder = businessSearchRequestBuilder.setQuery(getQueryBuilderBySession(sessionId)).addSort(EsChatHistoryConst.QUESTION_TIME, SortOrder.DESC);
        Pagination<EsChatHistory> esChatHistoryList = esUtil.getEsBusinessPageList(size, page, searchRequestBuilder, EsChatHistory.class);
```



> ```
> BoolQueryBuilder questionLikeQB;
> BoolQueryBuilder answerLikeQB;
> 
> if (Boolean.TRUE.equals(searchConfig.getDefaultrobotable())) {
> 	questionLikeQB = QueryBuilders.boolQuery().must(getWildcardQueryQB(keyword)).must(getActiveQB()).must(QueryBuilders.boolQuery().should(getRobotIdQB(robotCode)).should(getRobotIdQB(searchConfig.getDefaultrobotcode())));
> 	answerLikeQB = QueryBuilders.boolQuery().must(getWildcardSimilarQB(keyword)).must(getActiveQB()).must(QueryBuilders.boolQuery().should(getRobotIdQB(robotCode)).should(getRobotIdQB(searchConfig.getDefaultrobotcode())));
> } else {
> 	questionLikeQB = QueryBuilders.boolQuery().must(getRobotIdQB(robotCode)).must(getWildcardQueryQB(keyword)).must(getActiveQB());
> 	answerLikeQB = QueryBuilders.boolQuery().must(getRobotIdQB(robotCode)).must(getWildcardSimilarQB(keyword)).must(getActiveQB());
> }
> return QueryBuilders.boolQuery().should(questionLikeQB).should(answerLikeQB);
> 
> 
> ```

> ```
> BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery().must(getRobotCodeQB(robotCode));
> if (startTime != null && endTime != null) {
>  SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
>  String lte = sdf.format(startTime);
>  String gte = sdf.format(endTime);
>  boolQueryBuilder.must(rangequerybuilder(lte, gte));
> }
> if (!StringUtils.isEmpty(useOrSessionId)) {
>  BoolQueryBuilder shouldQuery = QueryBuilders.boolQuery();
>  shouldQuery.should(getSessionIdQB(useOrSessionId)).should(getUseIdQB(useOrSessionId));
>  boolQueryBuilder.must(shouldQuery);
> }
> 
> return boolQueryBuilder;
> ```







```
一种可视化加油方法
一种可视化油量方法
一种基于三维扫描仪的油箱油量测量装置
三维虚拟可视化展示方法

加油最后多少钱，往往需要等到加油的最后一刻才完成，要么是多少L,要么是多少钱，一开始不能确定一个精确的数值。针对目前有些仍然需要人工核销的油站，影响加油效率。

基于三维测量和建模等手法，近实时的展示油量大小。可视化加油，提高加油效率。
```



```
http://hm.uihcloud.com/HM/Common/Conference/JoinConference
refid: aa652e5dbd3239704f7663415db885ce
systemCode: CLT

message
:
"{"success":false,"message":"加入会议失败，调用第三方（云享互联）新建接口状态码错误, 错误码：400","messageDetail":"当前记录不存在会议号.创建新会议并获取返回的会议号失败:{\"code\":801,\"mcode\":801,\"msg\":\"service overdue\",\"obj\":null,\"version\":null}"}"
success
:
true

```

## ConstsProperty2Map

```java
    public static Map<String, Object> ConstsProperty2Map(Class obj){
       Map<String, Object> map = new Hashtable<String, Object>();

       Field[] field1 = obj.getDeclaredFields();
 
       for (int i = 0; i < field1.length; i++) {
 
           field1[i].setAccessible(true);
 
           try {
               map.put(field1[i].getName(), field1[i].get(obj));
           } catch (IllegalArgumentException e1) {
               throw new STBSystemException(e1);
           } catch (IllegalAccessException e2) {
               throw new STBSystemException(e2);
           }
 
       }
 
       return map;
 
   }
```



- [ ] jenkins、k8s、helm熟悉
- [ ] linux基础知识
- [ ] http图解
- [ ] tcp/ip
- [ ] Python





- [ ] telenik fiddler 网页工具





# [springboot aop 自定义注解方式实现完善日志记录（完整源码）](https://www.cnblogs.com/wenjunwei/p/9639909.html)



# maven的package与install命令区别

```
maven install 是将打好的jar包安装到本地库中，一般没有设置过是在 用户目录下的 .m2\下面。
maven package 只是将你的代码打包到输出目录，一般的是 target下面。
```





企业后台收到请求后，需要做如下操作：

1. 对收到的请求做Urldecode处理
2. 通过参数msg_signature[对请求进行校验](https://open.work.weixin.qq.com/api/doc/90000/90135/90237#12976/消息体签名校验)，确认调用者的合法性。
3. [解密echostr](https://open.work.weixin.qq.com/api/doc/90000/90135/90237#12976/密文解密得到msg的过程)参数得到消息内容(即msg字段)
4. 在1秒内响应GET请求，响应内容为上一步得到的明文消息内容(不能加引号，不能带bom头，不能带换行符)