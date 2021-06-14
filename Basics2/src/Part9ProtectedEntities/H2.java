package Part9ProtectedEntities;

public class H2 extends Motor{

	public H2() {
		name = "H2";
		CC = 1000;
	}
	
	public void expressway() {
		System.out.println("Now entering expressway");
	}
	
	public void cruiseControl() {
		System.out.println("Activated cruise control");
	}
}
