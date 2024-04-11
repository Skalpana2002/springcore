package annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	public String getName() {
		return name;
	}
	@Value(value="Rekha")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Value(value="20")
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	@Value(value="20000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
