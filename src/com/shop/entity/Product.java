package com.shop.entity;

public class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product() {}     // Default constructor

    public Product(int id, String name, double price, int quantity) {       // Parameterized constructor to set all fields
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId(){
    	return id; 
    	}
    public String getName() { 
    	return name; 
    	}
    public double getPrice() {
    	return price;
    	}
    public int getQuantity() { 
    	return quantity; 
    	}

    @Override          // Display product details as string
    public String toString() {           
        return "id=" + id + ", name=" + name +", price=" + price + ", quantity=" + quantity;
    }
}


