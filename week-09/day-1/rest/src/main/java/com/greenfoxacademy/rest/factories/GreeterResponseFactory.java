package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.GreeterResponse;

public class GreeterResponseFactory {
  
  public GreeterResponse createGreeterResponse(String name, String title) {
    return new GreeterResponse(name, title);
  }
}
