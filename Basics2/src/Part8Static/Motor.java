package Part8Static;

public class Motor {
	
	/*
	 * Static methods are used if you want to implement methods on CLASS level
	 * Example: Motor.(Example)
	 */
	private String motorModel;
	private int price;
	
	public static int motorCount = 0;
	private int id;
	
	public static String motorsInShowRoom() {
		return String.format("Motorcount in showroom: %d ", motorCount);
	}
	
	public Motor(String model, int price) {
		motorModel = model;
		this.price = price;
		
		id = motorCount++;
	}

	public static int motorCount() {
		return motorCount;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ").append(id).append(" ").append("Motor: ").append(motorModel).append(" ").append("Price: ").append(price);
		
		return sb.toString();
	}
	
	public static void whatever() {
		System.out.println("panget ko");
	}
	
}

