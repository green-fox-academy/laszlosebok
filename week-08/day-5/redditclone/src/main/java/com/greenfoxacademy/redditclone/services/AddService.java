package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.stereotype.Service;

@Service
public interface AddService {
  
  Post createNewPost();
}
