package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		
		String[] cities = {"New York City", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
	
		//Declare teh array
		
		String [] countries;
		
		// Define the array
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
	//Declare and define  the array (only the size)
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println("****************");
		int i = 0;
		
		// The do while loop enters the loop and test the condition
		do {
		    System.out.println("STATE: " +states[i]);
		    i = i  + 1;
		    } while (i < 5);
		
		// While loop tests condition first before enter in the loop
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//System.out.println("You are here");
		int  n = 0;
		//boolean statefound = false;
		boolean statefound = false;
		//System.out.println("You are here as well");
		while(!statefound) {
			//System.out.println("Got thre ?");
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND !");
				statefound = true;
				//System.out.println("STATE at " + n + " : " + states[n]);
			}
			
			n++;

		}
	
        // For loop best structure for iterating in an array
		System.out.println("Printing with for loop OK  =============");
		for (int x = 0; x < 5 ; x++) {
			System.out.println(states[x]);
			
		}
		
		System.out.println("Printing some numbers ++++++++++++++++++++++++++");
		for (int y = 0; y < 10 ; y++) {
			System.out.println(" About to print some numbers : " + y);
		}
	}

}
