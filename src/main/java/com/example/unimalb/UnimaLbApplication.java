package com.example.unimalb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UnimaLbApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnimaLbApplication.class, args);
	}
		@GetMapping
		public String hello(){
		return "Hello there";
		}
}
