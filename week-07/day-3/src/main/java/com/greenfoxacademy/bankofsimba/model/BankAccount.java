package com.greenfoxacademy.bankofsimba.model;

//Add this BankAccount to the model
//Create a thymeleaf template where you show the fields of the BankAccount

public class BankAccount {
  
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isGoodGuy;
  
  private BankAccount(){
  }
  
  public BankAccount(String name, double balance, String animalType) {
    this();
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
  
  public BankAccount(String name, double balance, String animalType, boolean isKing,
                     boolean isGoodGuy) {
    this(name, balance, animalType);
    this.isKing = isKing;
    this.isGoodGuy = isGoodGuy;
  }
  
  public BankAccount(String name, double balance, String animalType, boolean isGoodGuy) {
    this(name, balance, animalType);
    this.isGoodGuy = isGoodGuy;
  }
  
  public String getName() {
    return name;
  }
  
  public String getTruncatedBalance() {
    return String.format("%.02f", balance) + " Z";
  }
  
  public double getBalance() {
    return balance;
  }
  
  public String getAnimalType() {
    return animalType;
  }
  
  public boolean isKing() {
    return isKing;
  }
  
  public boolean isGoodGuy() {
    return isGoodGuy;
  }
}
