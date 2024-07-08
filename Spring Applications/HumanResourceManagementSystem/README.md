# Employee Management System

This is a simple Employee Management System built with Spring Boot, Thymeleaf, and Bootstrap. It allows employees to view and update their own profiles.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Thymeleaf Templates](#thymeleaf-templates)
- [Database Configuration](#database-configuration)

## Features

- View employee profile
- Edit and update employee profile
- List departments in a dropdown for employee profile

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- Bootstrap
- JPA/Hibernate
- MySQL

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL

### Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/yash123445/HumanResourceManagementSystem.git
    cd HumanResourceManagementSyetem
    ```

2. **Configure the database:**

    Open `src/main/resources/application.properties` and update the database configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build the project:**

    ```sh
    mvn clean install
    ```

## Running the Application

To run the application, use the following command:

```sh
mvn spring-boot:run

