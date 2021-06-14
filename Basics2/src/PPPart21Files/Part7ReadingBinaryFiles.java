package PPPart21Files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Part7ReadingBinaryFiles {

	public static void main(String[] args) {
		
		String fileLoc = "Binary.bin";
		File file = new File(fileLoc);
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
			int value = dis.readInt();
			System.out.println(value);
			
			byte[] bytes = (byte[])dis.readAllBytes();
			for(byte b: bytes) {
				System.out.println(b);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not read " + file.getAbsolutePath());
		}
		catch(IOException e) {
			System.out.println("Could not open " + file.getAbsolutePath());
		}
		
		
	}
}
