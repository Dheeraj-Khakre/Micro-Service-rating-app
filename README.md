# Micro-Service-rating-app
we are using micro service for getting the rating for a hotel based on users 

Spring Boot Microservices with Eureka Server
Overview
This project demonstrates a microservices architecture using Spring Boot and Netflix Eureka for service discovery. The application consists of three microservices: Hotel Service, User Service, and Rating Service, all registered with a Eureka Server.

Microservices
1. Hotel Service
Description: Manages hotel information.
Endpoints:
GET /hotels/{id}: Retrieve hotel details by ID.
POST /hotels: Add a new hotel.
PUT /hotels/{id}: Update hotel information.
DELETE /hotels/{id}: Delete a hotel.
2. User Service
Description: Manages user information.
Endpoints:
GET /users/{id}: Retrieve user details by ID.
POST /users: Add a new user.
PUT /users/{id}: Update user information.
DELETE /users/{id}: Delete a user.
3. Rating Service
Description: Manages ratings given by users to hotels.
Endpoints:
GET /ratings/users/{userId}: Retrieve ratings by user ID.
POST /ratings: Add a new rating.
PUT /ratings/{id}: Update rating information.
DELETE /ratings/{id}: Delete a rating.
Eureka Server
Description: Acts as a service registry where microservices register and discover other services.
Configuration:
server.port=8761
spring.application.name=eureka-server
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
Setup Instructions
Prerequisites
JDK 17 or later
Maven or Gradle
IDE (IntelliJ IDEA, Eclipse, etc.)
Step-by-Step Guide
Clone the Repository


Eureka Server Setup

Create a Spring Boot project with the Eureka Server dependency.
Add the following configuration to application.properties:

Annotate the main application class with @EnableEurekaServer.
Microservices Setup

Create separate Spring Boot projects for Hotel Service, User Service, and Rating Service.
Add the Eureka Client dependency to each project.
Configure application.properties for each service:

Annotate the main application class with @EnableEurekaClient.
Service Communication

Use RestTemplate or Feign Client for inter-service communication.
Example using Feign Client:

Run the Application

Start the Eureka Server.
Start each microservice.
Verify that all services are registered with Eureka by visiting http://localhost:8761.
Additional Resources
Spring Boot Documentation
Spring Cloud Netflix Documentation
