package com.greenfoxacademy.rest.models;

public class DoubleResponse {
  
  private int received;
  private int result;
  
  public DoubleResponse(int received) {
    this.received = received;
    result = 2 * received;
  }
  
  public int getReceived() {
    return received;
  }
  
  public void setReceived(int received) {
    this.received = received;
  }
  
  public int getResult() {
    return result;
  }
  
  public void setResult(int result) {
    this.result = result;
  }
}
