#Databases

Note: 
- If we want to handle more reads, then we have to add replicas
- If we want to handle more writes, we mean some kind of sharding
- One shard can process 5000 requests per second, on average

##Sharding
Sharding is a process of storing data in several shards to increase throughput. 
DB schema looks as the same as database does not have shards.

Types of sharding:
1) to shard by some field (by country for example)
2) using custom areas (split world by custom shapes)
3) 