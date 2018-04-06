package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String showIndexPage(){
    return "index";
  }
  
  @GetMapping("/login")
  public String showLoginPage(){
    return "login";
  }
}
