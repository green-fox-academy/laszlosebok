package com.greenfoxacademy.mysqltodo.services;

import com.greenfoxacademy.mysqltodo.models.Todo;
import com.greenfoxacademy.mysqltodo.respositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
  
  private TodoRepository todoRepository;
  
  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  
  @Override
  public List<Todo> findTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository
        .findAll()
        .forEach(todos::add);
    
    return todos;
  }
  
  @Override
  public List<Todo> findActiveTodos() {
    return todoRepository.findAllByDone(false);
  }
  
  @Override
  public void saveTodo(Todo todo) {
    todoRepository.save(todo);
  }
  
  @Override
  public void deleteTodo(String idString) {
    try {
      long id = Long.parseLong(idString);
      todoRepository.deleteById(id);
    } catch (NumberFormatException e) {
      // handled exception
    }
  }
  
  @Override
  public Todo findTodoById(String idString) {
    try {
      long id = Long.parseLong(idString);
      return todoRepository.findById(id).orElse(null);
    } catch (NumberFormatException e) {
      return null;
    }
  }
  
  @Override
  public List<Todo> findListFromUserInput(String input) {
    if (!validityCheck(input)) {
      return findTodos();
    }
    String[] args = inputToArray(input);
    if (args[0].length() == 0 && args[1].length() == 0 && args[2].length() == 0) {
      return findTodos();
    }
    if (args[0].length() > 0) {
      return todoRepository.findAllByTitle(args[0]);
    } else {
      return findTodoByFilters(args[1],args[2]);
    }
  }
  
  private String[] inputToArray(String s) {
    
    // 0th index is the title
    // 1st string value of boolean urgent
    // 2nd string value of boolean done
    // they remain "" if that particular argument was not given in the search box
    
    String[] args = new String[]{"", "", ""};
    boolean hasUrgentFilter = s.contains("urgent:");
    boolean hasDoneFilter = s.contains("done:");
    String title = parseTitle(s);
    boolean hasTitle = (title.length() > 0);
    if (hasTitle) {
      args[0] = title;
    }
    if (hasUrgentFilter) {
      args[1] = parseFilterValue(s, "urgent:");
    }
    if (hasDoneFilter) {
      args[2] = parseFilterValue(s, "done:");
    }
    return args;
  }
  
  private List<Todo> findTodoByFilters(String urgent, String done) {
    boolean isUrgent = Boolean.parseBoolean(urgent);
    boolean isDone = Boolean.parseBoolean(done);
    
    if(urgent.equals("") && done.equals("")) {
      return  findTodos();
    } else if (urgent.equals("")) {
      return todoRepository.findAllByDone(isDone);
    } else if (done.equals("")) {
      return todoRepository.findAllByUrgent(isUrgent);
    } else {
      return todoRepository.findAllByUrgentAndDone(isUrgent, isDone);
    }
  }
  
  private boolean validityCheck(String s) {
    return (s != null && s.trim().length() > 0);
  }
  
  private String parseFilterValue(String s, String splitBy) {
    if (s.split(splitBy)[1].startsWith("yes")) {
      return "true";
    } else if (s.split(splitBy)[1].startsWith("no")) {
      return "false";
    } else {
      return "";
    }
  }
  
  private String parseTitle(String s) {
    return s
        .replace("urgent:yes", "")
        .replace("urgent:no", "")
        .replace("done:yes", "")
        .replace("done:no", "")
        .trim();
  }
}
