package com.studentapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapi.model.Student;
import com.studentapi.repository.Studentrepo;

@Service
public class StudentService {
	@Autowired
	Studentrepo studentRepo;

	// CRUD Operations

	// Create Product
	public void saveProduct(Student student) {
		studentRepo.save(student);
	}

	// Get All Products
	public List<Student> getProducts() {
		return studentRepo.findAll();
		// return productRepository.findById(null);
	}

	// update Product
	public void updateProduct(Student student) {
		studentRepo.save(student);
	}

	// delete product
	public void deleteProduct(Integer id) {
		studentRepo.deleteById(id);
	}

}
