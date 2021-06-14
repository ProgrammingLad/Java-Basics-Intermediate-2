package Part5Methods;

public class Lesson9Class {
	private String name;
	private int age;
	
	public Lesson9Class(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Lesson9Class() {
		name = "TBD";
		age = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" ").append(age);
		return sb.toString();
	}
}
