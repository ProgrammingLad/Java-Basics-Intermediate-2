package Part9ProtectedEntities;

public class Motor {

	protected String name;
	protected int CC;
	
	public void start() {
		System.out.println("Motor starting.....");
	}
	
	public void off() {
		System.out.println("Motor is now off.....");
	}
	
	public void putGas() {
		System.out.println("Refilling tank......");
	}
	
	public void service() {
		System.out.println("Changing oil.......");
	}

	@Override
	public String toString() {
		return name + " " + CC;
	}
	
}
