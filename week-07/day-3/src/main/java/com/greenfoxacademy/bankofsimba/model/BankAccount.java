package com.greenfoxacademy.bankofsimba.model;

//For this create a BankAccount class in your model package
//Add the fields name, balance, animalType in it
//In your controller create the first endpoint called /show
//Instantiate a new BankAccount("Simba", "2000", "lion")
//Add this BankAccount to the model
//Create a thymeleaf template where you show the fields of the BankAccount

public class BankAccount {
  
  private String name;
  private int balance;
  private String animalType;
  
  private BankAccount(){
  }
  
  public BankAccount(String name, int balance, String animalType) {
    this();
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
  
}
