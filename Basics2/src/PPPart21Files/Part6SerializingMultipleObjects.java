package PPPart21Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Serializable {
	private String name;
	private int id;
	
	public Person1(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name + " " + id;
	}
}
public class Part6SerializingMultipleObjects {

	public static void main(String[] args) {
	
		String fileLoc = "MultiObjects.txt";
		
		Serializable[] people = new Serializable[2];
		
		people[0] = new Person1("Eugene", 24);
		people[1] = new Person1("Eidel", 23);
		
		
		try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(fileLoc))){
			ob.writeObject(people);
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not write file: " + fileLoc);
		}
		catch(IOException e) {
			System.out.println("Could not save file: " + fileLoc);
		}
		
		System.out.println("Objects successfully saved for: " + fileLoc );
	}
}
