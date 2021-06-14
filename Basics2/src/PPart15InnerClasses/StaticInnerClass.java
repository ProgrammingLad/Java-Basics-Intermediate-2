package PPart15InnerClasses;

class Person {

	
	public static class Head {
		public void print() {
			System.out.println("Head");
		}
	}

	public static class Body {
		public void print() {
			System.out.println("Body");
		}
	}

	public void print() {
		Head head = new Head();
		Body body = new Body();
		
		head.print();
		body.print();
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {

		Person person = new Person();
		person.print();

	}
}