package com.greenfoxacademy.h2todo.services;

import com.greenfoxacademy.h2todo.models.Todo;

import java.util.List;

public interface TodoService {
  
  List<Todo> getTodoList();
}
