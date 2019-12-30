package moreCollections;

import java.util.HashSet;

public class ClassEx1 {
	public static void main(String[] args) {
		// create a program that creates a HashSet of 5 random numbers between 1 to 10.
		HashSet<Integer> nums = new HashSet<Integer>();

		while (nums.size() < 5) { // Size of the HashSet changes depends on the number of elements it has. In
									// addition it cannot contain a duplicate element. Therefore the .size can be
									// used as a condition to check if there are 5 unique random numbers in the
									// HashSet.
			nums.add((int) (Math.random() * 10 + 1));
		}
		System.out.println(nums);
	}
}