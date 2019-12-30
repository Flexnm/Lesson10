package moreCollections;

import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {
		// HashMaps
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		// The key is of type Integer, the value is of type String.
		
		students.put(1111, "Nir Gal"); // .put(key, value) is the method to "add" elements to the HashMap.
		students.put(2222, "Avi Cohen");
		students.put(3333, "Avi Cohen");
		// Two of the students have the same value but different key.

		System.out.println(students); // The HashMap recognizes the duplicate values with unique keys. It arranges
										// them in its own order (Like HashSets).
		
		students.put(1111, "Shiri B."); // When adding duplicate keys for unique values:
	
		System.out.println(students); // The value of the element with that same key will be overwritten.
		// Keys are unique while values can be duplicate.
		
		// students.clear(); removes all elements from the HashMap.
		
		if(students.containsKey(1112)) { // .containsKey(key) returns a boolean value for specified key.
			System.out.println("Found id 1112");
		} else {
			System.out.println("Did not find id 1112");
		}
		
		System.out.println(students.get(2222)); // .get(key) "gets" the value of specified key.
		
		System.out.println(students.keySet()); // Creates a Set of the keys in the specified HashMap.
		
		for (int key : students.keySet()) {
			System.out.println(key + ": " + students.get(key));
		}
	}
}
