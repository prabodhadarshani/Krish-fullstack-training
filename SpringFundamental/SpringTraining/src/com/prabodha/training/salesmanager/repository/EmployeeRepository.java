package com.prabodha.training.salesmanager.repository;

import java.util.List;

import com.prabodha.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}