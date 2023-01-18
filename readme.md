# Docker Homework

Docker Homework is my project for exercising Docker
This Project has written in Java and Spring as IoC Container and also using Maven archtype.
## Structure
This project consist of 1 module: \
1- Hw1 -> first homework. it's just an simple web application.

## Requirements
- Java 17
- Maven 3.6.*
- Docker

## Installation
To build this project you have to use maven. Thus run this at root directory of project
```
mvn clean package 
```

### HW1
To make docker file of this module first build the project then change your working directory to hw1 module and run
```
docker build --tag <your-docker-image-tag-name> .
```
Then run the container by
```
docker run --name test-image -d -p 8085:8085 <your-docker-image-tag-name>
```
## Usage
### Hw1
```
>> To change application setting you can modify application.yml file.
  >>> By default application starts at port 8085 to change this use server.port property.
>> This module has these endpoints (/parham is the root context-path).
  >>> /parham/hello?name=name -> name is optional query parameter
  >>> /parham/author 
>> To see full api documentation use /parham/swagger-ui.html to visit swagger page.
>> To check the status of the application you can use spring actuator.
  >>> /parham/actuator -> spring actuator end point.
```
