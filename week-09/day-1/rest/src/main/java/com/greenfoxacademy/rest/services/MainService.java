package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.DoubleResponse;
import org.springframework.stereotype.Service;

@Service
public interface MainService {

  Integer parseInt(String s);
  DoubleResponse createDoubleResponse(Integer number);
}
