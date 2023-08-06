package TestOOP;

public class Car {

	String maker = "Chevrolette";
	String model = "Corvette";
	int year = 2020;
	String color = "Red";
	double price = 2000000.00;
	
	String name;
	
	Car(String name){
		this.name = name;
	}
	
	void drive() {
		System.out.println("I Drive");
	}
	
	void brake() {
		System.out.println("Brake hit the brake");
	}
	
	public String toString() {
		return color+" "+maker+" "+model+" "+ year;
	}
	
}

//Car myCar = new Car();
//
//System.out.println(myCar);