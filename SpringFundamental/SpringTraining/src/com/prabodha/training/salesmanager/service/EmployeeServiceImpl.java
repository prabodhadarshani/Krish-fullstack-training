package com.prabodha.training.salesmanager.service;


import java.util.List;

import com.prabodha.training.salesmanager.model.Employee;
import com.prabodha.training.salesmanager.repository.EmployeeRepository;
//import com.prabodha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
//	EmployeeRepository emplpyeerepository =  (EmployeeRepository) new HibernateEmployeeRepositoryImpl();
//
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//		super();
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
//	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
//			this.employeeRepository = employeeRepository;
//			}
	
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

	
	
}
