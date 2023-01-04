package com.example.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class StudentController   
{ 
	
	private final StudentService studentService;
	
	@Autowired
	
public StudentController(StudentService studentService) {
	
		this.studentService = studentService;
	}



@RequestMapping(path="api/v1/Student")  
public List<Student> getStudents()   
{  
return studentService.getStudents();

} 


}  