package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.factories.PostFactory;
import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements AddService {
  
  private final PostFactory postFactory;
  private final PostRepository postRepository;
  
  @Autowired
  public AddServiceImpl(PostFactory postFactory, PostRepository postRepository) {
    this.postFactory = postFactory;
    this.postRepository = postRepository;
  }
  
  @Override
  public Post createNewPost() {
    return postFactory.createPost();
  }
  
  @Override
  public void savePost(Post post) {
    postRepository.save(post);
  }
}
