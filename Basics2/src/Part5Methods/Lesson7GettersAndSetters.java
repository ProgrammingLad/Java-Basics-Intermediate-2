package Part5Methods;

public class Lesson7GettersAndSetters {

	public static void main(String[] args) {

		Lesson7Class person1 = new Lesson7Class();
		person1.setName("Eugene");
		person1.setAge(24);
		
		System.out.printf("%s %d\n", person1.getName(), person1.getAge());
	}
}
