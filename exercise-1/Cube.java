//Write a program in Java to display the cube of the number upto given an integer.


import java.util.Scanner ;
class Cube{
public static void main(String args[])
{
Scanner sc= new Scanner (System.in ) ;
System.out.println("Enter the number:");
int num = sc.nextInt() ;
int cube=num*num*num;
System.out.println("cube of the number is:"+cube);
}
}

/* output
Enter the number:
3
cube of the number is:27

*/
