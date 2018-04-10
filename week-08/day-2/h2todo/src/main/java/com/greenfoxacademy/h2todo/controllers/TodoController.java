package com.greenfoxacademy.h2todo.controllers;

import com.greenfoxacademy.h2todo.models.Todo;
import com.greenfoxacademy.h2todo.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
  public String list(Model model) {
    List<Todo> todos = todoServiceImpl.getTodoList();
    
    model.addAttribute("todos", todos);
    return "todoslist";
  }
}
