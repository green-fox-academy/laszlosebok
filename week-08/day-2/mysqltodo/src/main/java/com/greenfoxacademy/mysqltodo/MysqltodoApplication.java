package com.greenfoxacademy.mysqltodo;

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
