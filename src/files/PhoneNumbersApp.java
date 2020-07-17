package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumbersApp {

	public static void main(String[] args) {
		
		// 1. Define the file (path) that we wnat to read
		String filename = "C:\\Users\\rmorency\\eclipse-workspace\\files\\PhoneNumbers.txt";
		File file = new File(filename);
		String [] phonenums = new String[9];
	    String phonenum = null;	
	
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				for (int i = 0 ; i < phonenums.length; i++) {
					phonenums[i] = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: File not FOUND " +filename);
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("ERROR: Can't read the file");
				
			}
		
		// This will read a text file  and will retrieve a valid phopne number
				//Valid phone number is:
				//10 digits long
				
				//There can be 911 in the phone number
		//System.out.println(phonenum.substring(0,  1));
			for (int i = 0; i < phonenums.length; i++) {
				phonenum = phonenums[i];
				try {
					if (phonenum.length() !=10) {
						throw new TenDigitException(phonenum);
					}
					//Area code can not start with 0 or 9
					if (phonenum.substring(0,  1).equals("0") || phonenum.substring(0,  1).equals("9")) {
						throw  new AreaCodeException(phonenum);
					}
					//There can not  be 911 in the phone number
					for (int n = 0; n < phonenum.length() - 2; n++) {
						if (phonenum.substring(n,  n+1).equals("9")) {
							if (phonenum.substring(n + 1, n + 3).equals("11")) {
								throw new EmergencyException(phonenum);
							}
						}
						
					}
					
				     System.out.println(phonenum);
				
				}catch(TenDigitException e ) {
					System.out.println("ERROR: phone number is not 10 digits");
					System.out.println(e.toString());
				} catch (AreaCodeException e) {
					System.out.println("ERROR: Phone number has an invalid area code");
					System.out.println(e.toString());
				} catch (EmergencyException e) {
					System.out.println("ERROR: Invalid 911 sequence FOUND");
					System.out.println(e.toString());
				}
		
			}
		
		}
}

class TenDigitException extends Exception{
	String num;
	TenDigitException(String num) {
		this.num = num;
		
	}
	public String toString() {
		return ("TenDigitException " + num);
	}
}

class AreaCodeException extends Exception{
	String num;
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException " + num);
	}
}

class EmergencyException extends Exception{
	String num;
	EmergencyException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("EmergencyException " + num);
	}
	
}