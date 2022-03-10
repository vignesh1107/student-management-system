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

	@Override
	public void savestudent(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
	}

	@Override
	public void deletetudent(Integer id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student getstudent(Integer id) {
		// TODO Auto-generated method stub
		Student student = studentRepo.getById(id);
		
		return student;
	}

}
