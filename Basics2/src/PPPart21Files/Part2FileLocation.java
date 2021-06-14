package PPPart21Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Part2FileLocation {

	public static void main(String[] args) {
		
		String fileLocation = "G:\\Java\\Eclipse\\Eclipse Workspace\\Basics2\\text.txt";
		System.out.println(new File(fileLocation).exists());
		
		System.out.println();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))){
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (FileNotFoundException e) {
			System.err.println("File not found: " + fileLocation);
		}
		catch(IOException e) {
			System.err.println("Error reading file: " + fileLocation);
		}
	}
}
