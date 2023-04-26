package com.hdfc.capstone.capstoneemployee.dto;

import org.springframework.stereotype.Component;

import com.hdfc.capstone.capstoneemployee.entity.Employee;

@Component
public class EmployeeMapper {

	private EmployeeMapper(){
		super();
	}
	
	//Mapping Employee to EmployeeDto using EmployeeMapper
	public static EmployeeDto toDto(Employee employee) throws Exception {
		EmployeeDto employeeDto = new EmployeeDto();
		
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setEmployeeName(employee.getEmployeeName());
		employeeDto.setDateOfBirth(employee.getDateOfBirth().toString());
		
		return employeeDto;
	}
	
}
