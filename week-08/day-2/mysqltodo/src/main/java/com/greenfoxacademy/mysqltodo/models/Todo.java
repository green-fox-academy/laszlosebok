package com.greenfoxacademy.mysqltodo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Todo {
  
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;
  private LocalDateTime createdAt;
  
  public Todo(){
    createdAt = LocalDateTime.now();
  }
  
  public Todo(String title){
    this();
    this.title = title;
  }
  
  public Todo(String title, boolean urgent) {
    this(title);
    this.urgent = urgent;
  }
  
  public Todo(String title, boolean urgent, boolean done) {
    this(title, urgent);
    this.done = done;
  }
  
  @Override
  public String toString() {
    return title;
  }
  
  // Getters & Setters
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public boolean isUrgent() {
    return urgent;
  }
  
  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
  
  public boolean isDone() {
    return done;
  }
  
  public void setDone(boolean done) {
    this.done = done;
  }
  
  public LocalDateTime getCreatedAt() {
    return createdAt;
  }
  
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }
}
