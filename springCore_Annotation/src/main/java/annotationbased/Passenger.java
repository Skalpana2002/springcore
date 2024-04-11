package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class Passenger {
	public void display() {
		System.out.println("passenger is waiting");
	}

}
