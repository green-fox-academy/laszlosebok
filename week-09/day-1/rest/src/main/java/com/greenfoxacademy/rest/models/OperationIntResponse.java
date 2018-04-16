package com.greenfoxacademy.rest.models;

public class OperationIntResponse {

  private Integer result;
  
  public OperationIntResponse(OperationModel operation) {
    result = calculateResult(operation);
  }
  
  private Integer calculateResult(OperationModel operation) {
    switch (operation.getWhat()) {
      case "sum" :
        return sum(operation.getNumbers());
      case "multiply":
        return multiply(operation.getNumbers());
    }
    return null;
  }
  
  private Integer multiply(int[] numbers) {
    int result = 0;
    for (int number : numbers) {
      result *= number;
    }
    return result;
  }
  
  private Integer sum(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
  
  
}
