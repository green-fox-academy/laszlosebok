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
  public Object dountil(@PathVariable("what") String operation, @RequestBody Until until) {
    Integer untilNumber = dountilService.parseInt(until);
    if (untilNumber == null) {
      return "{\"error\": \"Please provide a number!\"}";
    }
    if (operation.equals("sum")) {
      return dountilService.createSumResponse(untilNumber);
    } else if (operation.equals("factor")) {
      return dountilService.createFactorResponse(untilNumber);
    }
    return "{\"error\": \"No such operation!\"}";
  }
}
