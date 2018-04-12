package com.greenfoxacademy.mysqltodo.respositories;

import com.greenfoxacademy.mysqltodo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
  
  List<Todo> findAllByTitle(String title);
  List<Todo> findAllByDone(boolean done);
  List<Todo> findAllByUrgent(boolean done);
  List<Todo> findAllByUrgentAndDone(boolean urgent, boolean done);
}
