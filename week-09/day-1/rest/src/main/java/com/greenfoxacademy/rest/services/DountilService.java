package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.Until;
import org.springframework.stereotype.Service;

@Service
public interface DountilService {
  
  Integer parseInt(Until until);
  Object generateResponse(String operation, Integer untilNumber);
}
