

#### redis docker setting
```
docker run -p 6379:6379 --name redis_boot -d redis
```
```
docker exec -it redis_boot redis-cli
```
redis key 조회
```
> keys *

> get name

> hget account:94d33c85-b0cf-4688-995c-24740b0ac831 email

> hgetall account:94d33c85-b0cf-4688-995c-24740b0ac831
```