package com.springloggerexample.zee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/student")
public class ZeeApplication {
	
	@Autowired
	GetStudent getStudent;
	
	@GetMapping
	public List<Student> getAllStudent(){	
		
		return getStudent.getStudent();
		
	}
	
@PostMapping	
public String addStudent(@RequestBody Student std){	
		
		getStudent.addStudent(std);;
		return "Done";
		
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ZeeApplication.class, args);	
		
	}

}
