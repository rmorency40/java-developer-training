package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Find the path of teh file we wnat to write
		
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\FIleToWrite.txt";
		String message = "I'm writing data that will be place to the file" ;
		
		// 2 . Create the  file in Java
		
		File file = new File(filename);
		
		
		
		
		try {
			
			//3. Open the file
			FileWriter fw = new FileWriter(file);
			//4 . Write to the file
			
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file " +filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the file " +filename);
		}
		
	
		//5. Close the file

	}

}
