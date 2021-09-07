//5.Program to demonstrate the addition and deletion of elements in deque

import java.util.*;

public class Deque1{
	public static void main(String[] args) {
		//Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("A");
		deque.add("B");
		deque.add("C");
		deque.add("D");
		deque.add("E");
		//Traversing elements
		System.out.println("Elements in dequeue : ");
		for (String str : deque) {

			System.out.print(str+" ");

		}
		deque.remove();
		System.out.println("\nAfter first element deleted :");
		for (String str : deque) {

			System.out.print(str+" ");

		}
		deque.clear();
		System.out.println("\nAfter all element deleted :");
		for (String str : deque) {

			System.out.print(str+" ");

		}
	}
}

/*
Output:

Elements in dequeue :
A B C D E
After first element deleted :
B C D E
After all element deleted :
*/
Verified
