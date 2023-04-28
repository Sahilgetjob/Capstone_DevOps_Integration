package com.hdfc.capstone.capstoneemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hdfc.capstone.capstoneemployee.entity.Employee;

//JPA Employee repository interface
public interface EmployeeRepository extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee>{

}
