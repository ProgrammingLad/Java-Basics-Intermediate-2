package PPart16Enum;

enum Numbers{
	
	ONE("One"), TWO("two"), THREE("three");
	
	private String name;
	
	Numbers(String name){
		this.name = name;
	}

	/*
	 * Click RUN to see value!
	 * super.toString is used so we can print out ONE AND ("One")
	 * 
	 * If we do not use super.toString
	 * It will only print out "One"
	 * Without the parent ONE
	 * 
	 * try to remove super.toString() and return name
	 * It will only print out "One"
	 */
	
	public String toString() {
		return super.toString() + " " + name;
	}
}
public class EnumPart2 {

	public static void main(String[] args) {
		
		System.out.println(Numbers.ONE);
	}
}
