package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Configure.class);
		Student s= (Student)app.getBean("student");
		System.out.println(s.name+" "+s.age);

	}

}
