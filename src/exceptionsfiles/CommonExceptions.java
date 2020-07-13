package exceptionsfiles;

public class CommonExceptions {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		// 1- identify the potential porblem area
		// 2 - Surrounding with try catch block
		try {
			int c = a / b ;
		} catch (ArithmeticException e) {
			System.out.println("CANNOT DIVIDE By ZERO");
			System.out.println(e.toString());
		}
		
		System.out.println(" ");
		 String[] states = {"CA", "TX", "NY", "FL"};
		 
		 for (int i = 0; i < states.length; i++) {
			 try {
			 System.out.println(states[i]);
			 } catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println("ERROR index outside of array domain ");
				 System.out.println(e.toString());
			 } finally {
				 System.out.println("Iterating through array");
			 }
		 }
		 System.out.println("Program is closing ");
	}
  
  
}
