package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.AppendaResponse;
import org.springframework.stereotype.Service;

@Service
public interface AppendaService {
  
  AppendaResponse createAppendaResponse(String appendee);
}
