package com.greenfoxacademy.mysqltodo.controllers;

import com.greenfoxacademy.mysqltodo.models.Todo;
import com.greenfoxacademy.mysqltodo.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
  
  private TodoServiceImpl todoServiceImpl;
  
  @Autowired
  public TodoController(TodoServiceImpl todoServiceImpl) {
    this.todoServiceImpl = todoServiceImpl;
  }
  
  @RequestMapping(value ={"", "/list"})
  public String list(@RequestParam(name = "isActive", required = false) String isActive, Model
      model) {
    List<Todo> todos;
    if (Boolean.parseBoolean(isActive)) {
      todos = todoServiceImpl.getActiveTodos();
    } else {
      todos = todoServiceImpl.getTodos();
    }
    
    model.addAttribute("todos", todos);
    return "todoslist";
  }
}
