package basics;

public class MaxMinAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int  array [] = {2, 1, 3, 9, 89, 55, 43, 90, 85, 25, 10, 68, 69,101, 2020, -1};
        System.out.println("The max  number of this array is : " +maxvalue(array));
        System.out.println("The min number of the array is: " +minvalue(array));
        System.out.println("The average of the number of the given array is: " +averagevalue(array));
        System.out.println(sumnumbers(10));
        
	}
	//This function returns the max value of an array of numbers
      public static int maxvalue(int array[]) {
    	   int max = array[0] ;
    	  for (int i = 0; i < array.length; i++) {
    		  if (array[i] > max) {
    			  max = array[i];
    		  }
    		  
    		  //System.out.println(array[i]);
    	  }
    		  
    	  return max;
    	  
      }
    //This function returns the min value of an array of numbers
      
      public static int minvalue(int array[]) {
    	 int  min = array[0];
    	  for (int y = 0; y < array.length ; y++) {
    		  if (array[y] < min ) {
    			  min = array[y];
    		  }
    	  }
    	  return min;
      }
      
    //This function returns the average value of an array of numbers
      
      public static double averagevalue(int array[]) {
    	  int sum = 0;
    	  for (int x = 0; x < array.length; x++) {
    		  
    		  sum = sum + array[x];
    	  }
    	  //Calculate the average
    	  
    	  double average = (sum / array.length);
    	  return average;
      }
      // Caculate teh som of a given numbers
      
      public static int sumnumbers(int n) {
    	  int sum1 = 0;
    	  for (int w = 1 ; w <= n ; w++) {
    		  sum1 = sum1 + w;
    		  System.out.println("The sum of " + w + " nummbers is: " +sum1);
    		  
    	  }
    	  return sum1;
      }
      
}
