//Write a program in Java to display the cube of the number upto given an integer.


import java .util.Scanner ;
class Cube{
public static void main(String args[])
{
int i,num;                                  //variable declaration
Scanner sc= new Scanner (System.in ) ;
System.out.println("Enter the number:");     //enter number
num = sc.nextInt() ;			     //stored in 'num'
//calculate the cube of number upto given limit
for(i=1; i<=num; i++)
{
  System.out.println(Math.pow(i,3));
}
}
}

/* output
Enter the number:
4
1.0
8.0
27.0
64.0

*/