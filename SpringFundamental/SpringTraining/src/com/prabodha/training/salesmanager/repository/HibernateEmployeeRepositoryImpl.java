package com.prabodha.training.salesmanager.repository;


import java.util.ArrayList;
import java.util.List;
import com.prabodha.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	public List<Employee> getAllEmployees(){
		List<Employee>employees =new ArrayList<>();
		
		     Employee employee =new Employee();
		     employee.setEmployeeName("Prabodha");
		     employee.setEmployeeLocation("Jaela");
		     employees.add(employee);
		     
		     return employees;
			
		
	}
	

//	public static void main(String[] args) {
//		
//
//	}

}
