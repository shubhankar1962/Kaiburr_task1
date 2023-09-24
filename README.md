# Task 1

:globe_with_meridians: :rocket: [LIVE APP](http://3.18.207.40/)

**NOTE:** [README First](/README.md)

### Requirements

- Java
- Maven
- Spring Boot (Framework)
- MongoDB
- Docker

#### Dependencies

- spring-boot-starter-web
- spring-boot-starter-data-mongodb
- spring-boot-maven-plugin

## Building steps

1. Open the folder `/task1` in your favourite IDE ( VS Code :heart:)
Wait for few minutes while the IDE loads and completes necessary pre-build tasks.

2. Run `mvn clean install`
This will build and install the artifacts in to the local repository.
Required jar file will be created inside `/target` folder.

3. Run the application by clicking `Run` option or pressing `F9`
SpringBoot application server will load and start on port `8080` of the `localhost`.

## Rest  API Endpoints and Resources
Rest API Endpoint is mapped to `http://127.0.0.1:8080/servers/`

- PUT a server	`http://127.0.0.1:8080/servers/createServer`
Accept "server" object in body in json format.

- GET servers	`http://127.0.0.1:8080/servers/getServer`
Returns a list of "server" objects.

- GET server	by ID	`http://127.0.0.1:8080/servers/getServer?id=<ID>`
Returns a  "server" object matching with ID.

- GET servers	by Name	`http://127.0.0.1:8080/servers/getServer?name=<Nmae>`
Returns a list of "server" objects matching with Name.

- DELETE server	`http://127.0.0.1:8080/servers/deleteServer?id=<ID>`
Deletes a  "server" object matching with ID.

## RestController interface extends MongoRepository

```java
List<Server> findAll();
    
Optional<Server> findById(String Id);
    
void createOrUpdateServer(Server server);
    
void deleteServerById(String Id);
    
List<Server> findByName(String name);
```

## Containerizing the app

`Dockerfile` contains all the commands required to build the app image

`
FROM openjdk:8-alpine
EXPOSE 8080
ADD target/demo.jar demo.jar
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongod:27017/servers", "-jar", "/demo.jar"]
`

1. Run the following command to build docker image
`sudo docker build -t <container_image_name> .`
This will create the app container image and add to you local repository.

2. To Run the app from container, run the following command
`sudo docker run -p 80:80 <container_image_name>`
SpringBoot application server will load and start on port `8080` of the `localhost`
You will see application logs in the terminal.

**Note:** The docker-compose part is Documented in Task3

## Consuming APIs

### Using Postman

Run the following created collection to Test and consume the APIs

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/5ff40fbad3968a1b28b0)

**NOTE:** *The above collection is created and tested for `http://127.0.0.1:8080/servers/` endpoint*

### Screenshots

![GetAllDatarcode](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/GET%20Alldata%20.png)
![GetAllDataPostManIO](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/getall%20data%20request%20in%20postman%20.png)

### GetDataById
![GetDataById](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/getSingle%20data%20by%20id.png)

### Post Data

![PostPostManIO](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/post%20data.png)

### PUT Data
![PutCode](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/PUT(Update)_data_code.png)

### Delete Data
![DelPostManIO]([/screenshots/delPostManIO.PNG](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/delete_data_by_id.png))
![MongodbDataAfterDel](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/listofdata_in_mongodb_after_deleting_the_data.png)

### Data On Mongodb after Posting
![Mongodb Data](https://github.com/shubhankar1962/Kaiburr_task1/blob/master/springbootMongodb/Task1SS/posted%20data%20on%20mongodb.png)




