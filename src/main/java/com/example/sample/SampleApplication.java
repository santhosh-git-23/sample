package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class SampleApplication {

	 @GetMapping("/")
	    public String welcomeAdmin() {
		 return "Wecome Santhosh";
	    }  
	
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
	
	

}
