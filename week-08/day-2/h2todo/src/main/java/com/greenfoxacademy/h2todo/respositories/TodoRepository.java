package com.greenfoxacademy.h2todo.respositories;

import com.greenfoxacademy.h2todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
