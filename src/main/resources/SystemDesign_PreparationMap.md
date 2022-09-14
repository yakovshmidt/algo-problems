[Amazon preparation process](https://www.amazon.jobs/en/software-development-interview-prep?cmpid=ECOTOT700005B#/)

# Sys Design
* Courses:
  * [Grokking the Advanced System Design Interview](https://www.educative.io/courses/grokking-adv-system-design-intvw) ?
  * Course on Citi's Udemy - Pragmatic System Design Interview
  * [Grokking System Design Interview](systemDesign/grokkingSystemDesignInterview)
* Theory Topics:
  * Step-by-step guide +
    * +[Estimation practice tutorial_1](https://dev.to/ievolved/how-i-calculate-capacity-for-systems-design-3477)
    * +[Estimation practice tutorial_2](https://www.codementor.io/@robinpalotai/back-of-the-envelope-calculation-for-system-design-interviews-z4ljbsp5l)
  * [Proxies](systemDesign/Proxies.md) +
  * [Load Balancing](systemDesign/LoadBalancing.md) +
  * Caching +
    * Google Guava as a local cache
    * Redis
  * [CDN](https://blog.tryexponent.com/cdns-content-delivery-networks/)
    * Amazon CloudFront
    * 
  * [SQL vs NoSQL](https://www.nodeflair.com/blog/sql-vs-nosql-databases-system-design-interview)
    * Cassandra
    * Amazon Dynamo DB
  * Replication and Redundancy +
  * Quorum of followers (Consensus algorithm)
  * Sharding and Partitioning +
  * ACID vs BASE +
  * DB Indexes +
  * Gossip protocol
  * Queues
    * Kafka
    * Apache SQS
  * Streams
    * Kafka
    * Amazon Kenesis
  * Security
  * HTTP (REST) vs SOAP +
  * HTTP vs REST +
  * CAP Theorem +
  * PACELC Theorem +
  * Consistent Hashing +
  * Long Polling vs WebServers vs Server-Sent Events
  * Bloom Filters
  * Leader and Follower, Leader Election + 
  * Heartbeat
  * Checksum
  * WebSockets +
  * Reliability vs Availability
  * How to measure availability (Nines)
  * DNS
  * Databases, Optimistic vs Pessimistic Locks, ACID, Transaction Isolation Levels +
    * Databases:
      * SQL
      * NoSQL
      * Object Storage:
        * Amazon S3
  * Distributed Locks
  * Api Gateway
  * Concurrency vs Parallel
* Practice
  * Design TikTok
    * https://www.youtube.com/watch?v=07BVxmVFDGY
  * Design Notification Service +-
  * Design Short url +
  * Design Uber
  * Design Google Docs
  * How would you design a search engine? ...
  * How do you design a web crawler, and when should it be used? ...
  * How do you design a shared drive? ...
  * What is required to design a garbage collection system?

Notes:
* Get topics from AlgoExpert?

Notes:
* server can process 5K inserts per **shard**
* server can process 10K gets per **replica**
* modern day server can have 256GB memory of RAM to store **cache**
* One million transactions **per day** is:
  * ~42k per hour
  * ~700 per minute
  * ~12 per second
* to store files, videos, images, logs, analytics data we need to use **object storage** like:
  * Amazon S3 
* to store metadata we need to use key-value storage or column-oriented storage
  * mongoDB