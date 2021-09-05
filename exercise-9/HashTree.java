/*2. Program to Convert HashMap to TreeMap
*/
import java.util.*;

class HashTree {
public static void main(String args[]) {

														// Create a hash map.
	HashMap<String, Double> hm = new HashMap<String, Double>();

		System.out.println("\n------------------------\nNAMES--MARK using HashMap\n------------------------");												// adding elements to the map
		hm.put("rani", 30.0);
		hm.put("geetha", 25.0);
		hm.put("minnu", 23.0);
		hm.put("malu", 36.0);
		hm.put("abi", 38.0); 

														// Get a set of the entries.
	Set<Map.Entry<String, Double>> set = hm.entrySet();

														// Display the set.
	for(Map.Entry<String, Double> me : set) 
	{
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
	}

	System.out.println();
					




														//convert hashmap to treemap
	Map<String, Double> treeMap = new TreeMap<>();
	treeMap.putAll(hm);

	
														// Get a set of the entries.
	Set<Map.Entry<String, Double>> set1 = treeMap.entrySet();

	System.out.println("\n------------------------\nNAMES--MARK using TreeMap\n------------------------");														// Display the elements TreeMap
	for(Map.Entry<String, Double> me : set1)
	{
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
	}
	System.out.println();
}}





/*
output

------------------------
NAMES--MARK using HashMap
------------------------
geetha: 25.0
minnu: 23.0
abi: 38.0
malu: 36.0
rani: 30.0


------------------------
NAMES--MARK using TreeMap
------------------------
abi: 38.0
geetha: 25.0
malu: 36.0
minnu: 23.0
rani: 30.0



*/