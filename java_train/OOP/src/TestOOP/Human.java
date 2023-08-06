package TestOOP;

public class Human {
	
	String name; 
	int age; 
	double weight;
	
	Human(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void eat() {
		System.out.println(this.name + " is eating.");
	}
	void drink() {
		System.out.println(this.name + " is drinking.");
	}
}
//
//Human human = new Human("Rick", 45, 78.00);
//Human human2 = new Human("Morty", 45, 78.00);
//human.drink();
//human2.eat();