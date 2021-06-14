package PPPart21Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Part5DeSerializingObjects {

	public static void main(String[] args) {
		
		String fileLoc = "Person.bin";
		
		try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(fileLoc))){
			Person p = (Person)oi.readObject();
			System.out.println(p);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Could not read object from: " + fileLoc);
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not locate file: " + fileLoc);
		}
		catch(IOException e) {
			System.out.println("Could not read file: " + fileLoc);
		}
	}
}
