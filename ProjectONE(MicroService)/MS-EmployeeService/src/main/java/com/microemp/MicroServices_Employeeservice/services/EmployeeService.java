package com.microemp.MicroServices_Employeeservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microemp.MicroServices_Employeeservice.dto.EmployeeResponse;
import com.microemp.MicroServices_Employeeservice.entities.Department;
import com.microemp.MicroServices_Employeeservice.entities.Employee;
import com.microemp.MicroServices_Employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;
		
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public EmployeeResponse findEmployeeById(Long id) {
		
		Employee employee = employeeRepository.findEmployeeById(id);
		Department department= restTemplate.getForObject("http://DEPARTMENT-SERVICES/department/"+ 
								employee.getDepartmentId(), Department.class);
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setEmployee(employee);
		employeeResponse.setDepartment(department);
		return employeeResponse;
	}

}
