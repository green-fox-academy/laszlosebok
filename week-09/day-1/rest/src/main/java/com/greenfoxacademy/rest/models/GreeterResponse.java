package com.greenfoxacademy.rest.models;

public class GreeterResponse {
  
  private String Welcome_message;
  
  public GreeterResponse(String name, String title) {
    Welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }
  
  public String getWelcome_message() {
    return Welcome_message;
  }
  
  public void setWelcome_message(String welcome_message) {
    Welcome_message = welcome_message;
  }
}
