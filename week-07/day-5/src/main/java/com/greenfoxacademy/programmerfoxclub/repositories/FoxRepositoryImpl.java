package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.databases.FoxDB;
import com.greenfoxacademy.programmerfoxclub.factory.FoxFactory;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoxRepositoryImpl implements FoxRepository {
  
  private final FoxFactory foxFactory;
  
  @Autowired
  public FoxRepositoryImpl(FoxFactory foxFactory) {
    this.foxFactory = foxFactory;
  }
  
  @Override
  public void add(String name) {
    Fox fox = foxFactory.createFox(name);
    FoxDB.getFoxes().add(fox);
  }
  
  @Override
  public void update(Fox fox) {
    List<Fox> foxes = FoxDB.getFoxes();
    foxes
        .stream()
        .filter(o -> o == fox)
        .forEach(o -> o = fox);
  }
  
  @Override
  public void delete(String name) {
    List<Fox> foxes = FoxDB.getFoxes();
    foxes
        .stream()
        .filter(o -> o.getName().equals(name))
        .forEach(foxes::remove);
  }
  
  @Override
  public List<Fox> findAll() {
    return FoxDB.getFoxes();
  }
  
  @Override
  public Fox find(String name) {
    List<Fox> foxes = FoxDB.getFoxes();
    return foxes
        .stream()
        .filter(o -> o.getName().equals(name))
        .findFirst()
        .orElse(null);
  }
}
