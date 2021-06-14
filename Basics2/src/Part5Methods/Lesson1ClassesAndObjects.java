package Part5Methods;

public class Lesson1ClassesAndObjects {

	public static void main(String[] args) {
		
		Lesson2Person person1 = new Lesson2Person();
		person1.name = "Eugene";
		person1.age = 24;
		
		System.out.printf("Name: %s \nAge: %s\n",person1.name, person1.age);
		
		Lesson2Person person2 = new Lesson2Person();
		person2.name = "Eidel";
		person2.age = 23;
		
		System.out.println();
		
		System.out.printf("Name: %s\nAge: %s", person2.name, person2.age);
	}
}
