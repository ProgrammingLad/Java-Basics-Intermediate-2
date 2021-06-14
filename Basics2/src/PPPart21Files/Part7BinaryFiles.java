package PPPart21Files;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Part7BinaryFiles {

	public static void main(String[] args) {

		String fileName = "Binary.bin";
		File file = new File(fileName);

		int value = 7;
		
		byte[] bytes = new byte[3];
		bytes[0] = 2;
		bytes[1] = 52;
		bytes[2] = 69;
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
			dos.writeInt(value);
			dos.write(bytes);
		} catch (FileNotFoundException e) {
			System.err.println("Cannot create file: " + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Cannot write file: " + file.getAbsolutePath());
		}
		
		System.out.println("Written: " + file.getAbsolutePath());

	}
}
