#Caching

##Caching Strategies
1) Cache Aside
   1) pros:
      1) Cache only what's needed
   2) cons:
      1) Cache misses are expensive
      2) Data staleness
      3) Implementation complexity
2) Read Through
   1) pros:
      1) Cache only what's needed
      2) Transparent
   2) cons:
      1) Cache misses are expensive
      2) Data staleness
      3) Reliability
3) Write Through
   1) pros:
      1) Up-to-date data
   2) cons: 
      1) Writes are expensive
      2) Redundant data
4) Write Behind
   1) pros:
      1) No write penalty
      2) Reduced load on storage
   2) cons:
      1) Reliability
      2) Lack of consistency

![](../../../../../../../../../Desktop/2022-04-20 12.35.01.jpg)![](../../../../../../../../../Desktop/2022-04-20 12.35.05.jpg)![](../../../../../../../../../Desktop/2022-04-20 12.34.53.jpg)![](../../../../../../../../../Desktop/2022-04-20 12.35.11.jpg)

##Eviction Policies
1) LRU - Least recently used
2) LFU - Least frequently used

##Redis
    