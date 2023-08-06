package dynoPoly;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What do you Want?");
		System.out.print("press 1 for Dog, 2 for Cat");
		
		int choise = scanner.nextInt();
		scanner.close();
		
		switch (choise) {
		case 1:
			animal = new Dog();
			animal.speak();
			break;
		case 2:
			animal = new Cat();
			animal.speak();
			break;

		default:
			animal = new Animal();
			animal.speak();
			break;
		}

	}

}
