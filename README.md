# Coding Challenge 

### Problem Statement

We would like you to build a Spring Boot microservice that,
 consumes data from the emulator via HTTP API and stores it in a MongoDB collection using Morphia
API (please do not use Spring Data)
 uses MongoDB as your datastore with two collections
o metrics – stores the data that comes from sensor
o alerts – stores the alerts that were created by the rules
 exposes the below Metric APIs using Spring MVC,
o create – this is the API that will consume data from the sensor emulator
o read – reads all the metrics stored in your database
o readByTimeRange – reads all the metrics that were created between the given two timestamps
 exposes the below Alert APIs using Spring MVC
o read – reads all alerts that are stored in the database
o readByTimeRange – reads all alerts that are created between the given two timestamps

Dependencies : [Java 7] (http://www.oracle.com/technetwork/java/javase/downloads/) | [Maven] (https://maven.apache.org/download.cgi "Maven Build") | [Mongo DB] (https://docs.mongodb.com/ "Mongo DB") | [Morphia Api] (http://mongodb.github.io/morphia/ "Morphia Api") | [Easy Rules] (http://www.easyrules.org/ "Easy Rules") | [Sensor-Emulator] (https://github.com/egen/sensor-emulator "Sensor-Emulator")

### Steps to Run

1) Compile Project and generate jar
```
mvn clean package
```

2) Run Project
```
java -jar -Dbase.value=<base_weight> target/coding-challenge-0.0.1-SNAPSHOT.jar
```

Enter value for base_weight. [Example- -Dbase.value=150]

3) Test Project
```
mvn test
```

### OR

1) Shell Script to compile and run the project [for unix based platform] -
```
./run-all.sh <base_weight>
```

Enter value for base_weight.

### APIs Exposed

#### Metrics

- Stores the data that comes from sensor

1) Create

```
POST Request => http://localhost:8080/metrics/create/
```

2) Read

```
GET Request => http://localhost:8080/metrics/read/
```

3) Read by Range

```
GET Request => http://localhost:8080/metrics/readRange/{startTime}/{endTime}
```


#### Alerts

- Stores the alerts that were created by the rules

1) Read

```
GET Request => http://localhost:8080/alerts/read/
```

2) Read by Range

```
GET Request => http://localhost:8080/alerts/readRange/{startTime}/{endTime}
```


