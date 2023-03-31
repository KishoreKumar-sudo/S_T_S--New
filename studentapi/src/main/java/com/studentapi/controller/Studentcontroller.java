package com.studentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.studentapi.Service.StudentService;
import com.studentapi.model.Student;

public class Studentcontroller {
	// CRUD API

	@Autowired
	StudentService studentService;
	/*
	 URL:localhost:8080/apis/products Method:GET Required: None
	 
	 */

	@GetMapping("/products")
	public List<Student> getProduct() {
		return studentService.getProducts();
	}

	/*
	  URL:localhost:8080/apis/product Method:POST Required: id, name, price, qty,
	  info
	  
	 */

	@PostMapping("product")
	// For Post the data we need "@RequestBody"

	public void addProduct(@RequestBody Student student) {
		studentService.saveProduct(student);
	}

	@DeleteMapping("/product/{id}")
	// For Deleting the data we need "@PathVariable"

	public void deleteProduct(@PathVariable Integer id) {
		studentService.deleteProduct(id);
	}
}
