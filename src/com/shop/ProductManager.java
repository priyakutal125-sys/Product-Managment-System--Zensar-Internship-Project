package com.shop;

import java.util.Scanner;
import com.shop.dao.ProductDao;

public class ProductManager {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);          // Scanner for user input
        ProductDao dao = new ProductDao();            // Object of ProductDao class
        int ch;                                       // choice variable

        // Menu loop
        do {
            
            System.out.println("\nProduct Menu");
            System.out.println("1 Add Product");
            System.out.println("2 Find Product");
            System.out.println("3 Find All Products");             // Show menu
            System.out.println("4 Update Price");
            System.out.println("5 Delete Product");
            System.out.println("6 Exit");
            System.out.println("Enter choice");

           
            ch = sc.nextInt();                   // Read choice

         // Perform action
            switch (ch) {

                case 1:
                    
                    dao.add(null);          // Add product
                    break;

                case 2:
                   
                    dao.find(0);           // Find product
                    break;

                case 3:
                    
                    dao.findAll();          // Show all products
                    break;

                case 4:
                    
                    dao.update(0, 0);       // Update price
                    break;

                case 5:
                    
                    dao.delete(0);          // Delete product
                    break;

                case 6:
                   
                    System.out.println("Exit");         // Exit program
                    break;

                default:
                    
                    System.out.println("Invalid choice");        // Wrong choice
            }

        } while (ch != 6);          // Repeat menu

        
        sc.close();
    }
}
