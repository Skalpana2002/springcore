package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Configure.class);
		
		Demo d= (Demo)app.getBean("demo");
		d.test();

	}

}
