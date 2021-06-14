package Part9MoreProjects;


public class Main {

	public static void main(String[] args) {
		
	
	
	People person1 = new Person1();
	System.out.println(person1);
	person1.sleep();
	Person1 action = (Person1)person1;
	action.drive();
	action.gym();
	
	System.out.println();
	
	People person2 = new Person2();
	System.out.println(person2);
	person2.eating();
	
	System.out.println();
	
	People person3 = new Person3("Abram");
	Person3 action2 = (Person3)person3;
	person3.sleep();
	action2.coding();
	
	System.out.println();
	System.out.println("Number of people inside this database: " + People.getCount());
	}
}
