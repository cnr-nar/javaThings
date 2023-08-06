package TestOOP;
public class CarMain {

	public static void main(String[] args) {
		
		CarGarage garage = new CarGarage();
		
		Car car = new Car("BWM");
		
		garage.park(car);

	}

}
