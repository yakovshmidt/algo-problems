[Amazon preparation process](https://www.amazon.jobs/en/software-development-interview-prep?cmpid=ECOTOT700005B#/)

# Sys Design
* Courses:
  * [Grokking the Advanced System Design Interview](https://www.educative.io/courses/grokking-adv-system-design-intvw) ?
  * Course on Citi's Udemy - Pragmatic System Design Interview
  * [Grokking System Design Interview](./systemDesign/grokkingSystemDesignInterview)
* Theory Topics:
  * Step-by-step guide +
    * [Estimation practice tutorial_1](https://dev.to/ievolved/how-i-calculate-capacity-for-systems-design-3477)
    * [Estimation practice tutorial_2](https://www.codementor.io/@robinpalotai/back-of-the-envelope-calculation-for-system-design-interviews-z4ljbsp5l)
  * [Proxies](./systemDesign/Proxies.md) +
  * [Load Balancing](./systemDesign/LoadBalancing.md) +
  * Caching +
    * Google Guava as a local cache
    * Redis
  * [CDN](https://blog.tryexponent.com/cdns-content-delivery-networks/)
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
  * Distributed Locks
  * Api Gateway
  * Concurrency vs Parallel
* Practice
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

# Java Interview Questions
* ACID +
* Isolation Levels +
* Pessimistic vs Optimistic Lock 

# English
* [learnship](https://edge.learnship.com) speaking club once a week 
* [learnship](https://edge.learnship.com) assignments every day
* Business Situations - Participating in Meetings

TODOs: 
* Solve the problems again:
  * longest common palindrome using DP
  * https://leetcode.com/problems/maximum-product-subarray/
  * https://leetcode.com/problems/product-of-array-except-self/

Notes:
* server can process 5K inserts per **shard**
* server can process 10K gets per **replica**
* modern day server can have 256GB memory of RAM to store **cache**