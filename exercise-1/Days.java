/* Write a Java program to find the number of days in a month for a given year.
Check Leap year */

import java.util.Scanner;
class Days{
public static void main(String args[])
{
  Scanner sc=new Scanner (System.in ) ;
  System.out.print("enter any month from 1 to 12: "); //enter any month
  int month=sc.nextInt(); // store in month
  System.out.print("Enter any year: ");
  int year = sc.nextInt();

  //to check whether the given mont is 1,3,5,7,8,9,12 or not
  if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
  {
   //print the statement while if condition is true
   System.out.print("Number of days is 31");
  }
  else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0))) //check whether the month is 2 and year is leap year
  {
   System.out.print("Number of days is 29");
  }
  else if(month == 2) //check for month 2
  {
   System.out.print("Number of days is 28");
  }
  else               //print statement while month is 4,6,10,11
  {
   System.out.println("Number of days is 30");
  }
}
}

/* output
enter any month from 1 to 12: 2
Enter any year: 2020
Number of days is 29

enter any month from 1 to 12: 2
Enter any year: 2021
Number of days is 28

enter any month from 1 to 12: 7
Enter any year: 2020
Number of days is 31

enter any month from 1 to 12: 4
Enter any year: 2021
Number of days is 30
*/