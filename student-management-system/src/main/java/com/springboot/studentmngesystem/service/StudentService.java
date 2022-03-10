package com.springboot.studentmngesystem.service;

import java.util.List;

import com.springboot.studentmngesystem.bean.Student;

public interface StudentService  {

	List<Student> findallstudent();
	
	public void savestudent(Student student);
	
	public void deletetudent(Integer id);

	public Student getstudent(Integer id);
}
