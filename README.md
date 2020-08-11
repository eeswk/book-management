

#### redis docker setting
```
> docker run -p 6379:6379 --name redis_boot -d redis
```
```
> docker exec -it redis_boot redis-cli
```
redis key 조회
```
> keys *

> get name

> hget account:94d33c85-b0cf-4688-995c-24740b0ac831 email

> hgetall account:94d33c85-b0cf-4688-995c-24740b0ac831
```

#### mongodb
```docker
> docker run -p 27017:27017 --name mongo_boot -d mongo

> docker exec -it mongo_boot //bin/bash
> mongo
> db
>> test
> use test
> db.stores.find({})
>> { "_id" : ObjectId("5f31669c6fb93d490cc19925"), "name" : "A서점", "city" : "서울", "_class" : "com.swan.book.domain.Store" }
```