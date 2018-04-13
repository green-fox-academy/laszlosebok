package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
  
  private final PostRepository postRepository;
  
  @Autowired
  public MainServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }
  
  @Override
  public List<Post> findAllPostsOrderedByScore() {
    return postRepository.findAllByOrderByScoreDesc();
  }
  
  @Override
  public void changePostScore(String s, int difference) {
    long id = idValidation(s);
    Post post = postRepository.findById(id).orElse(null);
    if (post != null) {
      post.changeScore(difference);
      postRepository.save(post);
    }
  }
  
  private long idValidation(String s) {
    try {
      if (s != null) {
        return Long.parseLong(s);
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid ID was given by user");
    }
    return -1L;
  }
}
