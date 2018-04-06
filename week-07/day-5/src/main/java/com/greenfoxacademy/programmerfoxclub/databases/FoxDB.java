package com.greenfoxacademy.programmerfoxclub.databases;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

import java.util.ArrayList;
import java.util.List;

public class FoxDB {
  
  private static List<Fox> foxes;
  
  static {
    foxes = new ArrayList<>();
  }
  
  public static List<Fox> getFoxes() {
    return foxes;
  }
  
  public static void setFoxes(List<Fox> foxes) {
    FoxDB.foxes = foxes;
  }
}
