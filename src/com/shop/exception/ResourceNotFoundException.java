package com.shop.exception;

public class ResourceNotFoundException extends Exception {

 
 public ResourceNotFoundException() {
     super("Resource not found");                          // Default constructor
 }

  public ResourceNotFoundException(String message) {
     super(message);                                       // Parameterized constructor
 }
}


