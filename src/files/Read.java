package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Read {

	public static void main(String[] args) {
		// 1. Define the file (path) that we wnat to read
		
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\FileToRead.txt";
		
		// 2 . Create a file in Java
		File file = new File(filename);
		String text = null;
		
		
		BufferedReader br;
		try {
			//2 . Open the file
			br = new BufferedReader(new FileReader(file));
			// 3 . Read the file
			 text  = br.readLine();
			
			 // close the ressource
			 
			 br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found " +filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read teh data " +filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file " +filename);
		}
		
		System.out.println(text);

	}

}
