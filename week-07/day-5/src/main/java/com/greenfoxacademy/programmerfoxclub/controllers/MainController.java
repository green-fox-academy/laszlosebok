package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private final LoginService loginService;
  
  @Autowired
  public MainController(LoginService loginService) {
    this.loginService = loginService;
  }
  
  @GetMapping("/")
  public String showIndexPage(){
    return "index";
  }
  
  @GetMapping("/login")
  public String showLoginPage(){
    return "login";
  }
  
  @PostMapping("/login")
  public String login(@ModelAttribute(name = "petname") String name) {
    loginService.addFox(name);
    return "redirect:/?name=" + name;
  }
}
