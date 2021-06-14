package PPPart21Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Part3WritingTextFiles {

	public static void main(String[] args) {

		String fileLoc = "G:\\Java\\Eclipse\\Eclipse Workspace\\Basics2\\TestText.txt";
		
		/*
		 * This is how you write files
		 * Line by line
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileLoc))){
			bw.write("Orange\n");
			bw.write("Lemons\n");
			bw.write("Apple\n");
			bw.write("Banana\n");
		}
		catch(IOException e) {
			System.out.println("Cannot write file: " + fileLoc);
		}
		
		System.out.println("File write completed: " + fileLoc);
	}
}
