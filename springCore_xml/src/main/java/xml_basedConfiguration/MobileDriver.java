package xml_basedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("SimMobile.xml");
		Mobile m =(Mobile)ac.getBean("mobile");
		m.display();

	}

}
