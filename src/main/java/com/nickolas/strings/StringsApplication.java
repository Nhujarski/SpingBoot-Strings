package com.nickolas.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	@RequestMapping("/")
//	method that will route to our initial route.
	public String hello() {
		return "Hello Client! How are you doing?";
	}
	@RequestMapping("/random")
//	method that will take us to our route called "random".
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings.";
	}
}
