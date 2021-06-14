package PPPart23Generics;

/*
 * Create a static void copy with source and destination
 * 
 * Create 2 array list
 * 
 * Copy one array list to the other
 */
public class Quiz {

	public static void main(String[] args) {
		
		
		Array<Cat> cats = new Array<>(3);
		
		cats.add(new Cat("Monkey"));
		cats.add(new Cat("Giraffe"));
		cats.add(new Cat("Tiger"));
		
		Mammal mammal1 = cats.getIndex(0);
		Mammal mammal2 = cats.getIndex(1);
		Mammal mammal3 = cats.getIndex(2);
		
		System.out.println(mammal1);
		System.out.println(mammal2);
		System.out.println(mammal3);
		
		Array<Creature> creature = new Array<>(3);
		
		System.out.println();
		copy(cats, creature);
		
		for(int i = 0; i < cats.size(); i++) {
			System.out.println(cats.getIndex(i));
		}
		
		System.out.println();
		
		Array<Cat> cats1 = new Array<>(2);
		cats1.add(new Cat("Brusko"));
		cats1.add(new Cat("Mingming"));
		
		Array<Creature> creature1 = new Array<>(3);
		creature1.add(new Creature("Mingmingming"));
		creature1.addAll(cats1);
		
		for(int i = 0; i < creature1.size(); i++) {
			System.out.println(creature1.getIndex(i));
		}
	}
	
	public static void copy(Array<? extends Mammal> source, Array<? super Mammal> destination) {
		for(int i = 0; i < source.size(); i++) {
			Mammal m = source.getIndex(i);
			destination.add(m);
		}
	}
}
