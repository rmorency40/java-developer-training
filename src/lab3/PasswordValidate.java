package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordValidate {

	public static void main(String[] args) {
		//Read a file of passwords
		
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\password.txt";
		String [] passwords = new String[14];
		
		File file = new File(filename);
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				for (int i = 0; i < passwords.length; i++) {
					passwords[i] = br.readLine();
					//System.out.println(passwords[i]);
				}
			} catch (FileNotFoundException e) {System.out.println("ERROR: file not FOUND!");
				
			} catch (IOException e) { System.out.println("ERROR: Couldn't read the file !");
				
			}
		
		//Test again our criteria
			
			for (String password : passwords) {
				System.out.println("*********\n" + password + " \n");
				boolean hasnumber = false;
				boolean hasletter = false;
				boolean hasspeacilcharacter = false;
				boolean hasInvalidChar = false;
				//condition 1. contains a number
				
				for (int n = 0; n < password.length(); n++) {
					if ("0123456789".contains(password.substring(n, n + 1 ))) {
						hasnumber = true;
						//System.out.println("Position " + n + " contains a number");
					}
					//condition 2. contains a letter
					else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n + 1).toLowerCase())) {
						 hasletter = true;
						//System.out.println("Position "+ n + " contains a letter");
					}
					//condition 3. contains special character (! @ #)
					else if ("! @ $ # & * - )".contains(password.substring(n, n + 1))) {
						hasspeacilcharacter = true;
						//System.out.println("Position "+ n + " contains special character");
					}
					else {
						try {
						throw  new InvalidCharacterException(password.substring(n, n + 1));
						
						}catch (InvalidCharacterException e) {e.toString();}
					}
				}
				
				// Tests andEception handling
			try {
					if (!hasnumber) { throw new NumberCriteriaException (password);}
					else if (!hasletter) { throw new LetterCriteriaException(password); }
					else if (!hasspeacilcharacter) { throw new SpecialCharCriteriaException(password); }
					else {System.out.println("Valid password"); }
				}catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
			   System.out.println("Invalid password");
			   System.out.println(e.toString());
				}
				
			}
				
			}
			
	}



class InvalidCharacterException extends Exception {
	String ch;
	public InvalidCharacterException (String ch) {
		this.ch = ch;
	}
	public String toString() {
		return "InvalidCharacterException " + ch;
	}
}

class NumberCriteriaException extends Exception {
	String password;
	public NumberCriteriaException  (String password) {
		this.password = password;
	}
	public String toString() {
		return "NumberCriteriaException  " + password;
	}
}

class LetterCriteriaException extends Exception {
	String password;
	public LetterCriteriaException  (String password) {
		this.password = password;
	}
	public String toString() {
		return "LetterCriteriaException  " + password;
	}
}


class SpecialCharCriteriaException extends Exception {
	String password;
	public SpecialCharCriteriaException  (String password) {
		this.password = password;
	}
	public String toString() {
		return "SpecialCharCriteriaException " + password;
	}
}




