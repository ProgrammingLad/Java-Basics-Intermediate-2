package Part5Methods;

public class Lesson4ReturnValues {
	
	public static void main(String[] args) {
		
		Lesson4PointOneClass motor = new Lesson4PointOneClass();
		
		/*
		 * Use:
		 * This enables your objects to be added on the main method, not just simply calling it from Lesson4PointOneClass
		 */
		String motor1 = motor.kawasaki();
		String motor2 = motor.honda();
		String motor3 = motor.yamaha();
		
		
		System.out.println(motor1);
		System.out.println(motor2);
		System.out.println(motor3);
	}
	
}
