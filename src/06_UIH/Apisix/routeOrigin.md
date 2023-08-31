# 路由



```
{
  "uri": "/appoint/selfservice/*",
  "name": "upacs-appoint-selfservice",
  "methods": [
    "GET",
    "POST",
    "PUT",
    "DELETE",
    "PATCH",
    "HEAD",
    "OPTIONS",
    "CONNECT",
    "TRACE"
  ],
  "upstream": {
    "nodes": [
      {
        "host": "appo-sit.uihcloud.cn",
        "port": 443,
        "weight": 1
      }
    ],
    "timeout": {
      "connect": 6,
      "send": 6,
      "read": 6
    },
    "type": "roundrobin",
    "scheme": "https",
    "pass_host": "node",
    "keepalive_pool": {
      "idle_timeout": 60,
      "requests": 1000,
      "size": 320
    }
  },
  "status": 1
}
```

