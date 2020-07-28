package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// implement map interface
		
		//HashMap<Integer, String> hMap = new HashMap<Integer, String>(); unordered map
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		mapUtility(hMap);

	}
    public static void mapUtility(Map<Integer , String> map) {
    	//Add key value pairs
    	
    	map.put(101, "Steve");
    	map.put(502, "Roger");
    	map.put(22, "Jennifer");
    	map.put(205, "Elie");
    	map.put(315, "Mike");
    	map.put(750, "Kelly" );
    	
    	// Expose / access elements
    	
    	System.out.println("See all keys " + map.keySet());
    	System.out.println("See all key-value pairs " + map);
    	System.out.println("\n" + map.get(502));
    	
    	// Iterate through map of key-value pairs
    	System.out.println("\n");
    	for (int key : map.keySet()) {
    		System.out.println("[KEY: " + key + " - VALUE " + map.get(key) + " ]");
    	}
    }
}
