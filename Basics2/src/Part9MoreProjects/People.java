package Part9MoreProjects;

public class People {

	protected static int count = 0;
	String name;
	int age;

	public People() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	public void walk() {
		System.out.println(name + " is walking......");
	}

	public void eating() {
		System.out.println(name + " is eating.......");
	}

	public void sleep() {
		System.out.println(name + " is going to sleep......");
	}

	public String toString() {
		return "Name: " + name + " Age: " + age;
	}

}