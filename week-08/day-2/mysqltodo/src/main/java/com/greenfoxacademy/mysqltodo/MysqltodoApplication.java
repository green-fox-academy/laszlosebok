package com.greenfoxacademy.mysqltodo;

import com.greenfoxacademy.mysqltodo.models.Todo;
import com.greenfoxacademy.mysqltodo.respositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqltodoApplication implements CommandLineRunner{
 
	public static void main(String[] args) {
		SpringApplication.run(MysqltodoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	}
}
