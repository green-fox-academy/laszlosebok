package com.greenfoxacademy.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/appenda/")
public class AppendaRestController {
  
  @GetMapping("{appendable}")
  public Object append(@PathVariable(value = "appendable", required = false) String appendee) {
  
  }
}
