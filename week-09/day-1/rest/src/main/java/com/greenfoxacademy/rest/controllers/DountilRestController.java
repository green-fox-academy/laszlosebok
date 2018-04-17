package com.greenfoxacademy.rest.controllers;


import com.greenfoxacademy.rest.models.Until;
import com.greenfoxacademy.rest.services.DountilService;
import com.greenfoxacademy.rest.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dountil/")
public class DountilRestController {
  
  private final DountilService dountilService;
  private final LogService logService;
  
  @Autowired
  public DountilRestController(DountilService dountilService,
                               LogService logService) {
    this.dountilService = dountilService;
    this.logService = logService;
  }
  
  @PostMapping("{what}")
  public Object dountil(@PathVariable(value = "what") String operation,
                        @RequestBody(required = false) Until until) {
    logService.logDountil(operation, until);
    if (until == null || until.getUntil() == null) {
      return "{\"error\": \"Please provide a number!\"}";
    }
    return dountilService.generateResponse(operation, until.getUntil());
  }
}
