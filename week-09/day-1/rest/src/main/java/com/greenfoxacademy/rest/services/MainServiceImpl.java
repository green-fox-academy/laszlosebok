package com.greenfoxacademy.rest.services;

public class MainServiceImpl implements MainService {
  
  @Override
  public Integer parseInt(String s) {
    
    try {
      return Integer.parseInt(s);
    } catch (NullPointerException e) {
      return null;
    }
  }
}
