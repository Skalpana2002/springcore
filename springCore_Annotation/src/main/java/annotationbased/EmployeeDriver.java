package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Configure.class);
		
		Employee e= (Employee)app.getBean("employee");
		System.out.println(e.getName()+" "+e.getAge()+" "+e.getSalary());
	}
}
