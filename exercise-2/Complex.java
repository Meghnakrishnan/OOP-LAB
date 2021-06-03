/* Add complex numbers */

import java.util.Scanner;
class Complex{
	int real;
	int img;
	Complex(int r,int i){		//constructor
		real=r;
		img=i;
	}
	Complex sum(Complex c1,Complex c2){		//method to calculate sum of complex 
		Complex c3=new Complex(0,0);		//object c3
		c3.real=c1.real+c2.real;		//add real parts of complex numbers
		c3.img=c1.img+c2.img;			//add imaginary parts of complex number
		return (c3);
	}
	public static void main(String args[])
	{       
		Complex c3;
		int r,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of first complex number");		//enter real and imaginary part of first complex number
		r=sc.nextInt();											//real part assingn in r
		i=sc.nextInt();											//imaginary part assign in i
		Complex c1=new Complex(r,i);									//object c1 for first complex number 
		System.out.println("Enter the real and imaginary part of second complex number");
		r=sc.nextInt();
		i=sc.nextInt();
		Complex c2=new Complex(r,i);
		c3=c1.sum(c1,c2);										//method invoke
		System.out.println("Result = "+c3.real+"+"+c3.img+"i");						//print result
		
	}
}

/*  output
Enter the real and imaginary part of first complex number
3 5
Enter the real and imaginary part of second complex number
6 2
Result = 9+7i
*/

