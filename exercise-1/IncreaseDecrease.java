/* Write a program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise. */

import java.util.Scanner;
class IncreaseDecrease{
public static void main(String args[])
{
  Scanner sc=new Scanner (System.in ) ;
  System.out.println("enter first number:"); //enter first number
  int num1 = sc.nextInt() ;		   //read in num1
  System.out.println("enter second number:");
  int num2 = sc.nextInt() ;
  System.out.println("enter thired number:");
  int num3 = sc.nextInt() ;
  if(num1<num2 && num2<num3)		  //check for increasing order
  {
   System.out.println("Numbers are in increasing order"); //print the statement while if condition is true
  }
  else if(num1>num2 && num2>num3)
  {
   System.out.println("Numbers are in decreasing order");
  }
  else
  {
   System.out.println("Neither increasing or decreasing order");
  }
}
}

/*output

enter first number:
7
enter second number:
5
enter thired number:
9
Neither increasing or decreasing order

*/
