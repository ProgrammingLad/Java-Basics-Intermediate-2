package PPart14MoreOOP;

public class ICBR implements InterfaceMotor, InterfaceBigBike {

	private String name;
	
	public ICBR () {
		name = "CBR";
	}
	@Override
	public void start() {
		System.out.println("Starting ");
	}

	@Override
	public void bReak() {
		System.out.println("Hitting breaks");
		
	}

	@Override
	public void off() {
		System.out.println("Turning off ");
		
	}

	
	public String toString() {
		return name;
	}
	@Override
	public void enterXpressway() {
		System.out.println("Entering expressway..." + name);
		
	}


}
