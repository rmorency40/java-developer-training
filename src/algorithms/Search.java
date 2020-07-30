package algorithms;

public class Search {
	
	public static int linearSearch (int[] dataSet, int target) {
		//iterate through dataSet searching for target
		
		for (int i = 0; i < dataSet.length; i++) {
			if (dataSet[i] == target) {
				System.out.println("The number " + target + " is in the position " + i + " in the list of numbers");
				return i;
				
			}
		}
		return -1;
		
	}
	
	
    public static int binarySearch(int[] dataSet, int target, int start, int end) {
    	//Binary search assumes a sorted array and can therefore  continually split our search domain in half
    	//int middle = Math.floorDiv(start, end)/2 ;
    	System.out.println("searching between " + dataSet[start] + " and " + dataSet[end]);
    	int midpoint = (int)Math.floor(start + end) /2 ;
    	int value = dataSet[midpoint];
    	System.out.println("Midpoint: " + midpoint + " value in midpoint: " + value);
    	if (value > target) {
    		return binarySearch(dataSet, target, start, midpoint -1);
    		
    	}
    	else if (value < target) {
    		return binarySearch(dataSet, target, midpoint + 1, end);
    	}
    	System.out.println(target + "=" +value);
    	return midpoint;
    }
  
    	
 }

