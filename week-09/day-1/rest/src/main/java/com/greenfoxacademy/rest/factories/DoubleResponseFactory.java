package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.DoubleResponse;
import org.springframework.stereotype.Component;

@Component
public class DoubleResponseFactory {
  
  public DoubleResponse createDoubleResponse(int received) {
    return new DoubleResponse(received);
  }
}
