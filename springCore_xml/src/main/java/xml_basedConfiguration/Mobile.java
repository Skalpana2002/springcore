package xml_basedConfiguration;

public class Mobile {		

	String brand;
	int price;
	Sim s;
	public Mobile(String brand, int price, Sim s) {
		this.brand = brand;
		this.price = price;
		this.s = s;
	}
	
	public  void display() {
		System.out.println(brand+" "+price+" "+s.name+" "+s.type);
	}

}
