package com.greenfoxacademy.rest.models;

public class SumResponse {

  private int result;
  
  public SumResponse(int until) {
    result = calculateSum(until);
  }
  
  private int calculateSum(int until) {
    int result = 0;
    for (int i = 1; i < until+1; i++) {
      result += i;
    }
    return result;
  }
  
  public int getResult() {
    return result;
  }
  
  public void setResult(int result) {
    this.result = result;
  }
}
