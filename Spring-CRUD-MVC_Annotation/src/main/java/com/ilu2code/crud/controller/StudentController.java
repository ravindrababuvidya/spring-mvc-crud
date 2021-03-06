package com.ilu2code.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		System.out.println(students);
		
		model.addAttribute("students", students);
		
		return "student-list";
	}
	
	@RequestMapping("/showStudentForm")
	public String showStudentForm(Model thModel) {
		Student student = new Student();
		thModel.addAttribute("student",student);
		return "student-form";
	}
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student student,BindingResult thResult) {
		
		if(thResult.hasErrors()) {
			return "student-form";
		}else {
			studentService.saveStudent(student);
			return "redirect:/student/all";
		}
		
	}
	
	@GetMapping("showformupdateStudent")
	public String updateStudentDetails(@RequestParam("studentId") int id,Model model) {
		Student student = studentService.getStudentDetails(id);
		model.addAttribute("student",student);
		return "student-form";
		
	}
	
	@RequestMapping("deleteStudent")
	public String deleteStudent(@RequestParam("studentId") int id,Model model) {
		System.out.println("Called Delete StudentService");
		//Student student = studentService.getStudentDetails(id);
		studentService.deleteStudent(id);
		return "redirect:/student/all";
	}
	
}
