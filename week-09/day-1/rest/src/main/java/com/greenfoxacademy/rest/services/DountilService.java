package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.FactorResponse;
import com.greenfoxacademy.rest.models.SumResponse;
import com.greenfoxacademy.rest.models.Until;
import org.springframework.stereotype.Service;

@Service
public interface DountilService {

  SumResponse createSumResponse(int number);
  FactorResponse createFactorResponse(int number);
  Integer parseInt(Until until);
}
