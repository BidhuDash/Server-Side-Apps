package com.microemp.MicroServices_Employeeservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microemp.MicroServices_Employeeservice.dto.EmployeeResponse;
import com.microemp.MicroServices_Employeeservice.entities.Employee;
import com.microemp.MicroServices_Employeeservice.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/testemployee")
	public String test() {
		return "Employee Micro-Service";
	}
	
	@PostMapping("/")
	public Employee save(@RequestBody Employee Employee) {
		return employeeService.saveEmployee(Employee);
		
	}
	
	@GetMapping("/{id}")
	public EmployeeResponse findEmployeeById(@PathVariable("id") Long id) {
		return employeeService.findEmployeeById(id);
	}

}
