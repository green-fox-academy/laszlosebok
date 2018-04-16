package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.AppendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appenda/")
public class AppendaRestController {
  
  private final AppendaService appendaService;
  
  @Autowired
  public AppendaRestController(AppendaService appendaService) {
    this.appendaService = appendaService;
  }
  
  @GetMapping("{appendable}")
  public Object append(@PathVariable(value = "appendable") String appendee) {
    appendaService.log("/appenda/", appendee);
    return appendaService.createAppendaResponse(appendee);
  }
}
