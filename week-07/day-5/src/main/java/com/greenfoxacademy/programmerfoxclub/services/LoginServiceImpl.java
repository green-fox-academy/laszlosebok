package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
  
  private final FoxRepository foxRepository;
  
  @Autowired
  public LoginServiceImpl(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }
  
  @Override
  public boolean addFox(String name) {
    foxRepository.add(name);
  }
}
