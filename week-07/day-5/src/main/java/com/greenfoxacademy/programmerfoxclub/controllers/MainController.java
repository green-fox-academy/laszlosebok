package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
  
  @PostMapping("/login")
  public String login(@ModelAttribute(value = "petname") String name) {
    System.out.println(name);
    return "redirect:/";
  }
}
