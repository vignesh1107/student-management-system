package com.springboot.studentmngesystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.studentmngesystem.bean.Student;
import com.springboot.studentmngesystem.repository.StudentRepo;

@SpringBootApplication
public class StdManageSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StdManageSystemApplication.class, args);
	}

	@Autowired
	StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Tom", "Curran", "tomcurran@gmail.com");
		 * studentRepo.save(student1);
		 * 
		 * Student student2 = new Student("sam", "Curran", "samcurran@gmail.com");
		 * studentRepo.save(student2);
		 */
	}
}
