package com.prabodha.training.salesmanager.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.prabodha.training.salesmanager.repository.EmployeeRepository;
import com.prabodha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.prabodha.training.salesmanager.service.EmployeeService;
import com.prabodha.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
//@ComponentScan("com.prabodha")
@PropertySource("application.properties")
@ComponentScan(basePackages = { "com.prabodha" })
public class ApplicationConfiguration {
	@Bean(name = "employeeService")
//	@Scope("singleton")
	@Scope("prototype")
	
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		
		//employeeService.getEmployeeRepository());
		
		//employeeService.setEmployeeRepository(getEmployeeRepository());
		
		 return employeeService;
		//return new EmployeeServiceImpl();
	}
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	
//	@Bean(name = "employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}
}
