package moreCollections;

import java.util.HashMap;

public class ClassEx2 {
	// Create a HashMap of customer names attached to customer emails.
	// add a few emails and names to the map.
	public static void main(String[] args) {
		
		HashMap<String, String> customers = new HashMap<String, String>();
		
		//customers.put("@", "name");
		customers.put("xxManxx@main.com", "Bob Bar");
		customers.put("HEELLOO@wot.java", "Home Waler");
		customers.put("What@yes.no", "ITS ME");
		customers.put("Hacking@gmail?.???", "Placeholder Name");
		customers.put("ehe@greb.co.stop", "ITS ME");
		
		System.out.println(customers);
		System.out.println();
		customers.put("What@yes.no", "NAAAAAAAAAH");
		
		System.out.println(customers);		
	}
}
