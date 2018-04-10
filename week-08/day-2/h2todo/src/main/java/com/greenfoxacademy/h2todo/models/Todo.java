package com.greenfoxacademy.h2todo.models;

public class Todo {

  // Add a Todo class with the fields(id:Long, title:String, urgent:boolean(default false), done:boolean(default false))
  
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
