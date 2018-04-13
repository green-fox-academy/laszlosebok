package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.factories.PostFactory;
import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.services.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class AddController {
  
  private final AddService addService;
  
  @Autowired
  public AddController(AddService addService) {
    this.addService = addService;
  }
  
  @GetMapping("/")
  public String showAddPage(Model model) {
    Post post = addService.createNewPost();
    model.addAttribute("post", post);
    return "add-form";
  }
  
  @PostMapping("/")
  public String addPost(@ModelAttribute("post") Post post) {
    return "redirect:/";
  }
  
}
