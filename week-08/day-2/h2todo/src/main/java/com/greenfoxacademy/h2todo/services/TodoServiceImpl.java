package com.greenfoxacademy.h2todo.services;

import com.greenfoxacademy.h2todo.respositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{
  
  private TodoRepository todoRepository;
  
  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
}
