package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class BankAccountController {
  
  private static List<BankAccount> accountList;
  
  static {
    accountList = new ArrayList<>();
    accountList.add(new BankAccount("Scar", 193, "lion", false));
    accountList.add(new BankAccount("Simba", 2000, "lion", true, true));
    accountList.add(new BankAccount("Pumba", 25.3, "boar", true));
    accountList.add(new BankAccount("Rafiki", 125, "monkey", true));
    accountList.add(new BankAccount("Zazu", 259.32332, "parrot", true));
  }
  
  @GetMapping(value = "/showaccounts")
  public String showAll(Model model) {
    model.addAttribute("accounts", accountList);
    return "show";
  }
  
  @GetMapping(value = "/show")
  public String show(Model model) {
    model.addAttribute("accounts", getSingleAccountList());
    return "show";
  }
  
  @GetMapping(value = "/useless_text_formatting")
  public String textFormatting(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text_formatting";
  }
  
  @PostMapping(value = "funds_added")
  public String addFundsToAccount(@ModelAttribute(name = "AccountName") String name, Model model) {
    accountList
        .stream()
        .filter(o -> o.getName().equalsIgnoreCase(name))
        .forEach(BankAccount::increaseFund);
  
    model.addAttribute("name", name);
    return "funds_changed";
  }
  
  @GetMapping(value = "/add_funds")
  public String addFunds(Model model) {
    model.addAttribute("accounts", accountList);
    return "increase_funds";
  }
  
  @GetMapping(value = "/add_account")
  public String addAccount(Model model) {
    
    model.addAttribute("account", new BankAccount());
    return "new_account";
  }
  
  @PostMapping(value = "/account_added")
  @ResponseBody
  public BankAccount addAccount(@ModelAttribute BankAccount account) {
    accountList.add(account);
    
    return account;
  }
  
  private List<BankAccount> getSingleAccountList() {
    return new ArrayList<>(Collections.singletonList(
        new BankAccount("Simba", 2000, "lion", true, true))
    );
  }
}
