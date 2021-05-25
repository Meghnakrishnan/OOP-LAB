/*
1. Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price.
*/

import java.util.Scanner;

class Productt{
int pcode;
String pname;
float price;

Productt(int c,String n,float p){							//CONSTRUCTOR
		pcode = c;
		pname = n;
		price = p;
	        }

public static void main(String [] args){
Scanner sc=new Scanner(System.in);

System.out.println("-----Details of first product-----");
System.out.println("product code:");
int c1=sc.nextInt();
System.out.println("product name:");	
String n1=sc.next();	
System.out.println("product price:");	
float p1=sc.nextFloat();
Productt pd1=new Productt(c1,n1,p1); 							//CREATE OBJECT 1

System.out.println("-----Details of second product-----");
System.out.println("product code:");
int c2=sc.nextInt();
System.out.println("product name:");	
String n2=sc.next();	
System.out.println("product price:");	
float p2=sc.nextFloat();
Productt pd2=new Productt(c2,n2,p2);							//OBJECT 2
                                            	
System.out.println("-----Details of third product-----");
System.out.println("product code:");
int c3=sc.nextInt();
System.out.println("product name:");	
String n3=sc.next();	
System.out.println("product price:");	
float p3=sc.nextFloat();
Productt pd3=new Productt(c3,n3,p3); 							//OBJECT 3

System.out.println("-------product having lowest price------- ");

		
if(pd1.price<=pd2.price && pd1.price<=pd3.price){					//CHECK FOR LOWEST PRICE				
System.out.println(pd1.pname +":"+ pd1.price);			
} else if(pd2.price<=pd1.price && pd2.price<=pd3.price){	        
System.out.println(pd2.pname +":" +pd2.price);			
} else {		
System.out.println(pd3.pname +":" + pd3.price);
}        		
}	
}

/*
OUTPUT

-----Details of first product-----
product code:
1
product name:
book
product price:
60
-----Details of second product-----
product code:
2
product name:
pen
product price:
10
-----Details of third product-----
product code:
3
product name:
pencil
product price:
5
-------product having lowest price-------
5.0
pencil

*/