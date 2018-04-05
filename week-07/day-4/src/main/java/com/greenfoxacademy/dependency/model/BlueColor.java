package com.greenfoxacademy.dependency.model;

import com.greenfoxacademy.dependency.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BlueColor implements MyColor{
  
  private static final String LOG_MSG = "It is blue in color...";
  
  @Autowired
  Printer printer;
  
  @Override
  public void printColor() {
    printer.log(LOG_MSG);
  }
}
