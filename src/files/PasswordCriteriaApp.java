package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteriaApp {

	public static void main(String[] args) {
		
		// // 1. Define the file (path) that we want to read, read the file,close the file and catch reading exceptions
		
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\password.txt";
		File file =  new File(filename);
		String[] passwords =  new String[2];
		String password = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
				System.out.println(passwords[i]);
			} br.close();
		}catch (FileNotFoundException e) {
			System.out.println("ERROR: FIle not FOUND");
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println("ERROR: Can't read the file");
			e.printStackTrace();
		}
		
		// This will read a text file  and will retrieve a password phopne number
		//Password must contains a number
		
		for (int n = 0; n < passwords.length; n++) {
			password = passwords[n];
			try {
				//Convert String passowrd to character array
				char[] chars = password.toCharArray();
				StringBuilder sb = new StringBuilder();
				if (password != null && password.isEmpty()) {
				
				for (char c : chars) {
					if (Character.isDigit(c)) {
						System.out.println(sb);
						throw new ANumberException(password);
					}
				}
				}	
				System.out.println(sb);
			} catch(ANumberException e) {
				System.out.println("ERROR: The passowrd must contain at least 1 digit ");
			}
		}
		
		//There can be 911 in the phone number

	}

}


class ANumberException extends Exception {
	String pass;
	ANumberException(String pass) {
		this.pass = pass;
	}
	public String toString() {
		return ("ANumberException " +pass);
	}
}

class ALetterException extends Exception {
	
}

class SpecialCharException extends Exception {
	
}