package com.greenfoxacademy.rest.controllers;


import com.greenfoxacademy.rest.models.Until;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dountil/")
public class DountilRestController {
  
  @PostMapping("{what}")
  public Object dountil(@PathVariable("what") String operation, @RequestBody Until until) {
    if (until == null) {
      return "{\"error\": \"Please provide a number!\"}";
    }
    int untilNumber = until.getUntil();
    if (operation.equals("sum")) {
      return dountilService.createSumResponse(untilNumber);
    } else if (operation.equals("factor")) {
      return dountilService.createFactorResponse(untilNumber);
    }
    return "{\"error\": \"No such operation!\"}";
  }
}
