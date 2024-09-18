# springboot-jpa

## Overview
This is an application developed with Java and Spring Boot. The goal of this project is to provide a RESTful API to manage users (clients), products, and purchase orders, with CRUD (Create, Read, Update, Delete) operations.

## Technologies
This project is built with:
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Maven

## Getting Started
To get a local copy of this project running, follow these steps.

### Prerequisites
Make sure you have the following installed:
- Java 21+
- Maven 3+

### Running the application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the org.project.springboot_jpa.SpringbootJpaApplication class from your IDE.

## API
The application will be available at the address: http://localhost:8080.

Main endpoints:
- GET: ```/users``` - returns all users.
- GET: ```/users/{id}``` - returns the user with the specified ID.
- POST: ```/users``` - create a new user.
- PUT: ```/users/{id}``` - updates the user information with the specified ID.
- DELETE: ```/users/{id}``` - removes the user with the specified ID.
- GET: ```/products``` - returns all products.
- GET: ```/orders``` - returns all orders.

Example body for updating a new user:
```
{
    "name": "Billy",
    "email": "billy@email.com",
    "phone": "11223344"
}
```
