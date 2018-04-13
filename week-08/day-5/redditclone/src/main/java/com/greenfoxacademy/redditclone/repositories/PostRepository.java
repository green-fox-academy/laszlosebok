package com.greenfoxacademy.redditclone.repositories;

import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostRepository extends CrudRepository<Post, Long> {
  List<Post> findAllByOrderByScoreDesc();
}
