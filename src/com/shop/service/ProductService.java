package com.shop.service;

import java.util.List;
import com.shop.entity.Product;

public interface ProductService {          // Interface for product operations
void add(Product product);                 // Add a new product
Product find(int id);                    // Find a product by ID
List<Product> findAll();                 // Get all products   
void update(int id, double price);         // Update price of a product
void delete(int id);                       // Delete a product by ID
}
