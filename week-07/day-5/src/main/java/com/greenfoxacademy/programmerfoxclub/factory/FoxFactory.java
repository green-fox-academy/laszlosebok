package com.greenfoxacademy.programmerfoxclub.factory;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

@Component
public class FoxFactory {
  
  public Fox createFox(String name) {
    Fox fox = new Fox(name);
    
    return fox;
  }
}
