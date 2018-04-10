package com.greenfoxacademy.bankofsimba.model;

//Add this BankAccount to the model
//Create a thymeleaf template where you show the fields of the BankAccount

public class BankAccount {
  
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean GoodGuy;
  
  public BankAccount(){
  }
  
  private BankAccount(String name, double balance, String animalType) {
    this();
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
  
  public BankAccount(String name, double balance, String animalType, boolean isKing,
                     boolean GoodGuy) {
    this(name, balance, animalType, GoodGuy);
    this.isKing = isKing;
  }
  
  public BankAccount(String name, double balance, String animalType, boolean GoodGuy) {
    this(name, balance, animalType);
    this.GoodGuy = GoodGuy;
  }
  
  public void increaseFund() {
    if (this.isKing) {
      balance += 100;
    } else {
      balance += 10;
    }
  }
  
  public String getTruncatedBalance() {
    return String.format("%.02f", balance) + " Z";
  }
  
  // Getters and Setters
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  public String getAnimalType() {
    return animalType;
  }
  
  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
  
  public boolean getIsKing() {
    return isKing;
  }
  
  public boolean isKing() {
    return isKing;
  }
  
  public void setIsKing(boolean king) {
    isKing = king;
  }
  
  public boolean getGoodGuy() {
    return GoodGuy;
  }
  
  public void setGoodGuy(boolean goodGuy) {
    GoodGuy = goodGuy;
  }
}
