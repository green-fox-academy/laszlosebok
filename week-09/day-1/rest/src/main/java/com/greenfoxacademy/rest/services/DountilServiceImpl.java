package com.greenfoxacademy.rest.services;

import org.springframework.beans.factory.annotation.Autowired;

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
