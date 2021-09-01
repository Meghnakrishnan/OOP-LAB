/*1. Program to demonstrate the working of Map interface
by adding, changing and removing elements.*/

import java.util.*;

class HashMapDemo {
public static void main(String args[]) {

														// Create a hash map.
	HashMap<String, Double> hm = new HashMap<String, Double>();

		System.out.println("\n----------------\nname and marks of students\n----------------");												// adding elements to the map
		hm.put("abhilash", 20.0);
		hm.put("banu", 29.0);
		hm.put("chinnu", 24.0);
		hm.put("dileep", 23.0);
		hm.put("elica", 20.0); 

														// Get a set of the entries.
	Set<Map.Entry<String, Double>> set = hm.entrySet();

														// Display the set.
	for(Map.Entry<String, Double> me : set) 
	{
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
	}

	System.out.println();

														// update the mark of banu
	
	hm.put("banu", 35.0);
	System.out.println("after updating banu's mark: " + hm.get("banu"));
	
	
	double mark = hm.get("abhilash");
	hm.put("abhilash", mark+10.0);
	System.out.println("after adding 10 to abhilash's mark : " + hm.get("abhilash"));
	

	System.out.println("\n\nafter remove student elica from class ");
	
	hm.remove("elica");											//remove elica from list
	System.out.println("\n----------------\nNAMES--MARK\n----------------");				
	for(Map.Entry<String, Double> me : set) 
	{
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
	}

	System.out.println();
	
}
}



/*output
----------------
name and marks of students
----------------
elica: 20.0
dileep: 23.0
banu: 29.0
abhilash: 20.0
chinnu: 24.0

after updating banu's mark: 35.0
after adding 10 to abhilash's mark : 30.0


after remove student elica from class

----------------
NAMES--MARK
----------------
dileep: 23.0
banu: 35.0
abhilash: 30.0
chinnu: 24.0


*/