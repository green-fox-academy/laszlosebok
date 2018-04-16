package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.factories.DoubleResponseFactory;
import com.greenfoxacademy.rest.factories.GreeterResponseFactory;
import com.greenfoxacademy.rest.models.DoubleResponse;
import com.greenfoxacademy.rest.models.GreeterResponse;
import com.greenfoxacademy.rest.models.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
  
  private final OperationResponseFactory  operationResponseFactory;
  private final DoubleResponseFactory doubleResponseFactory;
  private final GreeterResponseFactory greeterResponseFactory;
  
  @Autowired
  public MainServiceImpl(DoubleResponseFactory doubleResponseFactory,
                         GreeterResponseFactory greeterResponseFactory,
                         OperationResponseFactory operationResponseFactory) {
    this.doubleResponseFactory = doubleResponseFactory;
    this.greeterResponseFactory = greeterResponseFactory;
  }
  
  @Override
  public Integer parseInt(String s) {
    
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return null;
    }
  }
  
  @Override
  public DoubleResponse createDoubleResponse(Integer number) {
    return doubleResponseFactory.createDoubleResponse(number);
  }
  
  @Override
  public GreeterResponse createGreeterResponse(String name, String title) {
    return greeterResponseFactory.createGreeterResponse(name, title);
  }
  
  @Override
  public Object createOperationResponse(OperationModel operation) {
    String what = operation.getWhat();
    if (what.equals("double")) {
      return operationResponseFactory.createOperationArrayResult(operation);
    } else if (what.equals("sum") || what.equals("multiply")) {
      return operationResponseFactory.createOperationIntResult(operation);
    }
    return null;
  }
}
