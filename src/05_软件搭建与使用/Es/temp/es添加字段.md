[TOC]



# es添加字段

由于接口功能需求，需向es中添加字段（以在uih_chatbot_business中添加answerSource:问题来源为例），步骤如下：

## a.使用es head

### 1.使用eslastic-head 添加对应字段

```
PUT: 
uih_chatbot_business/_mapping/chatbot_business 
{"properties":{"answerSource":{"type":"keyword"}}} 

```

![image-20200706160136928](es添加字段.assets/image-20200706160136928.png)

### 2.设置以前数据的新添加字段值：

```
POST:
uih_chatbot_business/_update_by_query 
{"script":{"lang":"painless","inline":"if (ctx._source.answerSource== null) {ctx._source.answerSource= '0'}"}} 

```

![image-20200706160155138](es添加字段.assets/image-20200706160155138.png)



## b.使用postman

### 1、使用postman新增字段

put请求

```
http://localhost:9200/uih_chatbot_business/_mapping/chatbot_business

{
  "properties": {
         "answerSource": {
            "type": "keyword"
          }
    }
}
```



![image-20200706160915676](es添加字段.assets/image-20200706160915676.png)



### 2.设置以前数据的新添加字段值



post请求

```
http://localhost:9200/uih_chatbot_business/_update_by_query
{
    "script": {
        "lang": "painless",
        "inline": "if (ctx._source.answerSource== null) {ctx._source.answerSource= '0'}"
    }
}
```

![image-20200706161023658](es添加字段.assets/image-20200706161023658.png)







## 0702-0715需要修改的字段



### uih_chatbot_business表字段更改

```
PUT: 
uih_chatbot_business/_mapping/chatbot_business 
{"properties":{"answerSource":{"type":"keyword"}}} 

POST:
uih_chatbot_business/_update_by_query 
{"script":{"lang":"painless","inline":"if (ctx._source.answerSource== null) {ctx._source.answerSource= '0'}"}} 
```



### uih_chatbot_session表字段更改

```
uih_chatbot_session/_mapping/chatbot_session 
{"properties":{"count":{"type":"long"}}} 

uih_chatbot_session/_update_by_query
{"script":{"lang":"painless","inline":"if (ctx._source.count== null) {ctx._source.count= '0'}"}}
```

