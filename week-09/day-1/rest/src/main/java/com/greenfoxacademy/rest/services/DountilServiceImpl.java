package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.factories.FactorResponseFactory;
import com.greenfoxacademy.rest.factories.SumResponseFactory;
import com.greenfoxacademy.rest.models.FactorResponse;
import com.greenfoxacademy.rest.models.SumResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DountilServiceImpl  implements DountilService{
  
  private SumResponseFactory sumResponseFactory;
  private FactorResponseFactory factorResponseFactory;
  
  @Autowired
  public DountilServiceImpl(SumResponseFactory sumResponseFactory,
                            FactorResponseFactory factorResponseFactory) {
    this.sumResponseFactory = sumResponseFactory;
    this.factorResponseFactory = factorResponseFactory;
  }
  
  @Override
  public SumResponse createSumResponse(int number) {
    return null;
  }
  
  @Override
  public FactorResponse createFactorResponse(int number) {
    return null;
  }
}
