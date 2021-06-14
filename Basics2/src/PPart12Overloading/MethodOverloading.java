package PPart12Overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		System.out.println(employee + "\n");
		
		
		Person person1 = new Person("Eugene");
		System.out.println(person1 + "\n");
		
		Person person2 = new Person("Symone", 24); 
		System.out.println(person2 + "\n");
	}
}
