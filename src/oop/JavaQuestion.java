package oop;

public class JavaQuestion {
	
	public static void main(String[] args) {
		System.out.println(isHelloWorld("Hello World"));
		
	}
	
	static boolean isHelloWorld(String string) {
		String str = "Hello World";
		
		if (string.equals(str)) {
			return true;
		}
		else {
			return false;
		}
	}

}
