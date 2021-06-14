package Part9Inheritance;

public class Polymorphism {
	public static void main(String[] args) {
	
		Animal[] animals = {new Cat(), new Dog(), new Fish()};
		
		for (Animal animal: animals) {
			animal.eat();
			animal.move();
		}
	}

	
}
