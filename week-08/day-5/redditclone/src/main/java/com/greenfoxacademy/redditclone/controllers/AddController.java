package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class AddController {
  
  @GetMapping
  public String showAddPage(Model model) {
    Post post = postFactory.create();
    model.addAttribute("post", post);
    return "add-form";
  }
}
