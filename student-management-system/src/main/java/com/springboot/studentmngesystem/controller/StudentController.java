package com.springboot.studentmngesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.studentmngesystem.bean.Student;
import com.springboot.studentmngesystem.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public String getstudent(Model model) {
		model.addAttribute("students", studentService.findallstudent());

		return "student";
	}

	@GetMapping("/students/new")
	public String getnewstudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);

		return "create_student";
	}

	@PostMapping("/students")
	public String savestudent(@ModelAttribute("student") Student student) {
		studentService.savestudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deletestudent(@ModelAttribute("id") Integer id ) {
		 studentService.deletetudent(id);
		 return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String getstudent(@PathVariable Integer id,Model model ) {
		System.out.println("test"+id);
   model.addAttribute("students", studentService.getstudent(id)) ;
   System.out.println("model"+model);
		 return "update_student";
	}
	
	@PostMapping("/students/{id}")
	public String updatestudent(@ModelAttribute("students") Student student, @PathVariable Integer id) {
		Student student2 = studentService.getstudent(student.getId());
		student2.setId(id);
		student2.setFirstname(student.getFirstname());
		student2.setLastname(student.getLastname());
		student2.setEmail(student.getEmail());
		 studentService.savestudent(student2);
		 return "redirect:/students";
	}
}
