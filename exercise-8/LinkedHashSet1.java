/*
6.Program to demonstrate the creation of Set object using the
LinkedHashset class
*/

import java.util.*;

public class LinkedHashSet1{
	public static void main(String args[]){
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		Iterator<String> itr=set.iterator();
		System.out.println("The elements in the set :");
		while(itr.hasNext()){

		System.out.print(itr.next()+" ");
	
		}
	}
}
/*
Output :
The elements in the set :
A B C D
*/