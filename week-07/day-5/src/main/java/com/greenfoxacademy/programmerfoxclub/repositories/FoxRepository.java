package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FoxRepository {
  
  void add(String name);
  void update(Fox fox);
  void delete(String name);
  List<Fox> findAll();
  Fox find(String name);
  
}
