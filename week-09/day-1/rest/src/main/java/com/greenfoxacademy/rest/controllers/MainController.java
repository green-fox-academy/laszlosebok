package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  
  private final MainService mainService;
  
  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }
  
  @GetMapping("/")
  public String showMain() {
    
    return "index";
  }
  
  @GetMapping("/doubling")
  @ResponseBody
  public String doubling(@RequestParam("input") String input) {
    if (mainService.parseInt(input) != null) {
      return null;
    }
    return null;
  }
}
