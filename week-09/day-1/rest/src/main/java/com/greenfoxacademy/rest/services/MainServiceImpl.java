package com.greenfoxacademy.rest.services;

import org.springframework.stereotype.Service;

@Service
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
