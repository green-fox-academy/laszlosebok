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
  public List<Post> findPostsOrderedByScore(int postPerPage, int page) {
    int startIndex = (page - 1) * postPerPage;
    int endIndex = page * postPerPage - 1;
    return postRepository.findAllByOrderByScoreDesc().subList(startIndex, endIndex);
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
  
  @Override
  public boolean pageNumberValidation(String s) {
    try {
      return (s !=null && Integer.parseInt(s) > 1);
    } catch (NumberFormatException e) {
      return false;
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
