package annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	int age;
	
	public Student(@Value(value="rekha") String name, @Value(value="20") int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
