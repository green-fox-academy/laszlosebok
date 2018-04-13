package com.greenfoxacademy.redditclone.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "posts")
public class Post {
  
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  private int score;
  private String title;
  private LocalDateTime createdAt;
  //private UserModel createdBy; TODO - implement UserModels
  
  
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
}
