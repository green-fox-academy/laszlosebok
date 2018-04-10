package com.greenfoxacademy.h2todo.controllers;

import com.greenfoxacademy.h2todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
  
  private TodoService todoService;
  
  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  
  @RequestMapping(value ={"/todo", "/todo/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}
