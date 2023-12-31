package com.microdept.MicroService_DepartmentService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.microdept.MicroService_DepartmentService.entities.Department;
import com.microdept.MicroService_DepartmentService.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department save(Department department) {
		return departmentRepository.save(department);
		
	}
	
	public Department findDepartmentById(Long departmentId) {
		return departmentRepository.findDepartmentById(departmentId);
		
	}

}
