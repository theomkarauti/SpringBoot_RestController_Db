package com.example.Student;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class StartApps {

	public static void main(String[] args) {
		SpringApplication.run(StartApps.class, args);
		//StudentController sc = new StudentController();
				
		
	}
	
	
	
	
	

}
