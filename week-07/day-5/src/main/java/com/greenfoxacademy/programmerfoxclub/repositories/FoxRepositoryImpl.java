package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoxRepositoryImpl implements FoxRepository {
  
  @Override
  public boolean add() {
    return false;
  }
  
  @Override
  public boolean update() {
    return false;
  }
  
  @Override
  public boolean delete() {
    return false;
  }
  
  @Override
  public List<Fox> findAll() {
    return null;
  }
  
  @Override
  public Fox find() {
    return null;
  }
}
