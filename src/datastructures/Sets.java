package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// 1. Define the collection
		// HashSet - complete random order
		
		//Set<String> animals = new HashSet<String>();
		
		// LinkedHashSet is complete order like a stack
		//Set<String> animals = new LinkedHashSet<String>();
		// TreeSet represent to  natural order
		Set<String> animals = new TreeSet<String>();
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
		
		Set<String>  farmanimals = new HashSet<String>();
		farmanimals.add("chicken");
		farmanimals.add("cow");
		farmanimals.add("pig");
		farmanimals.add("horse");
		farmanimals.add("dog");
		
		System.out.println("\n" +farmanimals);
		
		// What is the intersection between animals set and farmanimals set
		
		// 1.  Copy existing set into new set
		
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println("\n\n" + intersectionSet);
		
		// 2 . Retain ONLY the elements that are also in the other set
		
		intersectionSet.retainAll(farmanimals);
		
		System.out.println("\nThe intersection is:  " +intersectionSet);
		
		// What is the union (all the elements that are in both sets) OR 
		
		Set<String> unionSet = new HashSet<String>(farmanimals);
		unionSet.addAll(animals);
		System.out.println("\nThe union is " +unionSet);
		
		// What is the difference (animals) NOT in farmanimals
		
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmanimals);
		System.out.println("\nThe difference is " + differenceSet);
		

	}

}
