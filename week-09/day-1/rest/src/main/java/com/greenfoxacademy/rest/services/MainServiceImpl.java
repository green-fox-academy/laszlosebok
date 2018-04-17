package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.factories.OperationResponseFactory;
import com.greenfoxacademy.rest.models.DoubleResponse;
import com.greenfoxacademy.rest.models.GreeterResponse;
import com.greenfoxacademy.rest.models.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
  
  private final OperationResponseFactory operationResponseFactory;
  
  @Autowired
  public MainServiceImpl(OperationResponseFactory operationResponseFactory) {
    this.operationResponseFactory = operationResponseFactory;
  }
  
  @Override
  public DoubleResponse createDoubleResponse(Integer number) {
    return new DoubleResponse(number);
  }
  
  @Override
  public GreeterResponse createGreeterResponse(String name, String title) {
    return new GreeterResponse(name, title);
  }
  
  @Override
  public Object createOperationResponse(OperationModel operation) {
    return operationResponseFactory.createOperationResponse(operation);
  }
}
