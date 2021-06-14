package Part9Inheritance;

public class Dog extends Animal {

	public void bark() {
		System.out.println("Barking.....");
	}
	
	public void dog() {
		System.out.println("Dog is: ");
	}
	
	@Override
	public void eat() {
		System.out.println("Overriden. Not eating anymore");
	}
}
