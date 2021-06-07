/*
1. Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price.
*/
import java.util.Scanner;
 class Productt {
   int pcode;
   String pname;
   float price;
   Productt(int c,String n,float p) {	 //constructor
	pcode = c;
	pname = n;
	price = p;
      }
   public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	  int c1=1;
	  String n1="pen";
	  float p1=5;
	  Productt pd1=new Productt(c1,n1,p1);		//create object for first prodct
	 System.out.println("Enter the product code:");
	 int c2=s.nextInt();
	 System.out.println("Enter the product name:");	
	 String n2=s.next();
	 System.out.println("Enter the product price:");	
	 float p2=s.nextFloat();
	 Productt pd2=new Productt(c2,n2,p2);                                //create object for second product
	 Productt pd3=new Productt(2,"pencil",6);					//create object for third product
	System.out.println("------------------------details of first product---------------------------");	
        
		System.out.println("code : " + pd1.pcode);
		System.out.println("name : " + pd1.pname);
		System.out.println("price : " + pd1.price);
		
	System.out.println("-----------------------details of second product----------------------");
		System.out.println("code : " + pd2.pcode);
		System.out.println("name : " + pd2.pname);
		System.out.println("price : " + pd2.price);
		
	System.out.println("-------------------details of third product----------------");	
		System.out.println("code : " + pd3.pcode);
		System.out.println("name : " + pd3.pname);
		System.out.println("price : " + pd3.price);
		
	System.out.println("---------------lowest priced products------------------------ ");
		float lp= 0;
		
		if(pd1.price<=pd2.price && pd1.price<=pd3.price){	//finding lowest price
			lp=pd1.price;
			
		} else if(pd2.price<=pd1.price && pd2.price<=pd3.price){
			lp=pd2.price;
			
		} else {
			lp=pd3.price;
		}
		
		System.out.println(lp);
		
		if(lp == pd1.price){                         //print all product detail that having lp
		  System.out.println("pcode: "+pd1.pcode);
                  System.out.println("pname :"+pd1.pname);
                   
		}

		if(lp == pd2.price){
                   System.out.println("pcode : "+pd2.pcode);
		   System.out.println("pname : "+pd2.pname);
		}
		
		if(lp == pd3.price){
                   System.out.println("pcode : "+pd3.pcode);
		   System.out.println("pname : "+pd3.pname);
                   
		}		        		
	}	
}



/* OUTPUT
Enter the product code:
4
Enter the product name:
bottle
Enter the product price:
60
------------------------details of first product---------------------------
code : 1
name : pen
price : 5.0
-----------------------details of second product----------------------
code : 4
name : bottle
price : 60.0
-------------------details of third product----------------
code : 2
name : pencil
price : 6.0
---------------lowest priced product------------------------
5.0
pcode: 1
pname :pen
*/