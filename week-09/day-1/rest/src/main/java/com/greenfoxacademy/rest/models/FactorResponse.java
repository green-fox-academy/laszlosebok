package com.greenfoxacademy.rest.models;

public class FactorResponse {
  
  private long result;
  
  public FactorResponse(int until) {
    result = calculateFactor(until);
  }
  
  private long calculateFactor(int until) {
    long result = 1;
    for (int i = 1; i < until+1; i++) {
      result *= i;
    }
    return result;
  }
  
  public long getResult() {
    return result;
  }
  
  public void setResult(long result) {
    this.result = result;
  }
}
