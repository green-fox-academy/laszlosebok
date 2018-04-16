package com.greenfoxacademy.rest.controllers;


import com.greenfoxacademy.rest.models.Until;
import com.greenfoxacademy.rest.services.DountilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dountil/")
public class DountilRestController {
  
  private DountilService dountilService;
  
  @Autowired
  public DountilRestController(DountilService dountilService) {
    this.dountilService = dountilService;
  }
  
  @PostMapping("{what}")
  public Object dountil(@PathVariable(value = "what") String operation,
                        @RequestBody(required = false) Until until) {
    Integer untilNumber = dountilService.parseInt(until);
    if (untilNumber == null) {
      return "{\"error\": \"Please provide a number!\"}";
    }
    return dountilService.generateResponse(operation, untilNumber);
  }
}
