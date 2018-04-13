package com.greenfoxacademy.redditclone.factories;

import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.stereotype.Component;

@Component
public class PostFactory {
  
  public Post createPost(){
    return new Post();
  }
}
