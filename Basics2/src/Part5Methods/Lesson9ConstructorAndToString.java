package Part5Methods;

public class Lesson9ConstructorAndToString {

	public static void main(String[] args) {
		
		Lesson9Class person1 = new Lesson9Class("Eugene", 24);
		Lesson9Class person2 = new Lesson9Class();
		Lesson9Class person3 = new Lesson9Class("Bryan", 27);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}
}
