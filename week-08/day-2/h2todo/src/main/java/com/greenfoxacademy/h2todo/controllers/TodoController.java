package com.greenfoxacademy.h2todo.controllers;

import com.greenfoxacademy.h2todo.models.Todo;
import com.greenfoxacademy.h2todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
  
  private TodoService todoService;
  
  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  
  @RequestMapping(value ={"", "/list"})
  public String list(Model model) {
    
    List<Todo> todos = new ArrayList<>(Arrays.asList(
        new Todo("Start the day"),
        new Todo("Finish H2 workshop1"),
        new Todo("Finish JPA workshop2"),
        new Todo("Create CRUD project")
    ));
    
    model.addAttribute("todos", todos);
    return "todoslist";
  }
}
