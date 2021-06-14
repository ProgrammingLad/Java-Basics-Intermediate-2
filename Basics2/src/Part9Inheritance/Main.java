package Part9Inheritance;

public class Main {

	public static void main(String[] args) {

		Animal fish1 = new Fish();
		Fish fishOnly = (Fish)fish1;
		fishOnly.fish();
		fish1.eat();
		fish1.move();
		fishOnly.breatheUnderWater();
		System.out.println();

		Animal cat1 = new Cat() {
			public void running() {
				System.out.println("Overriden. Not Running anymore.");
			}
		};
		((Cat)cat1).cat();
		cat1.eat();
		cat1.move();
		((Cat)cat1).running();

		System.out.println();

		Dog dog1 = new Dog();
		dog1.dog();
		dog1.eat();
		dog1.move();
		dog1.bark();
	}
}

/*
 * Eat method is declared in Animal because ALL animals can eat All animals can
 * move
 * 
 * Only dogs can bark, thus bark method is only declared in Dog class. Dog class
 * extends animal class All animals can do, dog can do
 * 
 * Same goes for fish class, not all animals can breathe under water All animals
 * can do, fish can do
 */

/*
 * Override methods: First: Declared when an object is created See example: Cat
 * 
 * Second: Same public void method created on Cat/Dog/Fish class that is already
 * created on Animal class See example: Dog
 * 
 * Ignores the method created in objects and outputs the override instead.
 */

/*
 * @Override annotation on Dog class. It simply checks whether a method is being
 * overriden. If method is not being overriden, there will be an error.
 */