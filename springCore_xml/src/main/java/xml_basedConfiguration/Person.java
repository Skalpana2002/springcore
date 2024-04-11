package xml_basedConfiguration;

public class Person {
	
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(name+" "+age);
	}

}
