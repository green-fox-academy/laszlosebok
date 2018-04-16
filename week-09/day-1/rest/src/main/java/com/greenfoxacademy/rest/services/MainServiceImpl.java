package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.factories.OperationResponseFactory;
import com.greenfoxacademy.rest.models.DoubleResponse;
import com.greenfoxacademy.rest.models.GreeterResponse;
import com.greenfoxacademy.rest.models.LogModel;
import com.greenfoxacademy.rest.models.OperationModel;
import com.greenfoxacademy.rest.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
  
  private final OperationResponseFactory operationResponseFactory;
  private final LogRepository logRepository;
  
  @Autowired
  public MainServiceImpl(OperationResponseFactory operationResponseFactory,
                         LogRepository logRepository) {
    this.operationResponseFactory = operationResponseFactory;
    this.logRepository = logRepository;
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
  
  @Override
  public void log(String endpoint, String input) {
    logRepository.save(new LogModel(endpoint, input));
  }
}
