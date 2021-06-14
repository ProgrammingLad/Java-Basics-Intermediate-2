package PPart14MoreOOP;

public class INinja implements InterfaceMotor, InterfaceBigBike {

	String name;
	
	public INinja() {
		name = "Ninja";
	}
	@Override
	public void start() {
		System.out.println("motor starting");
		
	}

	@Override
	public void bReak() {
		System.out.println("Hitting breaks... ");
		
	}

	@Override
	public void off() {
		System.out.println("Turning motor off ");
		
	}
	
	public String toString() {
		return name;
	}
	@Override
	public void enterXpressway() {
		System.out.println("Entering expressway..... " + name);
		
	}



}
