





## 查询语句

```
POST uda_tem_record/_update_by_query
{
  "query": {
    "term": {
      "deviceId.keyword": "25l5Ey4bUwBTFGY6" 
    }
  },
  "script": {
    "lang": "painless",
    "source": "ctx._source.systemId=params.systemId",
    "params": {
      "systemId": "200000000133"
    }
  }
}

POST /uda_tem_record/_search?size=0
{
    "aggs" : {
        "avg_grade" : { "avg" : { "field" : "value" } }
    }
}


GET /device_log_2022-04/_search
{
  "query": {
    "term": {
      "SystemId.keyword": {
        "value": "101171410017"
      }
    }
  }
}


GET /uda_tem_record/_search
{
  "query": {
    "term": {
      "systemId.keyword": "200000000133"
    }
  }
}


POST uda_tem_record/log/_delete_by_query?conflicts=proceed
{
   "query": {
    "term": {
      "systemId.keyword": "200000000133"
    }
  }
}

POST uda_tem_record/_update_by_query
{
   "query": {
    "term": {
      "systemId.keyword": "200000000133"
    }
  },
  "script": {
    "lang": "painless",
    "source": "ctx._source.systemId=params.systemId",
    "params": {
      "systemId": "200000000132"
    }
  }
}
```



### 生产环境

```
GET /device_log_2022-06/_search
{
  "query": {
                "bool": {
                        "filter": [{
                                        "term": {
                                                "SystemId.keyword": {
                                                        "value": "101193030044",
                                                        "boost": 1.0
                                                }
                                        }
                                }
                        ],
                        "adjust_pure_negative": true,
                        "boost": 1.0
                }
        }
}

GET device_log_2022-03,device_log_2022-04,device_log_2022-05/_search
{
        "query": {
                "bool": {
                        "filter": [{
                                        "term": {
                                                "SystemId.keyword": {
                                                        "value": "101193030044",
                                                        "boost": 1.0
                                                }
                                        }
                                },
                                {
                                        "range": {
                                                "OperationDateTime": {
                                                        "from": 1646092800000,
                                                        "to": 1654041599999,
                                                        "include_lower": true,
                                                        "include_upper": true,
                                                        "boost": 1.0
                                                }
                                        }
                                },
                                {
                                        "nested": {
                                                "query": {
                                                        "term": {
                                                                "Item.Name.keyword": {
                                                                        "value": "CCBInputPower_1",
                                                                        "boost": 1.0
                                                                }
                                                        }
                                                },
                                                "inner_hits": {},
                                                "ignore_unmapped": true,
                                                "path": "Item",
                                                "score_mode": "none",
                                                "boost": 1.0
                                        }
                                }
                        ],
                        "adjust_pure_negative": true,
                        "boost": 1.0
                }
        },
        "aggs": {
                "agg": {
                        "date_histogram": {
                                "field": "OperationDateTime",
                                "format": "yyyy-MM-dd",
                                "time_zone": "+08:00",
                                "interval": "1d",
                                "offset": 0,
                                "order": {
                                        "_key": "asc"
                                },
                                "keyed": true,
                                "min_doc_count": 0
                        },
                        "aggregations": {
                                "details": {
                                        "top_hits": {
                                                "from": 0,
                                                "size": 1,
                                                "version": false,
                                                "explain": false,
                                                "_source": {
                                                        "includes": [],
                                                        "excludes": []
                                                },
                                                "sort": [{
                                                        "OperationDateTime": {
                                                                "order": "desc"
                                                        }
                                                }]
                                        }
                                },
                                "aggs":{
                                  "filter":{
                                    "nested": {
                                      "path": "Item",
                                      "query": {
                                        "term": {
                                          "Item.Name.keyword": {
                                            "value": "CCBInputPower_1"
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                        }
                }
        }
}



GET /device_log_2022-06/_search
{
  "_source": [ "SystemId", "OperationDateTime"],
  "query": {
    "bool": {
      "must": [
        {
          "nested": {
            "path": "Item", 
            "query": {
              "bool": {
                "must": [ 
                  {
                    "match": {
                      "Item.Name": "SecondaryWaterReturnPressure"
                    }
                  }
                ]
              }
            }
          }
        }
      ]
    }
  },
  "script_fields": {
    "SecondaryWaterReturnPressure": {
      "script": {
        "lang": "painless",
        "source": """
            for (int i = 0; i < params._source.Item.length; ++i) {
              if(params._source.Item[i].Name.contains('SecondaryWaterReturnPressure'))
                return params._source.Item[i].Value;
            }
            return "hello";
        """
      }
    }
  }
}

```





### 美国

```
GET _search
{
  "query": {
    "match_all": {}
  }
}

GET solar_nearest_original_log/_search


GET /device_log_2022-08/_search
{
  "query": {
    "term": {
      "SystemId.keyword": {
        "value": "123456789012"
      }
    }
  }
}

GET /device_log_2022-08/_search
{
  "query": {
    "term": {
      "SystemId.keyword": {
        "value": "123456789012"
      }
    }
  },
  "sort": [
    {
      "UploadDateTime": "desc"
    }
  ]
}



GET /device_log_2022-08/_search
{
  "query": {
    "term": {
      "LogType.keyword": {
        "value": "testservicelog"
      }
    }
  }
}


```

