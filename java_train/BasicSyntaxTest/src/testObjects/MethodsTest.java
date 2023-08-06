//with overloaded methods
package testObjects;

public class MethodsTest {

	public static void main(String[] args) {
		
		String name = "Fucker";
		
		hello(name);
		int x = 10;
		int y = 20;

		System.out.println(addNums(x, y));

	}
	static void hello(String name) {
		System.out.println("Hello "+name);
	}
	
	static int addNums(int x, int y) {
		return x + y;
	}
	static int addNums(int x, int y, int z) {
		return x + y + z;
	}
	static int addNums(int x, int y, int z, int a) {
		return x + y + z + a;
	}

}
