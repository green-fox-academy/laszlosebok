package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FoxRepository {
  
  boolean add();
  boolean update();
  boolean delete();
  List<Fox> findAll();
  Fox find();
  
}
