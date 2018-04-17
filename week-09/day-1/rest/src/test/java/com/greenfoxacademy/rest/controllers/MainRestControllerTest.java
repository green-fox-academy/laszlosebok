package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.RestApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class MainRestControllerTest {
  
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));
  
  private MockMvc mockMvc;
  
  @Autowired
  private WebApplicationContext webApplicationContext;
  
  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }
  
  //Doubling endpoint tests
  @Test
  public void testDoublingWithoutData() throws Exception {
    mockMvc.perform(get("/doubling"))
        .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }
  
  @Test
  public void testDoublingWithInputFive() throws Exception {
    mockMvc.perform(get("/doubling").param("input", "5"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(10)));
  }
  
  //Greeter endpoint tests
  @Test
  public void testGreeterWithoutName() throws Exception {
    mockMvc.perform(get("/greeter"))
        .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }
  
  @Test
  public void testGreeterWithParameters() throws Exception {
    mockMvc
        .perform(get("/greeter")
            .param("name", "petikeh")
            .param("title", "student"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there petikeh, my dear student!")));
  }
  
  //Arrays endpoint tests
  @Test
  public void testArraysWithoutData() throws Exception {
    mockMvc
        .perform(post("/arrays"))
        .andExpect(status().isBadRequest());
  }
  
  @Test
  public void testArraysWithoutWhat() throws Exception {
    mockMvc
        .perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"numbers\": [1, 2]}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }
  
  @Test
  public void testArraysWithoutNumbers() throws Exception {
    mockMvc
        .perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"multiply\"}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }
  
  @Test
  public void testArraysWithEmptyJson() throws Exception {
    mockMvc
        .perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }
  
  @Test
  public void testArraysSum() throws Exception {
    mockMvc
        .perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"sum\", \"numbers\": [1, 5, 6]}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(12)));
  }
  
  @Test
  public void testArraysMultiply() throws Exception {
    mockMvc
        .perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"multiply\", \"numbers\": [1, 5, 6]}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(30)));
  }
  
  @Test
  public void testArraysDouble() throws Exception {
    mockMvc
        .perform(post("/arrays")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"what\": \"double\", \"numbers\": [1, 5, 6]}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(new ArrayList<>(Arrays.asList(2,10,12)))));
  }
}