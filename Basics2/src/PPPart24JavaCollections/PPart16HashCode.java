package PPPart24JavaCollections;

import java.util.HashSet;
import java.util.Set;

class Teachers {
	private int id;
	private String name;
	
	public Teachers(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
public class PPart16HashCode {

	public static void main(String[] args) {
		
		Set<Teachers> students = new HashSet<>();
		
		/*
		 * hashcode and equals method above are COMPARING IDs
		 * For ID: Look at Teachers constructor\
		 * 
		 * We can also compare names of teacher BUT
		 * We did not generate compare names at hashcode and equals
		 * 
		 * If two teachers have the same ID
		 * They will remove the duplicate
		 * and RETAIN the first inserted Teacher
		 * 
		 */
		students.add(new Teachers(0, "Eugene"));
		students.add(new Teachers(1, "Jeungardo"));
		students.add(new Teachers(2, "April"));
		students.add(new Teachers(0, "Kenneth"));
		students.add(new Teachers(4, "Bryan"));
		
		students.forEach(System.out::println);
	}
}
