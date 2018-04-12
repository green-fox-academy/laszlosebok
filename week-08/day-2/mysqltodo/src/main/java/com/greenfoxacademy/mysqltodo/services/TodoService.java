package com.greenfoxacademy.mysqltodo.services;

import com.greenfoxacademy.mysqltodo.models.Todo;

import java.util.List;

public interface TodoService {
  
  List<Todo> findTodos();
  List<Todo> findActiveTodos();
  Todo findTodoById(String id);
  void saveTodo(Todo todo);
  void deleteTodo(String id);
  List<Todo> findListFromUserInput(String userInput);
}
