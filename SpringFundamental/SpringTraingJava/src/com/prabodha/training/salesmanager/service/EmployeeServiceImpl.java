package com.prabodha.training.salesmanager.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prabodha.training.salesmanager.model.Employee;
import com.prabodha.training.salesmanager.repository.EmployeeRepository;
//import com.prabodha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;

	
	public EmployeeServiceImpl() {
		System.out.println("default constructor executed");
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	System.out.println("overload constructed executed");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		
		return employeeRepository;
	}
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter executed");
		this.employeeRepository = employeeRepository;
	}
	
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

	
	
}
