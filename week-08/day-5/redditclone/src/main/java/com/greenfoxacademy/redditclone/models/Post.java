package com.greenfoxacademy.redditclone.models;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "posts")
public class Post {
  
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  
  private int score;
  private String title;
  //private UserModel createdBy; TODO - implement UserModels
  private String url;
  
  @Column(name = "created_at", updatable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;
  
  public void changeScore(int diff) {
    score += diff;
  }
  
  @Override
  public String toString() {
    return id + " " + score + " " + title;
  }
  
  // Getters and Setters
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public int getScore() {
    return score;
  }
  
  public void setScore(int score) {
    this.score = score;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public LocalDateTime getCreatedAt() {
    return createdAt;
  }
  
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
  
  public String getUrl() {
    return url;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
}
