package PPart14MoreOOP;

public class DDownCasting {

	public static void main(String[] args) {
		DPerson emp1 = new DEmployee();
		DEmployee pay = (DEmployee)emp1;
		pay.salary();
	}
}
