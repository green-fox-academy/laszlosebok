package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.OperationModel;
import com.greenfoxacademy.rest.services.LogService;
import com.greenfoxacademy.rest.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {
  
  private final MainService mainService;
  private final LogService logService;
  
  @Autowired
  public MainRestController(MainService mainService,
                            LogService logService) {
    this.mainService = mainService;
    this.logService = logService;
  }
  
  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    logService.logDoubling(input);
    if (input != null) {
      return mainService.createDoubleResponse(input);
    }
    return "{\"error\": \"Please provide an input!\"}";
  }
  
  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    logService.logGreeter(name, title);
    if (name != null && title != null && !name.isEmpty() && !title.isEmpty()) {
      return mainService.createGreeterResponse(name, title);
    }
    return "{\"error\": \"Please provide a name!\"}";
  }
  
  @PostMapping("/arrays")
  public Object arrays(@RequestBody OperationModel operation) {
    logService.logArrays(operation);
    if (operation.getWhat() == null || operation.getNumbers() == null) {
      return "{\"error\": \"Please provide what to do with the numbers!\"}";
    }
    return mainService.createOperationResponse(operation);
  }
  
  
}
