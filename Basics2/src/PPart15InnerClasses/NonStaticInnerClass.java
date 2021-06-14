package PPart15InnerClasses;

class Person1 {

	private String name;

	public Person1(String name) {
		this.name = name;
	}

	private class Printer {
		public void print() {
			System.out.println(name);
		}
	}

	public void display() {
		Printer printer = new Printer();
		printer.print();
	}

}

public class NonStaticInnerClass {

	public static void main(String[] args) {

		Person1 p1 = new Person1("Eugene");
		p1.display();
		
	}
}