package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  
  private static final AtomicLong ATOMIC_LONG = new AtomicLong(1);
  private long id;
  private String content;
  
  private Greeting(){
  }
  
  public Greeting(String content) {
    this();
    this.id = ATOMIC_LONG.getAndIncrement();
    this.content = content;
  }
  
  public long getId() {
    return id;
  }
  
  public String getContent() {
    return content;
  }
}
