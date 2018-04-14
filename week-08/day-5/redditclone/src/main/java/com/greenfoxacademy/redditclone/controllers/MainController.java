package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
  
  private final int postPerPage = 10;
  
  private final MainService mainService;
  
  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }
  
  @GetMapping("/")
  public String showMainPage(Model model) {
    final int page = 1;
    List<Post> posts = mainService.findPostsOrderedByScore(postPerPage, page);
    model.addAttribute("posts", posts);
    model.addAttribute("page", page);
    return "index";
  }
  
  @GetMapping("/page/{pageNum}")
  public String showPage(@PathVariable(value = "pageNum", required = false) String pageNum,
                         Model model) {
    if (mainService.pageNumberValidation(pageNum)) {
      int page = Integer.parseInt(pageNum);
      List<Post> posts = mainService.findPostsOrderedByScore(postPerPage, page);
      model.addAttribute("posts", posts);
      model.addAttribute("page", page);
      return "index";
    } else {
      return "redirect:/";
    }
    
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
