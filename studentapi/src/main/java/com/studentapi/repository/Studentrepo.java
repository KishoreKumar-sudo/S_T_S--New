package com.studentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapi.model.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {
	
}
