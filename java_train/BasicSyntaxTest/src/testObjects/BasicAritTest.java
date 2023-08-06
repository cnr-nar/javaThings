//Basic math lib test
package testObjects;

import java.util.Scanner;

public class BasicAritTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double x;
		double y;
		double z;

		System.out.println("Enter x");
		x = scanner.nextDouble();

		System.out.println("Enter y");
		y = scanner.nextDouble();

		z = Math.sqrt((x*x)+(y*y));

		System.out.println("Hypotenus is: "+z);
		scanner.close();

	}

}
