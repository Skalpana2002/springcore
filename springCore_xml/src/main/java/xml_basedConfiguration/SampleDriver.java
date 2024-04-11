package xml_basedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleDriver {

	public static void main(String[] args) {
		
		//create IOC container
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Config.xml");
		
		Sample s = (Sample)ac.getBean("mysample");
		
		s.test();

	}

}
