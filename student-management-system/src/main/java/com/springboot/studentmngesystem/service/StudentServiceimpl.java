package com.springboot.studentmngesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.studentmngesystem.bean.Student;
import com.springboot.studentmngesystem.repository.StudentRepo;

@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> findallstudent(){
		System.out.println(studentRepo.findAll());
		return studentRepo.findAll();
	}

}
