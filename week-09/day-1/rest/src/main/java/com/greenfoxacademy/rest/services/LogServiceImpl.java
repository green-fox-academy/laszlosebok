package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.LogModel;
import com.greenfoxacademy.rest.models.OperationModel;
import com.greenfoxacademy.rest.models.Until;
import com.greenfoxacademy.rest.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
  
  private final LogRepository logRepository;
  
  @Autowired
  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }
  
  @Override
  public void logDoubling(Integer i) {
    final String endpoint = "/doubling";
    String data;
    if (i == null) {
      data = "";
    } else {
      data = "?input=" + String.valueOf(i);
    }
    logRepository.save(new LogModel(endpoint, data));
  }
  
  @Override
  public void logGreeter(String name, String title) {
   final String endpoint = "/greeter";
   String data = "";
   if (name != null) {
     data = "?name=" + name;
     if (title != null) {
       data += "&title=" + title;
     }
   } else if (title != null){
     data = "?title=" + title;
   }
   logRepository.save(new LogModel(endpoint, data));
  }
  
  @Override
  public void logArrays(OperationModel operation) {
    final String endpoint = "/arrays";
    logRepository.save(new LogModel(endpoint, operation.toString()));
  }
  
  @Override
  public void logAppenda(String appendee) {
    final String endpoint = "/appenda/" + appendee;
    logRepository.save(new LogModel(endpoint, ""));
  }
  
  @Override
  public void logDountil(String operation, Until until) {
    final String endpoint = "/dountil/" + operation;
    String data = (until != null) ? until.toString() : "{}" ;
    logRepository.save(new LogModel(endpoint, data));
  }
}
