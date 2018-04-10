package com.greenfoxacademy.mysqltodo.respositories;

import com.greenfoxacademy.mysqltodo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
