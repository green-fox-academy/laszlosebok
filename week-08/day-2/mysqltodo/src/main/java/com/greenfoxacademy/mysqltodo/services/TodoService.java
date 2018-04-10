package com.greenfoxacademy.mysqltodo.services;

import com.greenfoxacademy.mysqltodo.models.Todo;

import java.util.List;

public interface TodoService {
  
  List<Todo> getTodos();
  List<Todo> getActiveTodos();
  boolean addTodo(Todo todo);
  boolean deleteTodo(String id);
}
