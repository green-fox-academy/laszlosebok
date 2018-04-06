package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

  boolean addFox(String name);
  Fox getFox(String name);
}
