package com.greenfoxacademy.dependency.model;

import com.greenfoxacademy.dependency.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreenColor implements MyColor {
  
  private static final String LOG_MSG = "It is green in color...";
  
  @Autowired
  Printer printer;
  
  @Override
  public void printColor() {
    printer.log(LOG_MSG);
  }
}
