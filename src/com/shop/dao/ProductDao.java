package com.shop.dao;

import java.sql.*;
import java.util.*;
import com.shop.entity.Product;
import com.shop.service.ProductService;
import com.shop.util.DBConnection;
import com.shop.exception.ResourceNotFoundException;

public class ProductDao implements ProductService {

    
    Scanner sc = new Scanner(System.in);        // Scanner for user input

    
    @Override
    public void add(Product product) {          // Method to add product

        
        System.out.println("Enter Product Id:");          // Take product details from user
        int id = sc.nextInt();

        System.out.println("Enter Product Name:");
        String name = sc.next();

        System.out.println("Enter Product Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Product Quantity:");
        int quantity = sc.nextInt();

     // Database code
        try (                       
            Connection con = DBConnection.getDBConnection();
            PreparedStatement ps =
            con.prepareStatement("insert into product values(?,?,?,?)")
        ) {

           
            ps.setInt(1, id);         // Set values
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);

            ps.executeUpdate();          // Execute query
            System.out.println("Product added successfully");

        } catch (SQLException e) {
            // Handle SQL error
            e.printStackTrace();
        }
    }

   
    @Override
    public Product find(int id) {                // Method to find product by id

       
        System.out.println("Enter Product Id to Find:");         // Take id from user
        id = sc.nextInt();

        Product product = null;

        try (
            Connection con = DBConnection.getDBConnection();
            PreparedStatement ps =
            con.prepareStatement("select * from product where id=?")
        ) {

           
            ps.setInt(1, id);                   // Set id
            ResultSet rs = ps.executeQuery();

            // If product exists
            if (rs.next()) {
                product = new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity")
                );
                System.out.println("Product Found");
                System.out.println(product);
            } else {
                // If product not found
                throw new ResourceNotFoundException("Resource not found!!!");
            }

        } catch (ResourceNotFoundException e) {
            // Custom exception message
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    
    @Override
    public List<Product> findAll() {              // Method to show all products

        List<Product> list = new ArrayList<>();

        try (
            Connection con = DBConnection.getDBConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product")
        ) {

            // Read all records
            while (rs.next()) {
                Product p = new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity")
                );
                list.add(p);
                System.out.println(p);
            }

            // If no product exists
            if (list.isEmpty()) {
                throw new ResourceNotFoundException("No resource available");
            }

        } catch (ResourceNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    
    @Override
    public void update(int id, double price) {             // Method to update product price

       
        System.out.println("Enter Product Id to Update:");      // Take id and price from user
        id = sc.nextInt();

        System.out.println("Enter New Price:");
        price = sc.nextDouble();

        try (
            Connection con = DBConnection.getDBConnection();
            PreparedStatement ps =
            con.prepareStatement("update product set price=? where id=?")
        ) {

            
            ps.setDouble(1, price);                          // Set values
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            // If product not found
            if (rows == 0) {
                throw new ResourceNotFoundException("Resource not found!!!");
            }

            System.out.println("Product updated successfully");

        } catch (ResourceNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    @Override
    public void delete(int id) {           // Method to delete product

        System.out.println("Enter Product Id to Delete:");            // Take id from user

        id = sc.nextInt();

        try (
            Connection con = DBConnection.getDBConnection();
            PreparedStatement ps =
            con.prepareStatement("delete from product where id=?")
        ) {

            
            ps.setInt(1, id);                     // Set id
            int rows = ps.executeUpdate();

            // If product not found
            if (rows == 0) {
                throw new ResourceNotFoundException("Resource not found!!!");
            }

            System.out.println("Product deleted successfully");

        } catch (ResourceNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
