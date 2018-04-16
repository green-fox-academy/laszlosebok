package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.SumResponse;
import org.springframework.stereotype.Component;

@Component
public class SumResponseFactory {
  
  public SumResponse createSumResponse(int until) {
    return new SumResponse(until);
  }
}
