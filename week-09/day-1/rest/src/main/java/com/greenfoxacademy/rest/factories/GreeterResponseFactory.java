package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.GreeterResponse;
import org.springframework.stereotype.Component;

@Component
public class GreeterResponseFactory {
  
  public GreeterResponse createGreeterResponse(String name, String title) {
    return new GreeterResponse(name, title);
  }
}
