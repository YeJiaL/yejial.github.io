# 路由



```
{
  "uri": "/appoint/next/*",
  "name": "upacs-appoint-next",
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
  "plugins": {
    "proxy-rewrite": {
      "regex_uri": [
        "^/appoint/next/(.*)",
        "/appo/$1"
      ]
    }
  },
  "upstream": {
    "nodes": [
      {
        "host": "appo-dev.uihcloud.cn",
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





https://api-dev.uihcloud.cn/appoint/selfservice

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
  "plugins": {
    "proxy-rewrite": {
      "regex_uri": [
        "^/appoint/selfservice/(.*)",
        "/selfservice/$1"
      ]
    }
  },
  "upstream": {
    "nodes": [
      {
        "host": "appo-dev.uihcloud.cn",
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


https://api-dev.uihcloud.cn/appoint/api

```
{
  "uri": "/appoint/selfservice/*",
  "name": "upacs-appoint-api",
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
  "plugins": {
    "proxy-rewrite": {
      "regex_uri": [
        "^/appoint/api/(.*)",
        "/$1"
      ]
    }
  },
  "upstream": {
    "nodes": [
      {
        "host": "appo-dev.uihcloud.cn",
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

