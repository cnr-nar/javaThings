// random nums
package testObjects;

import java.util.Random;

public class RandNumTest {
	public static void main(String[] args) {
		Random random = new Random();

		int x = random.nextInt(20)+1;

		System.out.println("You rolled:"+x);

	}

}
