package com.greenfoxacademy.redditclone.repositories;

import com.greenfoxacademy.redditclone.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MainRepository extends CrudRepository<Post, Long> {
}
