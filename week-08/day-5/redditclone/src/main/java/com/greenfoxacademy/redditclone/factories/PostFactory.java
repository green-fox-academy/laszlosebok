package com.greenfoxacademy.redditclone.factories;

import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PostFactory {
  
  public Post createPost(){
    Post post = new Post();
    post.setCreatedAt(LocalDateTime.now());
    return post;
  }
}
