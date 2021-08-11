/*Find the average of N positive integers, raising a user defined exception for each negative input.*/

import java.util.Scanner;
import java.util.*;
class AverageException extends Exception
{
	AverageException(String str)
	{
		super(str);
	}
}
class Average{
public static void main (String args[]){
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the limit :");							//ENTER NO: OF INTEGERS
int num=sc.nextInt();									//STORE IN 'num'
int[] arr=new int[num];									//ARRAY DECLARATION OF SIZE 'num'
int i=0;
while(i<num)										//LOOP EXECUTE ONLY WHEN CONDITION IS TRUE
{
	
	int number=sc.nextInt();
		try{
			if(number<0)
			{
				throw new AverageException("negative input");
			}
			else
			{
				arr[i]=number;
				i=i+1;
			}
		     }
		catch(Exception e)
	            {
			System.out.println("negative numbers are not allowed .please enter a new number");
			continue;
		    }
}
for(i=0;i<num;i++)
{
	sum=sum+arr[i];
}
int avg=sum/num;
System.out.println("Average of "+num+" positive numbers :"+avg);
}
}


/* output

Enter the limit :2
8
-5
negative numbers are not allowed .please enter a new number
5
Average of 2 positive numbers :6

*/
//Verified
				
