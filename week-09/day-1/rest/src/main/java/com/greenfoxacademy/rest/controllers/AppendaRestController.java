package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.AppendaService;
import com.greenfoxacademy.rest.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appenda/")
public class AppendaRestController {
  
  private final AppendaService appendaService;
  private final LogService logService;
  @Autowired
  public AppendaRestController(AppendaService appendaService,
                               LogService logService) {
    this.appendaService = appendaService;
    this.logService = logService;
  }
  
  @GetMapping("{appendable}")
  public Object append(@PathVariable(value = "appendable") String appendee) {
    logService.logAppenda(appendee);
    return appendaService.createAppendaResponse(appendee);
  }
}
