package com.springboot.studentmngesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.studentmngesystem.bean.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
