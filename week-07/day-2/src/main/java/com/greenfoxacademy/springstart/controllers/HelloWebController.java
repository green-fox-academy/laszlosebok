package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.ColorfulGreeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  
  private static final String[] GREETINGS = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho",
      "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa",
      "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte",
      "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào",
      "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  
  private final static AtomicLong ATOMIC_LONG = new AtomicLong(1);
  
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(name = "name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("loadCount", ATOMIC_LONG.getAndIncrement());
    return "greeting";
  }
  
  @RequestMapping("/web/colorfulGreeting")
  public String colorGreeting(Model model) {
    List<ColorfulGreeting> greetingList = generateGreetingList();
    model.addAttribute("greetingList", greetingList);
    return "colorfulGreeting";
  }
  
  private List<ColorfulGreeting> generateGreetingList() {
    List<ColorfulGreeting> greetingList = new ArrayList<>();
    
    for (String greeting: GREETINGS) {
      greetingList.add(new ColorfulGreeting(greeting));
    }
    return  greetingList;
  }
  

}
