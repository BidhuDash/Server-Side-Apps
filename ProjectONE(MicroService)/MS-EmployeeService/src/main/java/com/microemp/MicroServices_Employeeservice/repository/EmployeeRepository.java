package com.microemp.MicroServices_Employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microemp.MicroServices_Employeeservice.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {
	
	Employee findEmployeeById(Long employeeId);

}
