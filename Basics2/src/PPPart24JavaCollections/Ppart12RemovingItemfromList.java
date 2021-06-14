package PPPart24JavaCollections;

import java.util.ArrayList;
import java.util.List;

class Motor{
	private String model;
	
	public Motor(String model) {
		this.model = model;
	}
	
	public String toString() {
		return model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	//Reference method: public boolean equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motor other = (Motor) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
}
public class Ppart12RemovingItemfromList {

	public static void main(String[] args) {
		
		/*
		 * IMPORTANT note for: motor.remove(m1)
		 * 
		 * If we do not have public boolean equals method -- Check reference at top
		 * It will detect that:
		 * Motor m1 = new Motor("ZX25R") & new Motor("ZX25R") are two different objects
		 * 
		 * If we remove Reference method:
		 * And we use motor.remove(m1) -- Line 72
		 * List.of(new Motor("ZX25R") -- Line 74 
		 * Will not be removed from list while looping through the array
		 * Because eventhough they have the same ("model name")
		 * Java detects that they are two different objects
		 * Because we are declaring new Motor(""), means NEW object
		 * 
		 * To see this in action:
		 * 1. Comment out Reference method at top
		 * 2. Run the program: Check second array iteration
		 * 
		 * Look at ZX25R will still be there
		 * Because Java is detecting that:
		 * 
		 * Motor m1 = new Motor("ZX25R"); & (List.of(new Motor("ZX25R") are two different objects
		 * 
		 */
		
		Motor m1 = new Motor("ZX25R");
		
		List<Motor> motor = new ArrayList<>(List.of(new Motor("ZX25R"), new Motor("Ninja"), new Motor("Dominar 400")));
		
		motor.forEach(System.out::println);
		System.out.println();
		
		motor.remove(m1);
		
		//Second array iteration
		System.out.println("Now removing ZX25R from the ArrayList.....");
		motor.forEach(e -> {
			System.out.println(e);
		});
	}
}
