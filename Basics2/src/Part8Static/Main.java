package Part8Static;

public class Main {

	public static void main(String[] args) {
		
		Motor motor1 = new Motor("Ninja", 250000);
		Motor motor2 = new Motor("ZX25r", 410000);
		
		System.out.println(Motor.motorsInShowRoom());
		System.out.println(motor1);
		System.out.println(motor2);
		
		
	}

}
