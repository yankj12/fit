# food

饮食与健康，管理和查询食物的热量、营养等

## 概述

### 表汇总

表汇总

|表名|中文名|说明|
|---|---|---|
|food|食物表||
|nutrition|食物营养表||

### 食物表

食物表

|列名|列中文名|说明|
|---|---|---|
|id|id||
|name|名称||
|alias|别名||
|calorie|热量（每100克）||
|calorieUnit|热量单位||
|category|分类||
|remark|评价||
|source|来源||
|validStatus|有效状态||
|insertTime|插入时间||
|updateTime|修改时间||

### 食物营养表

食物营养表

|列名|列中文名|说明|
|---|---|---|
|id|id||
|foodname|食物名称||
|foodid|食物id||
|name|营养素||
|unit|单位||
|content|含量（每100克）||
|source|来源||
|validStatus|有效状态||
|insertTime|插入时间||
|updateTime|修改时间||

## 食物热量api

http://www.boohee.com/food/

GET

```
Host: www.boohee.com
User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Accept-Encoding: gzip, deflate
Referer: http://www.boohee.com/food/group/1
Connection: keep-alive
Cookie: Hm_lvt_7263598dfd4db0dc29539a51f116b23a=1544059497; Hm_lpvt_7263598dfd4db0dc29539a51f116b23a=1544065278; _bhk=BAh7B0kiD3Nlc3Npb25faWQGOgZFVEkiJWFiODdiNmMwODQ2M2MzZmEzMWI4OWFiZDFiNDQzYmY4BjsARkkiEF9jc3JmX3Rva2VuBjsARkkiMWRmMGpIaXFCOVZnalk2dy9oempLL0ROOG5VVHFja3VzVWdxSmxZY3Znbnc9BjsARg%3D%3D--86c8f8421a92d51e1577ac4d6ce318a11933d9e4; first_visit_at=zSxksWYI7u%2F4IypSWgtEBAWVFo0wlETU%0A
Upgrade-Insecure-Requests: 1
Pragma: no-cache
Cache-Control: no-cache
```

http://www.boohee.com/food/group/1

GET

```
Host: www.boohee.com
User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Accept-Encoding: gzip, deflate
Referer: http://www.boohee.com/food/
Connection: keep-alive
Cookie: Hm_lvt_7263598dfd4db0dc29539a51f116b23a=1544059497; Hm_lpvt_7263598dfd4db0dc29539a51f116b23a=1544065183; _bhk=BAh7B0kiD3Nlc3Npb25faWQGOgZFVEkiJWFiODdiNmMwODQ2M2MzZmEzMWI4OWFiZDFiNDQzYmY4BjsARkkiEF9jc3JmX3Rva2VuBjsARkkiMWRmMGpIaXFCOVZnalk2dy9oempLL0ROOG5VVHFja3VzVWdxSmxZY3Znbnc9BjsARg%3D%3D--86c8f8421a92d51e1577ac4d6ce318a11933d9e4; first_visit_at=zSxksWYI7u%2F4IypSWgtEBAWVFo0wlETU%0A
Upgrade-Insecure-Requests: 1
Pragma: no-cache
Cache-Control: no-cache
```

http://www.boohee.com/shiwu/miantiao_junzhi

GET

```
Host: www.boohee.com
User-Agent: Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2
Accept-Encoding: gzip, deflate
Referer: http://www.boohee.com/food/group/1
Connection: keep-alive
Cookie: Hm_lvt_7263598dfd4db0dc29539a51f116b23a=1544059497; Hm_lpvt_7263598dfd4db0dc29539a51f116b23a=1544065281; _bhk=BAh7B0kiD3Nlc3Npb25faWQGOgZFVEkiJWFiODdiNmMwODQ2M2MzZmEzMWI4OWFiZDFiNDQzYmY4BjsARkkiEF9jc3JmX3Rva2VuBjsARkkiMWRmMGpIaXFCOVZnalk2dy9oempLL0ROOG5VVHFja3VzVWdxSmxZY3Znbnc9BjsARg%3D%3D--86c8f8421a92d51e1577ac4d6ce318a11933d9e4; first_visit_at=zSxksWYI7u%2F4IypSWgtEBAWVFo0wlETU%0A
Upgrade-Insecure-Requests: 1
Pragma: no-cache
Cache-Control: no-cache
```
