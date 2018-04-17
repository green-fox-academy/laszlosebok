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

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class DountilRestControllerTest {
  
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
  
  @Test
  public void testDountilWithoutWhat() throws Exception {
    mockMvc.perform(post("/dountil")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"until\": 5}"))
        .andExpect(status().is4xxClientError());
  }
  
  @Test
  public void testDountilSumWithoutNumber() throws Exception {
    mockMvc.perform(post("/dountil/sum"))
        .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }
  
  @Test
  public void testDountilSumWithNumber() throws Exception {
    mockMvc
        .perform(post("/dountil/sum")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": 7}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(28)));
  }
  
  @Test
  public void testDountilFactorWithNumber() throws Exception {
    mockMvc
        .perform(post("/dountil/factor")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"until\": 4}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(24)));
  }
}