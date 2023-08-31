



原始

```
{
	"extractor": {
		"extractions": [],
		"type": 1
	},
	"enable": true,
	"id": "9ad7b710-0907-4618-85d3-f13bb7b84cf2",
	"judge": {
		"conditions": [
			{
				"value": "10.6.209.168:8025",
				"operator": "=",
				"type": "HostPort"
			}
		],
		"type": 0
	},
	"name": "叫号接口认证",
	"handle": {
		"higher_ca": "",
		"log": true,
		"process_txt": "叫号接口 非法访问"
	},
	"time": "2020-08-04 14:43:11"
}
```



结果

```
{
	"extractor": {
		"extractions": [],
		"type": 1
	},
	"enable": true,
	"id": "9ad7b710-0907-4618-85d3-f13bb7b84cf2",
	"judge": {
		"conditions": [
			{
				"value": "10.6.209.168:8025",
				"operator": "=",
				"type": "HostPort"
			},
			{
				"value": "(^/api/HealthCheck/Get)|(^/api/Patient/UpdateCheckStatus)|(^/api/Patient/CancleOrRecoveryPatient)|(^/api/Queue/Index)",
				"operator": "match",
				"type": "URI"
			}
		],
		"type": 1
	},
	"name": "叫号接口认证",
	"handle": {
		"higher_ca": "",
		"log": true,
		"process_txt": "叫号接口 非法访问"
	},
	"time": "2023-03-31 10:39:37"
}

```



```sql
UPDATE token_auth SET `key`='9ad7b710-0907-4618-85d3-f13bb7b84cf2', value='{"extractor":{"extractions":[],"type":1},"enable":true,"id":"9ad7b710-0907-4618-85d3-f13bb7b84cf2","judge":{"conditions":[{"value":"10.6.209.168:8025","operator":"=","type":"HostPort"},{"value":"(^\\/api\\/HealthCheck\\/Get)|(^\\/api\\/Patient\\/UpdateCheckStatus)|(^\\/api\\/Patient\\/CancleOrRecoveryPatient)|(^\\/api\\/Queue\\/Index)","operator":"match","type":"URI"}],"type":1},"name":"叫号接口认证","handle":{"higher_ca":"","log":true,"process_txt":"叫号接口 非法访问"},"time":"2023-03-31 10:39:37"}', `type`='rule', op_time='2023-03-31 10:39:37' WHERE id=57;

INSERT INTO `token_auth` VALUES (59, '9ad7b710-0907-4618-85d3-f13bb7b84cf211', '{\"extractor\":{\"extractions\":[],\"type\":1},\"enable\":true,\"id\":\"9ad7b710-0907-4618-85d3-f13bb7b84cf2\",\"judge\":{\"conditions\":[{\"value\":\"10.6.209.168:8025\",\"operator\":\"=\",\"type\":\"HostPort\"}],\"type\":0},\"name\":\"叫号接口认证\",\"handle\":{\"higher_ca\":\"\",\"log\":true,\"process_txt\":\"叫号接口 非法访问\"},\"time\":\"2020-08-04 14:43:11\"}', 'rule', '2020-08-04 14:43:11');


UPDATE gateway.token_auth
SET  value='{"extractor":{"extractions":[],"type":1},"enable":true,"id":"9ad7b710-0907-4618-85d3-f13bb7b84cf2","judge":{"conditions":[{"value":"10.6.209.168:8025","operator":"=","type":"HostPort"}],"type":0},"name":"叫号接口认证","handle":{"higher_ca":"","log":true,"process_txt":"叫号接口 非法访问"},"time":"2020-08-04 14:43:11"}', `type`='rule', op_time='2020-08-04 14:43:11'
WHERE id=57;

```



1. UIH AppointMobile拆分为二个服务 appoint_api/appoint_mobile
2. 叫号新增服务 UIH QueueWeb
3. 请求添加token-添加调用院内接口CAtoken-appoint配置 细化url到 (^/appoint/api/)|(^/appoint/mobile/)，subPath 支持 (^/appoint/api/)|(^/appoint/mobile/)
4. 对外接口token-院内接口认证-叫号接口认证 细化rul到(^/api/HealthCheck/Get)|(^/api/Patient/UpdateCheckStatus)|(^/api/Patient/CancleOrRecoveryPatient)|(^/api/Queue/Index)，subPath支持
   





代理账号

uih_proxy/123_U+@qwe.com