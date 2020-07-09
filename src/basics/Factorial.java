package basics;

public class Factorial {

	public static void main(String[] args) {
		// Compute the factorial of a given positive number
	
		System.out.println("The factorial of the given number is: " +fac(6));

	}
      public static int fac(int n) {
    	
    	  if (n < 0) {
    		  System.out.println("Only factorial of positive numbers can be  computed !");
    		  return -1 ;  		  
    	  }
    	  else if (n == 0) {
    		  System.out.println("The factorial of  0 is  0 :");
    		  return 1;
    		  
    	  }
    	  else if (n == 1) {
    		  //System.out.println("The fatorial of 1 is 1");
    		  return 1;
    	  }
    	  //System.out.println("The factorial of the given  number " + n + " is :");
    	  return(n * fac(n -1));
      }
}
