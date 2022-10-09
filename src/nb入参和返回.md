



### AddQueue



```
{

 "queue_name": "cerateRoutingRule"

}
```



```
{
 "queue_id": "796b67e1-1402-4a1c-a76a-40e3e3e22cd2",
 "queue_name": "cerateRoutingRule",
 "create_time": "2022-09-03T07:38:41.271Z",
 "last_modify_time": "2022-09-03T07:38:41.271Z"
}
```



### cerateRoutingRule



``` json
{
 "rules": [
  {
   "rule_id": "83e508a1-f779-45c2-8672-227a239e01da",
   "rule_name": "apiCreateRoutingRule",
   "description": "apiCreateRoutingRule_desc",
   "subject": {
    "resource": "device",
    "event": "create"
   },
   "app_type": "APP",
   "app_id": "66a90d0ac5b44178ab925db5af33dff3",
   "select": "*",
   "where": null,
   "active": false
  },
  {
   "rule_id": "b6d384cc-6dcb-4db0-b3e5-57ec400cfbff",
   "rule_name": "max2消息转发",
   "description": "max2消息转发",
   "subject": {
    "resource": "device.message",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "66a90d0ac5b44178ab925db5af33dff3",
   "select": null,
   "where": null,
   "active": false
  },
  {
   "rule_id": "1388de9d-c522-4cb6-819e-107c08c05dbd",
   "rule_name": "max",
   "description": null,
   "subject": {
    "resource": "device.property",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "6c43da463a9a436db7f3d292dd0b2367",
   "select": "*",
   "where": "notify_data.header.product_id = '62a819d1906b9e29ac75e031'",
   "active": false
  },
  {
   "rule_id": "f91e275b-88f7-4fcd-a3ba-865feb9dbf4f",
   "rule_name": "max",
   "description": null,
   "subject": {
    "resource": "device.message",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "6c43da463a9a436db7f3d292dd0b2367",
   "select": "*",
   "where": "notify_data.header.product_id = '62a819d1906b9e29ac75e031'",
   "active": false
  },
  {
   "rule_id": "e0745467-d93f-4636-a773-9673ff02e806",
   "rule_name": "max",
   "description": null,
   "subject": {
    "resource": "device.message",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "66a90d0ac5b44178ab925db5af33dff3",
   "select": "*",
   "where": "notify_data.header.product_id = '62ea06b75f266f255bb93690'",
   "active": false
  },
  {
   "rule_id": "c2053e5f-223d-4b74-b59a-e3a87c1baf9c",
   "rule_name": "max",
   "description": null,
   "subject": {
    "resource": "device.property",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "66a90d0ac5b44178ab925db5af33dff3",
   "select": "*",
   "where": "notify_data.header.product_id = '62ea06b75f266f255bb93690'",
   "active": false
  },
  {
   "rule_id": "22a5bf11-8d59-43a5-b666-4325e52b40b1",
   "rule_name": "max2属性",
   "description": "max2属性",
   "subject": {
    "resource": "device.property",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "66a90d0ac5b44178ab925db5af33dff3",
   "select": null,
   "where": null,
   "active": true
  },
  {
   "rule_id": "899a70d8-ea52-4361-a182-a8a5511f1e21",
   "rule_name": "Test2",
   "description": "转发测试",
   "subject": {
    "resource": "device.message",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "6c43da463a9a436db7f3d292dd0b2367",
   "select": null,
   "where": null,
   "active": false
  },
  {
   "rule_id": "0e75d93d-8004-435e-944f-fe603a5b359c",
   "rule_name": "属性转发",
   "description": "属性转发",
   "subject": {
    "resource": "device.property",
    "event": "report"
   },
   "app_type": "APP",
   "app_id": "6c43da463a9a436db7f3d292dd0b2367",
   "select": null,
   "where": null,
   "active": true
  }
 ],
 "count": 9,
 "marker": "62a8266b8152e24da2d002a5"
}
```



### CreateRuleAction

创建规则动作



```
{
 "rule_id": "83e508a1-f779-45c2-8672-227a239e01da",
 "channel": "AMQP_FORWARDING",
 "channel_detail": {
  "amqp_forwarding": {
   "queue_name": "cerateRoutingRule"
  }
 }
}
```



```
{
 "action_id": "1ce58e66-7bb7-453b-9b56-28dfa76740e0",
 "rule_id": "83e508a1-f779-45c2-8672-227a239e01da",
 "app_id": "66a90d0ac5b44178ab925db5af33dff3",
 "channel": "AMQP_FORWARDING",
 "channel_detail": {
  "http_forwarding": null,
  "dis_forwarding": null,
  "obs_forwarding": null,
  "amqp_forwarding": {
   "queue_name": "cerateRoutingRule"
  },
  "dms_kafka_forwarding": null,
  "roma_forwarding": null,
  "iota_forwarding": null,
  "mqs_forwarding": null,
  "mysql_forwarding": null,
  "mqtt_forwarding": null,
  "lts_forwarding": null,
  "influxdb_forwarding": null,
  "functiongraph_forwarding": null,
  "mrs_kafka_forwarding": null,
  "pulsar_forwarding": null
 },
 "batch": false
}
```

