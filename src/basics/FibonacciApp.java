package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonacci number is defined by the som of the 2 previous numbers
		//fib(0) = 0
		//fib(1) = 1
		// fib(2) = fib(0) + fib(1) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 2 = 2
		//fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		//fib(5) - fib(4) + fib(3) = 3 + 2 = 5
		System.out.println(fib(6));
		
		//fac(0) = 1
		//fac(1) = 1
		//fac(2) = 2 * (2-1) = 2  = 2 * fac(1)
		//fac(3) = 3 * (3 -2) * (3 -1) = 6  = 3 * fac(2)
		//fac(4) = 4 * (4 -3) * ( 4- 2)* (4 -1) = 24 = 4 * fac(3)

	}
     public static int fib(int n) {
    	 if (n == 0) {
    		 return 0;
    		 }
    	 else if (n ==1) {
    		 return 1;
    	 }
		return(fib(n-1) + fib(n-2));
     }
}
