package xml_basedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		
		Person p = (Person)ac.getBean("per");
		p.display();
	}

}
