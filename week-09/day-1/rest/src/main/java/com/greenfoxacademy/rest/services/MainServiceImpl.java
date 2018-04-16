package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.factories.DoubleResponseFactory;
import com.greenfoxacademy.rest.models.DoubleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
  
  private final DoubleResponseFactory doubleResponseFactory;
  
  @Autowired
  public MainServiceImpl(DoubleResponseFactory doubleResponseFactory) {
    this.doubleResponseFactory = doubleResponseFactory;
  }
  
  @Override
  public Integer parseInt(String s) {
    
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return null;
    }
  }
  
  @Override
  public DoubleResponse createDoubleResponse(Integer number) {
    return doubleResponseFactory.createDoubleResponse(number);
  }
}
