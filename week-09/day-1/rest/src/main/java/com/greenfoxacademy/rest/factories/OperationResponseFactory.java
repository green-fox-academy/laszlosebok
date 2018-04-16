package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.OperationArrayResponse;
import com.greenfoxacademy.rest.models.OperationIntResponse;
import com.greenfoxacademy.rest.models.OperationModel;
import org.springframework.stereotype.Component;

@Component
public class OperationResponseFactory {
  
  public OperationArrayResponse createOperationArrayResponse(OperationModel operation) {
    return new OperationArrayResponse(operation);
  }
  
  public OperationIntResponse createOperationIntResponse(OperationModel operation) {
    return new OperationIntResponse(operation);
  }
}
