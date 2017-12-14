# README #

Backend for Ichiban mobile apps.

## Environment variables
To run on local machine:

* RDS_HOSTNAME
* RDS_PORT
* RDS_DB_NAME
* RDS_USERNAME
* RDS_PASSWORD
```
========== RDS INFO ==========
RDS_HOSTNAME   : localhost
RDS_PORT       : 5432
RDS_DB_NAME    : new-ichiban-backend
RDS_USERNAME   : postgres
RDS_PASSWORD   : 
```

## How to start
```
gradle build
java -jar build/libs/new-ichiban-backend-0.1.0.jar
```