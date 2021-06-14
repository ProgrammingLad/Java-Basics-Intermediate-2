package PPPart21Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Part1Files {

	public static void main(String[] args) throws IOException {
		
		//This is how you find what directory file is currently in
		File currentDirectory = new File(".");
		System.out.println(currentDirectory.getAbsolutePath());
		
		//This is how you find what folders are inside the directory you're checking
		for(String f: currentDirectory.list()) {
			System.out.println(f);
		}
		
		System.out.println("\n");
		
		String text = "Hello\nthere";
		
		/*
		 * This is how you write files
		 */
		Path path = Paths.get("text.txt");
		try {
		Files.write(path, text.getBytes());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Reading files
		String retrievedText = Files.readString(path);
		System.out.println(retrievedText);
	}
}
