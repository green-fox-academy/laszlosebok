package com.greenfoxacademy.rest.models;

public class Until {

  private Integer until;
  
  public Until(){
  }
  
  @Override
  public String toString() {
    return "{\"until\": "+ until +"}";
  }
  
  public Integer getUntil() {
    return until;
  }
  
  public void setUntil(Integer until) {
    this.until = until;
  }
}
