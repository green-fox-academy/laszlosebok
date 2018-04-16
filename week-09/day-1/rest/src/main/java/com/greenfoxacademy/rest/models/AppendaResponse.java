package com.greenfoxacademy.rest.models;

public class AppendaResponse {
  
  private String appended;
  
  public AppendaResponse(String appendee) {
    appended = appendee.concat("a");
  }
  
  public String getAppended() {
    return appended;
  }
  
  public void setAppended(String appended) {
    this.appended = appended;
  }
}
