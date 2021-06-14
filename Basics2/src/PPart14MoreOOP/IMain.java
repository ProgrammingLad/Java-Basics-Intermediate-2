package PPart14MoreOOP;

public class IMain {

	public static void main(String[] args) {
		
		/*
		 * For Ninja:
		 * A getName method is created to return name from setName, so you have to call .getName()
		 * 
		 * For CBR:
		 * A toString method has been created, to return the name of the object.
		 */
		
		/*
		 * Default methods are not forced to be implemented, but reminding a user that it's there.
		 */
		
		InterfaceMotor[] motors = {new ICBR(), new INinja()};
		
		for(InterfaceMotor name: motors) {
			System.out.println(name);
		}
		
		System.out.println("\n");
		
		/*
		 * Down casting is needed because the InterfaceMotor DOES NOT HAVE enterXpressway method
		 * enterXpressway method is implemented in another interface called: Interface BigBike
		 * 
		 * If we will create a new Object Ninja instead of using InterfaceMotor
		 * We should be able to access both methods without down casting
		 */
		InterfaceMotor m1 = new INinja();
		m1.key();
		INinja whatever = (INinja)m1;
		whatever.enterXpressway();
		
		System.out.println("\n");
		
		INinja m2 = new INinja();
		m2.enterXpressway();
		m2.key();
	}
}
