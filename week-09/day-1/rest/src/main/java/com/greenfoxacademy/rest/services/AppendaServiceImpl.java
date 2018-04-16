package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.factories.AppendaResponseFactory;
import com.greenfoxacademy.rest.models.AppendaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppendaServiceImpl implements AppendaService {
  
  private final AppendaResponseFactory appendaResponseFactory;
  
  @Autowired
  public AppendaServiceImpl(AppendaResponseFactory appendaResponseFactory) {
    this.appendaResponseFactory = appendaResponseFactory;
  }
  
  @Override
  public AppendaResponse createAppendaResponse(String appendee) {
    return appendaResponseFactory.createAppendaResponse(appendee);
  }
}
