/*
2. Find the area of different shapes using overloaded functions


*/


class Shape{								//CLASS Shape HAVING DIFFERENT METHODS OF SAME NAME 
void area(double a){							//METHOD area WITH A PARAMETER
	 System.out.println("Area of square of side 4 is : " + (a*a));	//CALCULATE AREA OF SQUARE
}
void area(double a,double b,double h){
	 double r = ((a+b)/2)*h	;					//METHOD area WITH TWO  PARAMETER
	 System.out.println("Area of trapezium having base 3,5 and height 4 is : " + r );    //CALCULATE AREA OF trapezium

}
void area(float a,float b){							//CALCULATE AREA OF TRIANGLE
	double z=(a*b)/2;
	System.out.println("Area of triangle having base 3 and height 5 is : "+z );
	
}
}
class Overld{
public static void main(String[] args){
Shape ob1=new Shape();				//OBJECT OF CLASS Shape
//METHOD INVOKATION PASSING ARGUMENT
ob1.area(4);					
ob1.area(3,5,4);
ob1.area(3,5);
}
}

/* OUTPUT
Area of square of side 4 is : 16.0
Area of trapezium having base 3,5 and height 4 is : 16.0
Area of triangle having base 3 and height 5 is : 7.5
*/