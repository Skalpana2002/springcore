package xml_basedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		
		Student s = (Student)ac.getBean("stu");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
	}
}
