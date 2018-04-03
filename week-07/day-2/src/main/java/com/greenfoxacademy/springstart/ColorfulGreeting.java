package com.greenfoxacademy.springstart;

import java.util.Random;

public class ColorfulGreeting {
  
  private String content;
  private String color;
  private int fontSize;
  
  private ColorfulGreeting(){
  }
  
  public ColorfulGreeting(String content){
    this();
    this.content = content;
    color = generateColor();
    fontSize = generateFontSize();
  }
  
  private int generateFontSize() {
    Random random = new Random();
    
    return random.nextInt(20) + 10;
  }
  
  private String generateColor() {
    Random random = new Random();
    
    return "rgb(" +
        random.nextInt(255) + ", " +
        random.nextInt(255) + ", " +
        random.nextInt(255) + ")";
  }
  
  public String getContent() {
    return content;
  }
  
  public String getColor() {
    return color;
  }
  
  public int getFontSize() {
    return fontSize;
  }
}
