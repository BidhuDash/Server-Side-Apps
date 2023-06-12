package com.microemp.MicroServices_Employeeservice.dto;

import com.microemp.MicroServices_Employeeservice.entities.Department;
import com.microemp.MicroServices_Employeeservice.entities.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
	
	private Employee employee;
	private Department department;
	
	
	
	
	
	
}
