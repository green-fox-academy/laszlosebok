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
}
