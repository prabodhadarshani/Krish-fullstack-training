import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prabodha.training.salesmanager.model.Employee;
import com.prabodha.training.salesmanager.service.EmployeeService;
//import com.prabodha.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContex.xml");
		
		EmployeeService employeeService =applicationContext.getBean("employeeService" , EmployeeService.class);
		
//		EmployeeService employeeService = new EmployeeServiceImpl();
		List<Employee> employees = employeeService.getAllEmployees();
		
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName()+ " at "+ employee.getEmployLocation());
		}  

	}

}
