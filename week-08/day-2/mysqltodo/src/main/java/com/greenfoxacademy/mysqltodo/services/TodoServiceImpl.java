package com.greenfoxacademy.mysqltodo.services;

import com.greenfoxacademy.mysqltodo.models.Todo;
import com.greenfoxacademy.mysqltodo.respositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService{
  
  private TodoRepository todoRepository;
  
  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  
  @Override
  public List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository
        .findAll()
        .forEach(todos::add);
    
    return todos;
  }
  
  @Override
  public List<Todo> getActiveTodos() {
    List<Todo> todos = getTodos()
        .stream()
        .filter(t -> !t.isDone())
        .collect(Collectors.toList());
    
    return todos;
  }
}
