/*
3. Program to create a generic stack and do the Push and Pop
operations.
*/




import java.util.*;
class Stack<T> {									//create a class Stack for push,pop element of a stack
	ArrayList<T> elements;
	Stack(int capacity )
	{
		elements = new ArrayList<T>(capacity);  
	}
	void push( T element)								//to push elements
	{
		elements.add(element);
	}
	T pop()	
	{
		return elements.remove(elements.size()-1);				//to pop last enterd item
	}
}





class GenDemo {										//main
public static void main(String args[]) {
	

	Scanner s=new Scanner(System.in);

	System.out.println("\n_______________________\ninteger stack\n_______________________");
	

  	System.out.println("\nenter size of  stack");
	int n1=s.nextInt();


	Stack<Integer> iob;								//create object for Stack type integer
	iob = new Stack<Integer>(n1);

	

	System.out.println("\nenter elements ");					//to add elements to Stack
	for(int i=0;i<n1;i++)
	{
		int e1=s.nextInt();
		iob.push(e1);
	}



	System.out.println("\nhow much element you want to pop:");
	int m1=s.nextInt();

	
   	for(int j=0;j<m1;j++)
	{
		int p1 = iob.pop();							//to pop elements
		System.out.println("the poped value is: " + p1);	
	}
	




	System.out.println("\n_______________________\nstring stack\n_______________________");
	
 
        System.out.println("\nenter size of  stack");
	int n2=s.nextInt();
	

	Stack<String> sob;								//create obgect for Stack of String
	sob = new Stack<String>(n2);


	
	System.out.println("\nenter elements ");
	for(int i2=0;i2<n2+1;i2++)
	{
		String e2=s.nextLine();							//to  push elements
		sob.push(e2);
	}



	System.out.println("\nhow much element you want to pop:");
	int m2=s.nextInt();

	
   	for(int j2=0;j2<m2;j2++)
	{
		String p2 = sob.pop();							//to pop elements
		System.out.println("the poped value is: " + p2);	
	}
}}




/*
output
------


_______________________
integer stack
_______________________

enter size of  stack
3

enter elements
5
7
8

how much element you want to pop:
2
the poped value is: 8
the poped value is: 7

_______________________
string stack
_______________________

enter size of  stack
4

enter elements
abi
binu
charu
dinu

how much element you want to pop:
2
the poped value is: dinu
the poped value is: charu

*/
Output incomplete
