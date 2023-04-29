package com.hdfc.capstone.capstoneemployee.dto;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.springframework.stereotype.Component;

import com.hdfc.capstone.capstoneemployee.entity.Employee;

@Component
public class EmployeeMapper {

	private EmployeeMapper(){
		super();
	}
	
	//Map Employee to EmployeeDto using EmployeeMapper
	public static EmployeeDto toDto(Employee employee) throws NoSuchAlgorithmException, NoSuchProviderException, 
																NoSuchPaddingException, IllegalBlockSizeException,
																BadPaddingException, InvalidKeyException  {
		EmployeeDto employeeDto = new EmployeeDto();
		
		employeeDto.setEmployeeId(employee.getEmployeeId());
		employeeDto.setEmployeeName(employee.getEmployeeName());
		employeeDto.setDateOfBirth(employee.getDateOfBirth().toString());
		
		return employeeDto;
	}

	//Map List<Employee> to List<EmployeeDto> using EmployeeMapper
	public static List<EmployeeDto> toListDto(List<Employee> employees) throws NoSuchAlgorithmException, NoSuchProviderException, 
																				NoSuchPaddingException, IllegalBlockSizeException,
																				BadPaddingException, InvalidKeyException  {
		List<EmployeeDto> employeeDtos = new ArrayList<>();
		
		for(Employee employee : employees) {
			EmployeeDto employeeDto = new EmployeeDto();
			employeeDto.setEmployeeId(employee.getEmployeeId());
			employeeDto.setEmployeeName(employee.getEmployeeName());
			employeeDto.setDateOfBirth(employee.getDateOfBirth().toString());
			
			employeeDtos.add(employeeDto);
		}
		return employeeDtos;
	}
	
}
