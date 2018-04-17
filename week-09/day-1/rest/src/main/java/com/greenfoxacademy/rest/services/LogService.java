package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.OperationModel;
import com.greenfoxacademy.rest.models.Until;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
  void logDoubling(Integer i);
  void logGreeter(String name, String title);
  void logArrays(OperationModel operation);
  void logAppenda(String appendee);
  void logDountil(String operation, Until until);
}
