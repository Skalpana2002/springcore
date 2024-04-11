package annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus {
	@Autowired
	Passenger passenger;
	
	
	public void busInfo() {
		System.out.println("bus arrived");
	}
}
