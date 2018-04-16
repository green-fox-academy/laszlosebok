package com.greenfoxacademy.rest.repositories;

import com.greenfoxacademy.rest.models.LogModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface LogRepository extends CrudRepository<LogModel, Long> {
}
