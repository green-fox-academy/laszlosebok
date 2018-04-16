package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.OperationArrayResponse;
import com.greenfoxacademy.rest.models.OperationIntResponse;
import com.greenfoxacademy.rest.models.OperationModel;
import org.springframework.stereotype.Component;

@Component
public class OperationResponseFactory {
  
  private OperationArrayResponse createArrayResponse(OperationModel operation) {
    return new OperationArrayResponse(operation);
  }
  
  private OperationIntResponse createIntResponse(OperationModel operation) {
    return new OperationIntResponse(operation);
  }
  
  public Object createOperationResponse(OperationModel operation) {
    String what = operation.getWhat();
    if (what.equals("double")) {
      return createArrayResponse(operation);
    } else if (what.equals("sum") || what.equals("multiply")) {
      return createIntResponse(operation);
    }
    return null;
  }
}
