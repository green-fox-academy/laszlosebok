package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
  
  private final MainService mainService;
  
  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }
  
  @GetMapping("/")
  public String showMainPage(String stringId, Model model) {
    
    List<Post> posts = mainService.findAllPostsOrderedByScore();
    model.addAttribute("posts", posts);
    return "index";
  }
  
  @GetMapping("/increase")
  public String increasePostScore(@RequestParam(value = "id") String stringId) {
    final int difference = 1;
    mainService.changePostScore(stringId, difference);
    return "redirect:/";
  }
  
  @GetMapping("/decrease")
  public String decreasePostScore(@RequestParam(value = "id") String stringId) {
    final int difference = -1;
    mainService.changePostScore(stringId, difference);
    return "redirect:/";
  }
}
