package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.factories.PostFactory;
import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements AddService {
  
  private final PostFactory postFactory;
  
  @Autowired
  public AddServiceImpl(PostFactory postFactory) {
    this.postFactory = postFactory;
  }
  
  @Override
  public Post createNewPost() {
    return postFactory.createPost();
  }
}
