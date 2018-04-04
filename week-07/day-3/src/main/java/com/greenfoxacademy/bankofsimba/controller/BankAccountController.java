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
  
  @GetMapping(value = "/showaccounts")
  public String showAll(Model model) {
    List<BankAccount> accountList = getAccountList();
   
    model.addAttribute("accounts", accountList);
    return "show";
  }
  
  @GetMapping(value = "/show")
  public String show(Model model) {
    List<BankAccount> accountList = getSingleAccountList();
    
    model.addAttribute("accounts", accountList);
    return "show";
  }
  
  @GetMapping(value = "/useless_text_formatting")
  public String textFormatting(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text_formatting";
  }
  
  private List<BankAccount> getSingleAccountList() {
    return new ArrayList<>(Collections.singletonList(
        new BankAccount("Simba", 2000, "lion"))
    );
  }
  
  private List<BankAccount> getAccountList() {
    List<BankAccount> accounts = new ArrayList<>();
    
    accounts.add(new BankAccount("Scar", 193, "lion", false));
    accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    accounts.add(new BankAccount("Pumba", 25.3, "boar", true));
    accounts.add(new BankAccount("Rafiki", 125, "monkey", true));
    accounts.add(new BankAccount("Zazu", 259.32332, "parrot", true));
    
    return accounts;
  }
}
