package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. Crate  a collection
		
		ArrayList<String> cities = new ArrayList<String>();
		
		// 2. add some elements
		
		cities.add("Clevelant");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");
		cities.add("Austin");
		
		//3. Iterate teh collection
		
		for (String city : cities) {
			System.out.print(city + " ");
		}
		//4 . Get the size 
		int size = cities.size();
		System.out.println("\n\nThere are " + size + " of elements in the collection ");
		
		// 5 . retrive specific element
		
		System.out.println("\n"+cities.get(4));
		
		//5 . Remove element form the collection
		
		cities.remove(0);
		size = cities.size();
		System.out.println("\n\nThere are now "  + size + " of elements in the collection ");
		for (String city : cities) {
			System.out.println(city);
		}
	}

}
