// JAVA for get from user 
package testObjects;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's yor name	?");
		String name = scanner.nextLine();
				
		System.out.println("What's yor ayg?");
		int age = scanner.nextInt();
		
		System.out.println("Hello "+name);
		System.out.println("yor ayg "+age);

		scanner.close();
	}

}
