package PPPart24JavaCollections;

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	public boolean equals(Object other) {
		
		if(other == null) {
			return false;
		}
		
		if(!(other instanceof Student)) {
			return false;
		}
		
		if(this.name == null) {
			return false;
		}
		
		Student s = (Student)other;
		
		if(s.name == null) {
			return false;
		}
		
		return this.name.equals(s.name);
	}
}

public class PPart11Equals {

	public static void main(String[] args) {
		
		Student s1 = new Student("Eugene");
		Student s2 = new Student("Eugene");
		
		System.out.println(s1.equals(s2));
	}
}
