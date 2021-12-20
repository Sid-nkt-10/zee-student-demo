package com.springloggerexample.zee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GetStudent {
	
	List<Student> studentList = new ArrayList<>();
	
	public void addStudent(Student std) {		

		studentList.add(std);
		
	}
	
	public List<Student> getStudent(){
		return studentList; 
	}
	
	
	

}
