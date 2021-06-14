package PPPart21Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Part4ReadingAndWritingTest {

	public static void main(String[] args) {
		
		String fileLoc = "Whatever.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileLoc))){
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not find file " + fileLoc);
		}
		catch(IOException e) {
			System.out.println("Could not read file " + fileLoc);
		}
		
		
		String text1 = "eugene";
		Path path = Paths.get(text1);
		
		try {
			Files.write(path, text1.getBytes());
		}
		catch(IOException e) {
			System.out.println("could not write file " + fileLoc);
		}
		
	}
}
