package com.greenfoxacademy.h2todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
  
  @RequestMapping(value ={"/todo", "/", "/todo/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}
