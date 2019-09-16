package com.ilu2code.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilu2code.crud.entity.Student;
import com.ilu2code.crud.services.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/all")
	public String getAllStudents(Model model){
		System.out.println("Called Controller");
		
		List<Student> students =studentService.getAllStudentDetais();
		
		model.addAttribute("students", students);
		
		return "student-list";
	}
}
