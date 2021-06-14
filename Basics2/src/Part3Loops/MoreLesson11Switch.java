package Part3Loops;

public class MoreLesson11Switch {
	public static void main(String[] args) {

		int option = 1;

		switch (option) {
		case 0:
			System.out.println("Option 0 selected");
			break;
		case 1:
			System.out.println("Option 1 selected");
			break;
		case 10: 
			System.out.println("Exiting program........");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}
