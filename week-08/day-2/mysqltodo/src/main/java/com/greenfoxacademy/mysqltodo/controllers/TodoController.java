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
  
  @GetMapping("")
  public String redirectTodo() {
    return "redirect:/todo/";
  }
  
  @RequestMapping(value ={"/", "/list"}, method = RequestMethod.GET)
  public String showAllTodos(@RequestParam(name = "isActive", required = false) String isActive,
                     Model model) {
    List<Todo> todos;
    if (Boolean.parseBoolean(isActive)) {
      todos = todoService.findActiveTodos();
    } else {
      todos = todoService.findTodos();
    }
    
    model.addAttribute("todos", todos);
    return "todoslist";
  }
  
  @RequestMapping(value ={"/", "/list"}, method = RequestMethod.POST)
  public String showTodosWithArgs(@ModelAttribute("args") String userInput, Model model) {
    List<Todo> todos;
    todos = todoService.findListFromUserInput(userInput);
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
    todoService.saveTodo(todo);
    
    return "redirect:/todo";
  }
  
  @GetMapping("{id}/delete")
  public String delete(@PathVariable("id") String id) {
    todoService.deleteTodo(id);
    return "redirect:/todo";
  }
  
  @GetMapping("{id}/edit")
  public String showEdit(@PathVariable("id") String id, Model model) {
    Todo todo = todoService.findTodoById(id);
    if (todo == null) {
      return "redirect:/todo";
    }
    model.addAttribute("todo", todo);
    return "edittodo";
  }
  
  @PostMapping("{id}/edit")
  public String edit(@PathVariable("id") String id, @ModelAttribute("todo") Todo todo) {
    todoService.saveTodo(todo);
    return "redirect:/todo";
  }
  
  @GetMapping("{id}/")
  public String showInfo(@PathVariable("id") String id, Model model) {
    Todo todo = todoService.findTodoById(id);
    model.addAttribute("todo", todo);
    return "showtodoinfo";
  }
}
