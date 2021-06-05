/*  
3. Write a menu driven program that would choose either in-built 
method or call a user defined method to sort an array of strings.
*/
import java.util.Arrays;
import java.util.Scanner;
public class Sort{

public static void Sorting(String arr[]){				//USER DEFINED METHOD FOR SORTING
	for(int j=0;j<arr.length;j++){
		for(int i=j+1;i<arr.length;i++){
			if(arr[i].compareToIgnoreCase(arr[j])<0){
				String temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	System.out.println(arr[j]);
	}
        
}


public static void main(String[] args){
int m,choice;
Scanner s=new Scanner(System.in);
System.out.println("enter number of elements:");			//ENTER NUMBER OF ELEMENTS
m=s.nextInt();
String arr[] = new String[m];
System.out.println("enter elements:");					//ENTER ELEMENTS
for(int i=0;i<m;i++){							//ASSIGNING THE ENTERED ELEMENTS IN ARRAY
	arr[i]=s.next();
}

System.out.print("\narray:");						//PRINT ARRAY
for(String i:arr){
      System.out.print(i + " ");
}
										
System.out.println("\n1.user defined method");
System.out.println("2.build in method");
System.out.println("\nEnter your choice to sort an array of strings: ");	//ENNTER YOUR CHOICE OF SORTING

choice=s.nextInt();
switch(choice){
	case 1:Sorting(arr);			//INVOKATION OF METHOD Sorting
	        break;
        case 2:Arrays.sort(arr);		//INVOCATION OF IN BUILT METHOD
		for(String i:arr){		//TO PRINT SORTED ELEMENTS AS ONE BY ONE
		System.out.print(i+"\n");
		}
		break;
	
}
}
}


/* OUTPUT

enter number of elements:
3
enter elements:
hai
beautiful
apple

array:hai beautiful apple
1.user defined method
2.build in method

Enter your choice to sort an array of strings:
1
apple
beautiful
hai

C:\Users\SNJ\Desktop\OOP\exercise-3>java Sort
enter number of elements:
3
enter elements:
Hai
Beautiful
apple

array:Hai Beautiful apple
1.user defined method
2.build in method

Enter your choice to sort an array of strings:
1
apple
Beautiful
Hai

C:\Users\SNJ\Desktop\OOP\exercise-3>java Sort
enter number of elements:
3
enter elements:
hai
beautiful
apple

array:hai beautiful apple
1.user defined method
2.build in method

Enter your choice to sort an array of strings:
2
apple
beautiful
hai

*/





