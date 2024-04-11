package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlowerDriver {

	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(Configure.class);
		Flower f=(Flower)app.getBean("flower");
		System.out.println(f);

		Flower f1=(Flower)app.getBean("flower");
		System.out.println(f1);
	}

}
