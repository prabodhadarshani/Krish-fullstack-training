package com.prabodha.training.salesmanager.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.prabodha.training.salesmanager.model.Employee;


@Repository("you-can-use-anyname")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Value("${name}")
	private String employeeName;
	@Value("${city}")
	private String employeeLocation;
	
	
	public List<Employee> getAllEmployees(){
		List<Employee>employees =new ArrayList<>();
		
		     Employee employee =new Employee();
		    // employee.setEmployeeName("Prabodha");
		    // employee.setEmployeeLocation("Jaela");
		     employee.setEmployeeName(employeeName);
		     employee.setEmployeeLocation(employeeLocation);
		     employees.add(employee);
		     
		     return employees;
			
		
	}
	

//	public static void main(String[] args) {
//		
//
//	}

}
