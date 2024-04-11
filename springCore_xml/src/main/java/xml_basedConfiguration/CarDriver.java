package xml_basedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("carEngine.xml");
		Car c= (Car)ac.getBean("car");
		System.out.println(c.getBrand()+" "+c.getPrice());
		System.out.println(c.getEngine().getModelNo());

	}

}
