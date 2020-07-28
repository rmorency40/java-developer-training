package datastructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// 1. Define the collection
		
		Set<String> animals = new HashSet<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("pig");
		animals.add("snake");
		animals.add("hog");
		
		System.out.println(animals.size() + " " + animals); 
		
		animals.add("cat");
		animals.add("snake");
		animals.add("gousse");
		
		System.out.println( animals.size() + " "+ animals);
		// Create a new set that we can use for comparison
		
		

	}

}
