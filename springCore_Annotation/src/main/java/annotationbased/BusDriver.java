package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusDriver {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Configure.class);
		Bus b=(Bus)app.getBean("bus");
		b.busInfo();
		b.passenger.display();
	}

}
