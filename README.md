# Kafka-R: Real-time Prediction

[![LinkedIn][linkedin-shield]][linkedin-url]

This tutorial explains how a machine learning model is applied on real-time data.
It predicts incoming data as well as the model is retrained when the prediction results decrease.
It focuses on simplicity and can be seen as a baseline for similar projects.
You can read more about it in my blog article:
[Apache Kafka and R: Real-Time Prediction and Model (Re)training](https://www.confluent.io/blog/how-baader-built-a-predictive-analytics-machine-learning-system-with-kafka-and-rstudio/).


## Prerequisites

* [docker](https://docs.docker.com/get-docker/)
* [docker-compose](https://docs.docker.com/compose/install/)

## Data Flow

![](image.png)

### Kafka Producer
Let's go over the single parts of the data flow. A Kafka Producer produces simulated data of a fish's size measurement
as well as the weight continuously into two Kafka topics: `machine-weight` and `machine-measurement`.

### Kafka Streams
A Kafka Streams application consumes the `machine-measurement` topic and communicates via REST API with R
to predict the weight using linear regression. You can find a unit test for the
topology as well as an integration test for the REST communication [here](KafkaStreams/src/test/kotlin).

### ksqlDB
In ksqlDB both streams are joined, and the prediction is compared with the actual weight (error).

### Kafka Connect
One connector stores data in MongoDB so that it can be used for retraining the regression. 
The other connector acts as a trigger to do the retraining once the error exceeds a threshold.

### RStudio
In R the model itself, the prediction function, and the retraining function are stored and accessible via REST API.
You can find a test [here](R/test).


## Run
```
docker-compose up -d
