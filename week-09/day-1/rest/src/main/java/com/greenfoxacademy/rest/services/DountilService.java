package com.greenfoxacademy.rest.services;

import org.springframework.stereotype.Service;

@Service
public interface DountilService {

  SumResponse createSumResponse(int number);
  FactorResponse createFactorResponse(int number);
}
