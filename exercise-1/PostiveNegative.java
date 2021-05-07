/*  Write a Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000  */


import java.util.Scanner;
class PostiveNegative{
public static void main(String args[])
{
System.out.println("Enter a number:"); //enter a number
Scanner sc=new Scanner(System.in);
float num=sc.nextFloat(); //stored in 'num'

//check whetherthe number is zero,positive or negative
if(num==0)
{
System.out.println("zero");
}
else if(num>0)
{
System.out.println("postive");
}
else
{
System.out.println("negative");
}
if(Math.abs(num)<1)
{
System.out.println("small"); //print 'small' if the absolute value of number is < 1
}
else if(Math.abs(num)>100000)
{
System.out.println("large"); //print 'large' if the absolute value of number is > 100000
}
}
}

/* output

Enter a number:
-0.66
negative
small

Enter a number:
120000.5
postive
large

Enter a number:
6.2
postive

Enter a number:
-2.1
negative

*/