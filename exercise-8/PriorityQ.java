/*
4.Program to demonstrate the creation of queue object using the
PriorityQueue class
*/

import java.util.*;

public class PriorityQ{
	public static void main(String args[]){

		PriorityQueue<String> queue=new PriorityQueue<String>();

		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		
		System.out.print("Queue elements : ");
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()){

			System.out.print(itr.next()+" ");

		}
		
	}
}
/*
Output :
Queue elements : A B C D
*/
Verified
