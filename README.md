# SpringBoot-Kafka-App
This project contains APIs where Producer publish (send) message and Consumer subscribe to the topic to subscribe (read) message.

##  Kafka By using Spring Boot

`Below defined Cli commands in step1, and step2 are mandatory when using kafka.
`
### 1. First folder named `json`
It is an example where producer is sending data in the form of **Json** to the topic and consumer is consuming that data from topic.

    json data -> Weather
    topic name -> weather
    partition -> default

### 2. Second folder named `multipartition`
It is an example where producer is sending data in the form of **Json** to the topic and consumer is consuming that data from topic.
Topic is divided into 3 partitions and Consumer group having 1 group with groupId.

    json data -> Post
    topic name -> post
    partition -> 3 (1 , 2 , 3)
    groupId -> group1

### 3. Third folder named `simple`
It is a simple example where producer is sending data in the form of **String** to the topic and consumer is consuming that data from topic.

    data -> String
    topic name -> topic
    partition -> default

 
##  Kafka By using CLI Commands

### Step 1. Run Zookeeper Server

    $ bin/zookeeper-server-start.sh config/zookeeper.properties

### Step 2. Run kafka Server

    $ bin/kafka-server-start.sh config/server.properties

### Step 3. Create Topic 

    $ bin/kafka-topics.sh --create --topic <topic name> --bootstrap-server localhost:9092

### Step 4. Check the list of kafka topics created till now

    $ bin/kafka-topics.sh --list  --bootstrap-server localhost:9092

### Step 5. Producer can publish some event/message in the above created topic

    bin/kafka-console-producer.sh --topic <topic name> --bootstrap-server localhost:9092

### Step 6. Consumer can subscribe (read) the event/message from the topic

    $ bin/kafka-console-consumer.sh --topic <topic name> --from-beginning --bootstrap-server localhost:9092

