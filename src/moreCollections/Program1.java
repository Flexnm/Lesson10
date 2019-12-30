package moreCollections;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {

		ArrayList<String> texts = new ArrayList<String>(); // Creats an array list with size 0 of type Object (currently
															// its String).
		texts.add("One"); // .add(object) adds an object to the last index.
		texts.add("Two");
		texts.add(1, "Three"); // .add(index, object) adds an object at the index and adds +1 to indexes to the
								// right.*

		System.out.println(texts);
		texts.set(1, "Four"); // .set(index, object) replaces the object at index with the new object.
		System.out.println(texts);

		// If in .set(index, object) the index is not in the list, then a Run error will
		// occur (the error will be displayed ONLY when running the program).

		texts.remove(1); // .remove(index) will remove the object at the index and will do -1 to the
							// indexes of the objects to the right of it.*
		System.out.println(texts);

		System.out.println(texts.get(0)); // .get(index) "gets" the object at the index.

		for (int i = 0; i < texts.size(); i++) { // .size is the same as the arrays .length (its the number of elements
													// in the list).
			System.out.println(texts.get(i));
		}

	}
	// * This refers to the objects with indexes larger than of the object.
}
