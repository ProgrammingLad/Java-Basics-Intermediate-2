package PPart16Enum;

enum Motors {
	NINJA, CBR500, R1;
}

public class Enum {
	public static void main(String[] args) {
		
	for(Motors motor: Motors.values()) {
		System.out.println(motor);
	}
	
	System.out.println(Motors.NINJA.ordinal());
	
	Motors motor1 = Motors.valueOf("NINJA");
	System.out.println(motor1 == Motors.NINJA);
	}
}
