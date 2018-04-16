package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.DoubleResponse;
import com.greenfoxacademy.rest.models.GreeterResponse;
import com.greenfoxacademy.rest.models.OperationModel;
import org.springframework.stereotype.Service;

@Service
public interface MainService {

  Integer parseInt(String s);
  DoubleResponse createDoubleResponse(Integer number);
  GreeterResponse createGreeterResponse(String name, String title);
  Object createOperationResponse(OperationModel operation);
  void log(String endpoint, String input);
}
