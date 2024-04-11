package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Demo {

	public void test() {
		System.out.println("nonstatic method of demo class");
	}
}
