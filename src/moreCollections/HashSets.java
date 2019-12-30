package moreCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
	public static void main(String[] args) {

		HashSet<String> names = new HashSet<String>(); // HashSet is also a generic collection and should be specified
														// to type. HashSet is also dynamic as ArrayList.
		names.add("One");
		names.add("Two");
		names.add("Three");
		names.add("Four");

		System.out.println(names);
		System.out.println("\n");

		names.add("Two"); // HashSet does not contain duplicates of its elements.
		names.add("Four");

		System.out.println(names);
		System.out.println("\n");
		// HashSets have no index. There are no .set() and .get() methods because of
		// this.

		Iterator<String> iterator = names.iterator(); // So HashSets have Iterators. Those allow to go through the
														// elements of the HashSet.
		// The Iterator is a list of references for objects in the HashSet it is
		// specified to.
		while (iterator.hasNext()) { // .hasNext() is boolean (true/false) method that asks if the Iterator has a
										// reference "next element".***
			String name = iterator.next(); // .next returns the "next element".
			System.out.println(name); // 'name' references an element in the HashSet.
		}

		System.out.println("\n");

		// foreach loop: a type of loop that is specific for collections.
		for (String name : names) { // for ('Type' 'Reference' : 'collection name'){}
			System.out.println(name); // The Type is of the reference.
		} // for each name in names, print name.

		System.out.println("\n");

		for (String name : names) {
			if (name.length() > 3) {
				System.out.println(name);
			}
		}
	}
}
