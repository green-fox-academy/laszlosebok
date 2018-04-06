package com.greenfoxacademy.programmerfoxclub.models;

import java.util.List;

public class Fox {
  
  private String name;
  private List<Trick> tricks;
  private String food;
  private String drink;
  
  public Fox(){
  }
  
  //Getters and Setters
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public List<Trick> getTricks() {
    return tricks;
  }
  
  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }
  
  public String getFood() {
    return food;
  }
  
  public void setFood(String food) {
    this.food = food;
  }
  
  public String getDrink() {
    return drink;
  }
  
  public void setDrink(String drink) {
    this.drink = drink;
  }
}
