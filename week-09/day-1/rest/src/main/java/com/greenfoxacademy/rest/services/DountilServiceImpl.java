package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.FactorResponse;
import com.greenfoxacademy.rest.models.SumResponse;
import com.greenfoxacademy.rest.models.Until;
import org.springframework.stereotype.Service;

@Service
public class DountilServiceImpl  implements DountilService{
  
  @Override
  public SumResponse createSumResponse(int number) {
    return new SumResponse(number);
  }
  
  @Override
  public FactorResponse createFactorResponse(int number) {
    return new FactorResponse(number);
  }
  
  @Override
  public Integer parseInt(Until until) {
    
    try {
      return Integer.parseInt(until.getUntil());
    } catch (NumberFormatException e) {
      return null;
    } catch (NullPointerException e) {
      return null;
    }
  }
}
