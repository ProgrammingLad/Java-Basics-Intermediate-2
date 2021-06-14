package PPart14MoreOOP;

public interface InterfaceMotor {
	
	public abstract void start();
	
	public abstract void bReak();
	
	public abstract void off();

	default void key() {
		System.out.println("Putting key in");
	}
}

