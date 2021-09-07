/*
2.Program to remove all the elements from a linked list
*/

import java.util.*;

class LinkedList1 {
	public static void main(String args[]) {
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();

		// Add elements to the linked list.
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");

		System.out.println("Original contents of ll: " + ll);

		ll.clear();

		System.out.println("Contents of ll after deletion: " + ll);
	}
}

/*
Output :
Original contents of ll: [F, B, D, E, C]
Contents of ll after deletion: []
*/
Verified
