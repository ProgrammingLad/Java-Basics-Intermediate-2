package PPart16Enum;

enum Cars {
	AUDI, TOYOTA, BMW;
}

public class EnumSwitches {

	public static void main(String[] args) {

		Cars cars = Cars.AUDI;

		switch (cars) {
		case AUDI:
			System.out.println("AUDI");
			break;
		case TOYOTA:
			System.out.println("TOYOTA");
			break;
		case BMW:
			System.out.println("BMW");
			break;
		default:
			System.out.println("Not a car");
			break;
		}
	}

}
