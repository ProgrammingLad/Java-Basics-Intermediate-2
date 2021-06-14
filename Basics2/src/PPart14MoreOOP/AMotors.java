package PPart14MoreOOP;

public abstract class AMotors {

	String name;
	
	public abstract void start();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
}
