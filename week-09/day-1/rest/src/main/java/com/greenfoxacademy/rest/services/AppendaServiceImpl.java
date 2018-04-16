package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.AppendaResponse;
import org.springframework.stereotype.Service;

@Service
public class AppendaServiceImpl implements AppendaService {
  
  @Override
  public AppendaResponse createAppendaResponse(String appendee) {
    return new AppendaResponse(appendee);
  }
}
