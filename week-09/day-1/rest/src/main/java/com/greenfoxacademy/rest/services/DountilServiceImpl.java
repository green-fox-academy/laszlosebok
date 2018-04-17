package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.FactorResponse;
import com.greenfoxacademy.rest.models.SumResponse;
import com.greenfoxacademy.rest.models.Until;
import org.springframework.stereotype.Service;

@Service
public class DountilServiceImpl  implements DountilService{
  
  private SumResponse createSumResponse(int number) {
    return new SumResponse(number);
  }
  
  private FactorResponse createFactorResponse(int number) {
    return new FactorResponse(number);
  }
  
  @Override
  public Object generateResponse(String operation, Integer untilNumber) {
    if (operation.equals("sum")) {
      return createSumResponse(untilNumber);
    } else if (operation.equals("factor")) {
      return createFactorResponse(untilNumber);
    }
    return "{\"error\": \"No such operation!\"}";
  }
}
