es分片记录







```


GET _search
{
  "query": {
    "match_all": {}
  }
}


GET _snapshot

GET _snapshot/test2/_all


PUT _snapshot/test2
{
    "type": "fs", 
    "settings": {
        "location": "test2",
        "compress": false
    }
}

POST _snapshot/test2/backup_snapshot_2021_01_16_23_59_59/_restore
{
  "indices": "service_log_2021-01",
  "ignore_unavailable": true, 
  "index_settings": {
    "index.number_of_replicas": 0
  }
  
}

POST _snapshot/test2/backup_snapshot_2021_01_16_23_59_59/_restore

GET /service_log_2021-01/_recovery/

GET /device_log_2021-01/_recovery/

GET _cluster/health

GET _cat/shards

GET _nodes/process?pretty

GET _cluster/settings


POST _cluster/reroute
{
  "commands": [
    {
      "allocate": {
        "index": "service_log_2021-01",
        "shard": 1,
        "node": "ZY2bUTrxT-iVFiuCOzS28g",
        "allow_primary": true
      }
    }
  ]
}

PUT /_cluster/settings
{
  "transient" : { 
    "cluster.routing.allocation.enable":"all"
  }
}


GET  _cluster/allocation/explain?pretty


GET _cat/shards

POST /_cluster/reroute?retry_failed=true
```





```
GET _search
{
  "query": {
    "match_all": {}
  }
}

GET _snapshot/_all


GET _snapshot/solar_es_backup_2021_12/_all



GET _snapshot/solar_es_backup_history/_all

GET _snapshot/solar_es_backup_history/backup_snapshot_2021_12_30_11_16_52/

GET _snapshot/solar_es_backup_history/_all

GET _snapshot/solar_es_backup_history/backup_snapshot_2021_12_30_11_16_52/_status


GET /_cat/health?v

GET _cluster/health?pretty&level=indices


GET /service_log_2018-12


POST _snapshot/solar_es_backup_history/backup_snapshot_2021_12_30_11_16_52/_restore
{
  "indices": "service_log_2019-09"
}



GET /service_log_2019-09/_recovery/
```



