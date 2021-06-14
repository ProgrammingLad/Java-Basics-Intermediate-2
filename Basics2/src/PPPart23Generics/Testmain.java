package PPPart23Generics;

class Motor {
	private String model;
	
	public Motor(String model) {
		this.model = model;
	}
	
	public String toString() {
		return model;
	}
	
	public void startAll() {
		System.out.println("Starting all motors..... " + model);
	}
}

class Kawasaki extends Motor {
	
	public Kawasaki(String model) {
		super(model);
	}
}

class Ninja extends Kawasaki {
	
	public Ninja(String model) {
		super(model);
	}
}
public class Testmain {

	public static void main(String[] args) {
		
	
		
		Test<Ninja> m2 = new Test<>(2);
		m2.setObject(new Ninja("ZX25"));
		m2.setObject(new Ninja("N400"));
		
		Ninja n1 = m2.getIndex(0);
		Ninja n2 = m2.getIndex(1);
		
		System.out.println(n1 + " " + n2);
	
		Test<Motor> m1 = new Test<>(2);
		copy(m2,m1);
		
		for(int i = 0; i < m1.size(); i++) {
			System.out.println(m1.getIndex(i));
		}
	}
	
	public static void copy(Test<? extends Kawasaki> source, Test<? super Kawasaki> destination) {
		for(int i = 0; i < source.size(); i++) {
			Kawasaki copy = source.getIndex(i);
			destination.setObject(copy);
		}
	}
	
}


/*
 * Create a static void copy with source and destination
 * 
 * Create 2 array list
 * 
 * Copy one array list to the other
 */