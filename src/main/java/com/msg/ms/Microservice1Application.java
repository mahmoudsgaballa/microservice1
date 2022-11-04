package com.msg.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Microservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}	
	
	@RestController
	public class Ms1Controller{
		//new comment2
//		@GetMapping("api/test/message")
		@GetMapping("")
		public String getMessage() {
			return "This is microservice1";
		}
		
	}

}
