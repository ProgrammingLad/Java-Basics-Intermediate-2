package PPPart21Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Part6DeserializingMultipleObjects {

	public static void main(String[] args) {

		String fileLoc = "MultiObjects.txt";
		
		try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(fileLoc))){
			Serializable[] p1 = (Serializable[])oi.readObject();
			for(Serializable person: p1) {
				System.out.println(person);
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println("Could not load object");
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not locate file: " + fileLoc);
		}
		catch(IOException e) {
			System.out.println("Could not load file: " + fileLoc);
		}
	}
}
