# Spring Boot Sample



## List

1. [Overview](#overview)
2. [Project info](#project-info)
3. [Rest API](#rest-api)
4. [Model](#model)
5. [Config](#config)



## Overview

Spring Boot를 이용하여 백엔드 서버를 구축하는 간단한 샘플 프로젝트 입니다. Restful 서버를 구축하였으며 ORM(Object Relation Mapping)으로 hibernate를 사용했습니다. JPA를 활용하여 DB와 데이터를 주고받습니다. 




## Project info

#### 사용 기술 및 라이브러리

- JDK 1.8
- spring boot 2.3.1
- mysql
- hibernate 
- lombok





#### project structure

- directory-tree

```
.
├── HELP.md
├── README.md
├── app.log
├── hellospringboot.iml
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
   ├── main
   │   ├── java
   │   │   └── com
   │   │       └── spring
   │   │           └── thnoh
   │   │               └── helloSpringBoot
   │   │                   ├── HelloSpringBootApplication.java
   │   │                   ├── config
   │   │                   │   └── SecurityConfig.java
   │   │                   ├── controller
   │   │                   │   ├── CustomerController.java
   │   │                   │   └── HomeController.java
   │   │                   ├── model
   │   │                   │   └── Customer.java
   │   │                   └── repo
   │   │                       └── CustomerRepository.java
   │   └── resources
   │       ├── application.properties
   │       ├── logback.xml
   │       ├── static
   │       └── templates
   │           └── index.html
   └── test
       └── java
           └── com
               └── spring
                   └── thnoh
                       └── helloSpringBoot
                           └── HellospringbootApplicationTests.java

```



<br/>

## REST API

- customer 조회 : GET /api/customers
- customer 조회(이름으로) : GET /api/customers/:lastname
- customer 추가 : POST /api/customers 
- customer 삭제 : DELETE /api/customers/:id
- customer 수정 : PUT /api/customers/:id


## Model

##### Customer

```
Customer {
	customer_id : Long // Long, PK, Auto-Increment
	firtname : String // String
	lastname : String // String
}
```



## Config

- [Spring security](https://github.com/NohTaeHwan/Spring-Boot-Sample/blob/master/src/main/java/com/spring/thnoh/helloSpringBoot/config/SecurityConfig.java) : Spring security 설정 클래스
- [기본 설정](https://github.com/NohTaeHwan/Spring-Boot-Sample/blob/master/src/main/resources/application.properties) : 프로젝트 기본 설정 파일
- [Log](https://github.com/NohTaeHwan/Spring-Boot-Sample/blob/master/src/main/resources/logback.xml) : slf4j 로깅 설정 파일 

