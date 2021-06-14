package Part9MoreProjects;


public class Person2 extends People {

	public Person2() {
		name = "Bryan";
		age = 28;
	}
	
	public void work() {
		System.out.println(name + " is now working......");
	}
	
	public void deliver() {
		System.out.println(name + " is now delivering milktea...");
	}
}
