package com.springboot.studentmngesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.studentmngesystem.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public String getstudent(Model model) {
		//Student student1 = new Student("Tom","Curran","tomcurran@gmail.com");
		System.out.println(studentService.findallstudent());
		model.addAttribute("students", studentService.findallstudent());
		
		return "student";
	}
}
