package com.greenfoxacademy.dependency.controller;

import com.greenfoxacademy.dependency.service.ColorGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class WebController {
  
  private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
      Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
  
  private final ColorGenerator colorGen;
  
  @Autowired
  public WebController(ColorGenerator colorGen) {
    this.colorGen = colorGen;
  }
  
  
  @GetMapping("/useful")
  public String useful() {
    return "useful_page";
  }
  
  @GetMapping("/useful/colored")
  public String colored(Model model){
    String generatedColor = colorGen.randomColor();
    
    model.addAttribute("color", generatedColor);
    return "useful_colored";
  }
  
  @GetMapping("/useful/email/{email}")
  public String email(Model model, @PathVariable(name = "email") String emailAddr){

    boolean isValid = validate(emailAddr);
    model.addAttribute("isValid", isValid);
    model.addAttribute("emailAddr", emailAddr);
    return "useful_email";
  }
  
  @GetMapping("/useful/email")
  public String email(){
    return "input_email";
  }
  
  @PostMapping("/useful/email")
  public String checkEmail(@ModelAttribute(name = "email") String email){
    return "redirect:/useful/email/" + email;
  }
  
  private static boolean validate(String email) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
    return matcher.find();
  }
}
