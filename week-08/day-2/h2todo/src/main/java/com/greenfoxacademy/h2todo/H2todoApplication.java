package com.greenfoxacademy.h2todo;

import com.greenfoxacademy.h2todo.models.Todo;
import com.greenfoxacademy.h2todo.respositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2todoApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository todoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(H2todoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("valami"));
	}
}
