package com.proyecto.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET ,produces = "application/json")
	public String home() {
		String msm = "Working Spring Boot App";
		return "{\"success\": \"00\", \"msm\": \" "+ msm +"\" }"; 
	}
	
	

}
