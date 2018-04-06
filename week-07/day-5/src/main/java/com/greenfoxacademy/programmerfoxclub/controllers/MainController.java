package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private final LoginService loginService;
  
  @Autowired
  public MainController(LoginService loginService) {
    this.loginService = loginService;
  }
  
  @GetMapping("/")
  public String showIndexPage(@RequestParam(name = "petname", required = false) String name,
                              Model model){
    Fox fox = loginService.getFox(name);
    if (name == null || fox == null) {
      return "redirect:/login";
    }
    model.addAttribute("fox", fox);
    return "index";
  }
  
  @GetMapping("/login")
  public String showLoginPage(){
    return "login";
  }
  
  @PostMapping("/login")
  public String login(@ModelAttribute(name = "petname") String name) {
    loginService.addFox(name);
    return "redirect:/?petname=" + name;
  }
}
