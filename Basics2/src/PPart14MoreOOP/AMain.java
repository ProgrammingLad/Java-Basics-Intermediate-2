package PPart14MoreOOP;

public class AMain {

	public static void main(String[] args) {
		
		/*
		 * Check documentation of class: ANinja and ACBR
		 * 
		 * ANinja's name has already been declared in class ANinja
		 * ACBR's name has not yet been DECLARED, but a constructor has been provided
		 * 
		 * * The disadvantage of setting name inside public ANinja(); is
		 * When you create a new ANinja object, the name will always be set to ZX25R
		 * Unlike ACBR, you can create multiple ACBR objects and they can have different names
		 */
		
		ANinja ninja = new ANinja();
		ninja.start();
		
		ACBR cbr = new ACBR("CBR 150");
		cbr.start();
	}
}
