package com.greenfoxacademy.mysqltodo.controllers;

import com.greenfoxacademy.mysqltodo.models.Todo;
import com.greenfoxacademy.mysqltodo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
  public String list(@RequestParam(name = "isActive", required = false) String isActive, Model
      model) {
    List<Todo> todos;
    if (Boolean.parseBoolean(isActive)) {
      todos = todoService.getActiveTodos();
    } else {
      todos = todoService.getTodos();
    }
    
    model.addAttribute("todos", todos);
    return "todoslist";
  }
  
  @GetMapping("add")
  public String showAdd(Model model){
    model.addAttribute("todo", new Todo());
    return "todoform";
  }
  
  @PostMapping("add")
  public String add(@ModelAttribute("todo") Todo todo) {
    todoService.addTodo(todo);
    
    return "redirect:/todo";
  }
  
  @GetMapping("{id}/delete")
  public String delete(@PathVariable("id") String id){
    todoService.deleteTodo(id);
    return "redirect:/todo";
  }
}
