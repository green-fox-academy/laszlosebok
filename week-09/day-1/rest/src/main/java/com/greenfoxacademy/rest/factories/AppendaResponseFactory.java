package com.greenfoxacademy.rest.factories;

import com.greenfoxacademy.rest.models.AppendaResponse;
import org.springframework.stereotype.Component;

@Component
public class AppendaResponseFactory {
  
  public AppendaResponse createAppendaResponse(String apendee) {
    return new AppendaResponse(apendee);
  }
}
