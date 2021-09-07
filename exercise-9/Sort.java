/*
4. Using generic method perform Bubble sort.
*/

import java.util.*;
import java.util.Arrays;

class BubbleSort{
	public static <T> T[] BSMethod(T[] arr,int n){						//generic method for sorting
		String s1,s2;
		for (int i = 0; i < n-1; i++)   						//sorting using bubble sort
        		for (int j = 0; j < n-i-1; j++){
				s1 = arr[j].toString();						//convert to string
				s2 = arr[j+1].toString();
               			if (s1.compareTo(s2)>0)
                		{
                    										// swap arr[j+1] and arr[j]
                    			T temp = arr[j];
                    			arr[j] = arr[j+1];
                    			arr[j+1] = temp;
                		}
			}
		return arr;
	}
}

class Sort{
	public static void main(String args[]){
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		
		String[] s = new String[n];							//create array



		System.out.println("\nEnter elements : ");
		for(int i = 0 ; i < n ; i++)
		{
			s[i] = sc.next();
		}


		BubbleSort b = new BubbleSort();						//craete object for class BubbleSort


		s = b.<String>BSMethod(s,n);							//call generic method of class	
		


		System.out.println("\n_______________\nAfter Sorting\n_______________");

		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("_______________\n");
	}
}

/*
Output
Enter the number of elements : 4

Enter elements :
binu
anu
deepu
chinju

_______________
After Sorting
_______________
anu
binu
chinju
deepu
_______________

*/


/*
Enter the number of elements : 4

Enter elements :
5
2
8
7

_______________
After Sorting
_______________
2
5
7
8
_______________
*/
Verified
