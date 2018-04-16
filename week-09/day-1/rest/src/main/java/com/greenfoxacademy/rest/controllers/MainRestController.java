package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
  
  private final MainService mainService;
  
  @Autowired
  public MainRestController(MainService mainService) {
    this.mainService = mainService;
  }
  
  @GetMapping("/doubling")
  public Object doubling(@RequestParam("input") String input) {
    Integer number = mainService.parseInt(input);
    if (number != null) {
      return mainService.createDoubleResponse(number);
    }
    return "{\"error\": \"Please provide an input!\"}";
  }
  
  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null && !name.isEmpty() && !title.isEmpty()) {
      return mainService.createGreeterResponse(name, title);
    }
    return "{\"error\": \"Please provide a name!\"}";
  }
}
