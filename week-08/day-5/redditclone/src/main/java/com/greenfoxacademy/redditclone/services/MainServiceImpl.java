package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
  
  private final int postPerPage = 5;
  private final PostRepository postRepository;
  
  @Autowired
  public MainServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
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
      List<Post> posts = postRepository.findAllByOrderByScoreDesc();
      int requireSize = (Integer.parseInt(s) - 1) * postPerPage;
      return (Integer.parseInt(s) > 1 && posts.size() >= requireSize);
    } catch (NumberFormatException e) {
      return false;
    }
  }
  
  @Override
  public Model generateModelFromPageNumber(int page, Model m) {
    List<Post> posts = findPostsOrderedByScore(page);
    boolean hasNext = (postRepository.findAllByOrderByScoreDesc().size() > page * postPerPage);
    if (hasNext) {
      m.addAttribute("hasNext", true);
    } else {
      m.addAttribute("hasNext", false);
    }
    m.addAttribute("posts", posts);
    m.addAttribute("page", page);
    return m;
  }
  
  private List<Post> findPostsOrderedByScore(int page) {
    int startIndex = (page - 1) * postPerPage;
    int endIndex = page * postPerPage;
    List<Post> posts = postRepository.findAllByOrderByScoreDesc();
    
    if(posts.size() >= endIndex) {
      return posts.subList(startIndex, endIndex);
    } else {
      return posts.subList(startIndex, posts.size());
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
