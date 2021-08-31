/*
3.Program to remove an object from the Stack when the position is passed
as parameter
*/

import java.util.*;

public class Stack1{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in)
;
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
	
		Iterator<String> itr=stack.iterator();

		System.out.print("Content of stack :");
		while(itr.hasNext()){

			System.out.print(itr.next()+" ");

		}
		
		System.out.println("\nEnter position of an object to remove");
		int i=sc.nextInt();
		stack.removeElementAt(i);
	
		itr=stack.iterator();
		System.out.print("Stack after an element removed ");
		while(itr.hasNext()){

			System.out.print(itr.next()+" ");

		}	
	}
}

/*
Output:
Content of stack :A B C D E
Enter position of an object to remove
3
Stack after an element removed A B C E
*/