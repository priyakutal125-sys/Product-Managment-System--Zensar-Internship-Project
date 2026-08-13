# Product Management System

## 📌 Project Description

The Product Management System is a Java-based application developed to manage product information such as product ID, name, price, and quantity.

The application provides a simple menu-driven interface that allows users to add, search, view, update, and delete product information.

The project uses Java, JDBC, and MySQL for database connectivity and follows the DAO (Data Access Object) pattern to separate database operations from the application logic.

## ✨ Features

- Add a new product
- Find a product by ID
- Display all products
- Update product price
- Delete a product
- MySQL database integration
- JDBC database connectivity
- Custom exception handling
- Menu-driven console interface

## 🛠️ Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- JDBC
- MySQL
- Eclipse IDE
- Git
- GitHub

## 📂 Project Structure

ProductManagementSystem/
│
├── src/
│   └── com/
│       └── shop/
│           ├── ProductManager.java
│           │
│           ├── dao/
│           │   └── ProductDao.java
│           │
│           ├── entity/
│           │   └── Product.java
│           │
│           ├── exception/
│           │   └── ResourceNotFoundException.java
│           │
│           ├── service/
│           │   └── ProductService.java
│           │
│           └── util/
│               └── DBConnection.java
│
├── bin/
├── .classpath
├── .project
└── README.md

## 🗄️ Database

The project uses MySQL as the database.

Create a database:

```sql
CREATE DATABASE misho;
