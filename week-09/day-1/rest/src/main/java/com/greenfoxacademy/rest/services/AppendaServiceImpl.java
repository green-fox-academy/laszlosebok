package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.AppendaResponse;
import com.greenfoxacademy.rest.models.LogModel;
import com.greenfoxacademy.rest.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppendaServiceImpl implements AppendaService {
  
  private LogRepository logRepository;
  
  @Autowired
  AppendaServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }
  
  @Override
  public AppendaResponse createAppendaResponse(String appendee) {
    return new AppendaResponse(appendee);
  }
  
  @Override
  public void log(String s, String appendee) {
    logRepository.save(new LogModel(s, appendee));
  }
}
