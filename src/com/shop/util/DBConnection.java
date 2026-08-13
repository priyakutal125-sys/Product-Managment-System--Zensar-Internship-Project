package com.shop.util;

import java.sql.*;

public class DBConnection {           //class to create database connection
    public static Connection getDBConnection() {         // Method to get DB connection
        Connection con = null;                            // variable for connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");      // load MySQL driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misho","root","rutuja123"); // database URL, username,passward,
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
