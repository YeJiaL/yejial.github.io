## esHead 增删改查



### 批量删除

```
post uih_chatbot_session/chatbot_session/_delete_by_query
{
  "query": {
    "match": {
      "sessionId": "480734575950311424"
    }
  }
}
```

![image-20200722101217805](es相关整理.assets/image-20200722101217805.png)



```
post uih_chatbot_history/chatbot_history/_delete_by_query
{
  "query": {
    "match": {
      "sessionId": "480734575950311424"
    }
  }
}
```



### 某条数据的增删改查

