package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
  
  private final MainService mainService;
  
  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }
  
  @GetMapping("/")
  public String showMainPage(Model model) {
    List<Post> posts = mainService.findAllPostsOrderedByScore();
    model.addAttribute("posts", posts);
    return "index";
  }
}
