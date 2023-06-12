package com.microdept.MicroService_DepartmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microdept.MicroService_DepartmentService.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository< Department, Long> {
	
	Department findDepartmentById(Long departmentId);

}
