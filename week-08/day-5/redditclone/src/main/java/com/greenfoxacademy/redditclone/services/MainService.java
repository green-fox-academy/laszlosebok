package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {
  
  List<Post> findPostsOrderedByScore(int postPerPage, int page);
  void changePostScore(String stringId, int difference);
  boolean pageNumberValidation(String pageNum);
}
