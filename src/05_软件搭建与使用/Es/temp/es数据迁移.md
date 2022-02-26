[TOC]





### elasticdump



https://www.cnblogs.com/JimShi/p/11244126.html（可用）

https://www.cnblogs.com/sunfie/p/10165473.html（可用）



> elasticdump --input=http://10.6.5.152:9200/uih_chatbot_business --output=http://10.3.13.171:9200/uih_chatbot_business
>
> elasticdump --input=http://10.6.5.152:9200/uih_chatbot_business --output=http://10.6.5.193:9200/uih_chatbot_business
> 10.6.5.193:9200
>
> /usr/local/bin/elasticdump -> /usr/local/lib/node_modules/elasticdump/bin/elasticdump
> /usr/local/bin/multielasticdump -> /usr/local/lib/node_modules/elasticdump/bin/multielasticdump
>
>
> elasticdump --input=http://10.6.209.48:9200/uih_chatbot_business --output=http://10.6.5.193:9200/uih_chatbot_business1
>
> elasticdump --input=http://10.6.5.193:9200/uih_chatbot_business --output=http://10.6.209.48:9200/uih_chatbot_business
>
> elasticdump --input=http://10.6.209.48:9200/uih_chatbot_business --output=/usr/local/mapp/esData/uih_chatbot_business.json --type=data
>
> elasticdump --input=http://10.6.209.48:9200/uih_chatbot_business --output=/usr/local/mapp/esData/query.json --type=data --searchBody '{"query":{"term":{"robotCode": "4042b85a"}}}'
>
>
> elasticdump --input=/usr/local/mapp/esData/query.json --output=http://10.3.13.171:9200
>
> elasticdump --input=/usr/local/mapp/esData/query.json --output=http://10.6.209.80:9200

