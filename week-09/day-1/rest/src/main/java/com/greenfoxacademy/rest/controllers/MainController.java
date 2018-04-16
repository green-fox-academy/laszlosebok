package com.greenfoxacademy.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
 
  @GetMapping("/")
  public String showMain() {
    
    return "index";
  }
  
  @GetMapping("/doubling")
  @ResponseBody
  public String doubling(@RequestParam("input") String input) {
    return null;
  }
}
