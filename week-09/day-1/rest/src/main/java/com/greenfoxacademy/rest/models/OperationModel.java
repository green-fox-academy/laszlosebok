package com.greenfoxacademy.rest.models;

public class OperationModel {
  
  private String what;
  private int[] numbers;
  
  @Override
  public String toString() {
    String s = "";
    if (what != null) {
      s = "{\"what\": " + what;
      if (numbers != null) {
        s += ", \"numbers\": " + numbersToString();
      }
      s += "}";
    } if (numbers != null) {
      return "{\"numbers\": " + numbersToString() + "}";
    }
    return s;
  }
  
  private String numbersToString() {
    String s = "[";
    for (int number : numbers) {
      s = s.concat(number + ",");
    }
    return s.substring(0, s.length()-1) + "]";
  }
  
  public String getWhat() {
    return what;
  }
  
  public void setWhat(String what) {
    this.what = what;
  }
  
  public int[] getNumbers() {
    return numbers;
  }
  
  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
