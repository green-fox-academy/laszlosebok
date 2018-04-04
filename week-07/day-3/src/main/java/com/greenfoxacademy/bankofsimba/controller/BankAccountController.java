package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class BankAccountController {
  
  @GetMapping(value = "/show")
  public String show(Model model) {
    List<BankAccount> accountList = getAccountList();
    model.addAttribute("accounts", accountList);
    return "show";
  }
  
  @GetMapping(value = "/useless_text_formatting")
  public String textFormatting(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text_formatting";
  }
  
  public List<BankAccount> getAccountList() {
    return new ArrayList<>(Collections.singletonList(
        new BankAccount("Simba", 2000, "lion"))
    );
  }
}
