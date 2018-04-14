package com.greenfoxacademy.redditclone.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public interface MainService {
  
  void changePostScore(String stringId, int difference);
  boolean pageNumberValidation(String pageNum);
  Model generateModelFromPageNumber(int page, Model model);
}

