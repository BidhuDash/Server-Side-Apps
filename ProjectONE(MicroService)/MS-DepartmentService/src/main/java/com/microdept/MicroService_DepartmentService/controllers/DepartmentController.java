package com.microdept.MicroService_DepartmentService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microdept.MicroService_DepartmentService.entities.Department;
import com.microdept.MicroService_DepartmentService.services.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/testdepartment")
	public String test() {
		return "Department";
	}
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.save(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long id) {
		return departmentService.findDepartmentById(id);
	}
	
}
