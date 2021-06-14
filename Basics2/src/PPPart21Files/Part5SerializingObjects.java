package PPPart21Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name + " " + id;
	}
}

public class Part5SerializingObjects {

	public static void main(String[] args) {
		
		Person p1 = new Person("Joe", 1);
		
		String pathString = "Person.bin";
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(pathString))){
			os.writeObject(p1);
		}
		catch(FileNotFoundException e) {
			System.out.println("Cannot create file: " + pathString);
		}
		catch(IOException e) {
			System.out.println("Cannot write file: " + pathString);
		}
		
		System.out.println("Completed. " + pathString + " created");
	}
}
