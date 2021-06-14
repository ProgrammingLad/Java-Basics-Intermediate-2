package Part5Methods;

public class Lesson5Point1Class {
	
	String[] motors = {
		"Kawasaki",
		"Yamaha",
		"Honda",
		"Suzuki",
	};
	
	int count = 1;
	
	String getMotors() {
		
		String selection = "Available motors: \n";
		
		for (int i = 0; i < motors.length; i++) {
		selection += String.format("%d. %s\n", count, motors[i]);
		count++;
		}
		
		return selection;
	}
	
	
}
