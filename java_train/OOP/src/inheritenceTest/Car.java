package inheritenceTest;

public class Car extends Vehicle {

	@Override
	void go() {
		System.out.println("Car goes brrr");
		
	}

	@Override
	void stop() {
		System.out.println("Stop the car stop the car!!");
		
	}

}
