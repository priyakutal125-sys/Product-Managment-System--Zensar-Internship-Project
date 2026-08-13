# 🛒 Product Management System

A simple **Java-based Product Management System** developed using **Core Java, JDBC, and MySQL**. The application provides a menu-driven console interface to manage product information and demonstrates the use of **OOP, DAO Pattern, JDBC, and Exception Handling**.

## ✨ Features

* ➕ Add a new product
* 🔍 Find product by ID
* 📋 Display all products
* ✏️ Update product price
* 🗑️ Delete a product
* ⚠️ Custom exception handling
* 🗄️ MySQL database integration
* 🔌 JDBC connectivity
* 🏗️ DAO-based architecture

## 🛠️ Technologies Used

* **Java**
* **Core Java & OOP**
* **JDBC**
* **MySQL**
* **Eclipse IDE**
* **Git & GitHub**

## 📂 Project Structure

```text
ProductManagementSystem/
│
├── src/
│   └── com/shop/
│       ├── ProductManager.java
│       ├── dao/
│       │   └── ProductDao.java
│       ├── entity/
│       │   └── Product.java
│       ├── exception/
│       │   └── ResourceNotFoundException.java
│       ├── service/
│       │   └── ProductService.java
│       └── util/
│           └── DBConnection.java
│
├── bin/
├── .classpath
├── .project
└── README.md
```

## 🗄️ Database Setup

Create the MySQL database:

```sql
CREATE DATABASE misho;
USE misho;
```

Create the product table:

```sql
CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    quantity INT NOT NULL
);
```

Add sample data:

```sql
INSERT INTO product
VALUES
(101, 'Laptop', 55000, 10),
(102, 'Keyboard', 1200, 25),
(103, 'Mouse', 700, 30);
```

## ⚙️ Database Configuration

Update your MySQL credentials in:

```text
DBConnection.java
```

Example:

```java
String url = "jdbc:mysql://localhost:3306/misho";
String username = "root";
String password = "your_password";
```

Make sure the **MySQL Connector/J** JDBC driver is added to the project.

## ▶️ How to Run

1. Clone the repository.
2. Open the project in **Eclipse IDE**.
3. Create the MySQL database and table.
4. Configure your MySQL username and password.
5. Add the MySQL JDBC driver.
6. Run `ProductManager.java`.

## 🖥️ Application Menu

```text
========== PRODUCT MANAGEMENT SYSTEM ==========

1. Add Product
2. Find Product
3. Display All Products
4. Update Product Price
5. Delete Product
6. Exit

Enter your choice:
```

## 🏗️ Architecture

The project follows a simple layered architecture:

```text
ProductManager
      ↓
ProductService
      ↓
ProductDao
      ↓
DBConnection
      ↓
MySQL Database
```

This structure keeps **user interaction, business logic, and database operations** separated and easier to maintain.

## 🎯 Learning Objectives

This project demonstrates practical knowledge of:

* Java OOP concepts
* JDBC and MySQL connectivity
* CRUD operations
* DAO Design Pattern
* Exception Handling
* Layered application structure
* Git and GitHub

## 🚀 Future Enhancements

* Product search by name
* User authentication
* Product categories
* Inventory management
* GUI using JavaFX/Swing
* REST API using Spring Boot

## 👨‍💻 Author

**Priya Kutal**
