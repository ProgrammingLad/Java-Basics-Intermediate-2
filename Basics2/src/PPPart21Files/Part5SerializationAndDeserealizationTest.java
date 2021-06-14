package PPPart21Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " " + age; 
	}
}
public class Part5SerializationAndDeserealizationTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("Eugene", 24);
		
		String fileLoc = "Employee.txt";
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileLoc))){
			os.writeObject(e1);
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not create object: " + fileLoc);
		}
		catch (IOException e) {
			System.out.println("Could not write object: " + fileLoc);
		}
		
		
		try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(fileLoc))){
			Employee e2 = (Employee)oi.readObject();
			System.out.println(e2);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Could not load object: " + fileLoc);
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not read object: " + fileLoc);
		}
		catch(IOException e) {
			System.out.println("Could not locate object: " + fileLoc);
		}
	}
}
