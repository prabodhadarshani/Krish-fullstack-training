package com.prabodha.training.salesmanager.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabodha.training.salesmanager.model.Employee;
import com.prabodha.training.salesmanager.repository.EmployeeRepository;
//import com.prabodha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
     @Autowired
	 EmployeeRepository employeeRepository;
	
//	EmployeeRepository emplpyeerepository =  (EmployeeRepository) new HibernateEmployeeRepositoryImpl();
//
     public EmployeeServiceImpl() {

 		System.out.println("default constructor excuted");
 	
 	}
     
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

		System.out.println("overloaded constructor excuted");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fire");
		this.employeeRepository = employeeRepository;
	}
	
//	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
//			this.employeeRepository = employeeRepository;
//			}
	
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

	
	
}
