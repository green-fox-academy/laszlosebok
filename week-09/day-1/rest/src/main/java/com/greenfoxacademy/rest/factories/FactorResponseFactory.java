package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.FactorResponse;
import org.springframework.stereotype.Component;

@Component
public class FactorResponseFactory {
  
  public FactorResponse createFactorResponse(int until) {
    return new FactorResponse(until);
  }
}
