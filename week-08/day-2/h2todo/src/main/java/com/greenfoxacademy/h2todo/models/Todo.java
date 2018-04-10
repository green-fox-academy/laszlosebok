package com.greenfoxacademy.h2todo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  // Add a Todo class with the fields(id:Long, title:String, urgent:boolean(default false), done:boolean(default false))
  
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;
  
  public Todo(){
  }
  
  public Todo(String title){
    this();
    this.title = title;
  }
  
  public Todo(String title, boolean urgent) {
    this(title);
    this.urgent = urgent;
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
}
