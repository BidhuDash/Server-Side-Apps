package com.microemp.MicroServices_Employeeservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	private Long id;
	private String departmentName;
	private String departmentCode;
	private String departmentAddress;
	
	
	
	
	

}
