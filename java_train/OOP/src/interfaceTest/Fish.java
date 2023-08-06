package interfaceTest;

public class Fish implements Predator,Prey {

	@Override
	public void flee() {
		System.out.println("*Fish is running from bigger fish*");
		
	}

	@Override
	public void hunt() {
		System.out.println("*It's fishing time*");
		
	}

}
