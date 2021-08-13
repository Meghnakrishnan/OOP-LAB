/*4. Create a Graphics package that has classes and interfaces for figures
Rectangle, Triangle, Square and Circle. Test the package by finding the
area of these figures.*/


import Graphics.*;													//import package Graphics
class Area
{
	public static void main(String []args)
	{	System.out.println("---------Area of rectangle having height 3 and width 5--------");
		Rectangle r=new Rectangle(3,5);										//create object for class Rectangle in Graphics
		r.area();												//function call area
		System.out.println("\n\n------------Area of circle having radius 4-------------");
		Circle c = new Circle(4);										//create object for class Circle in Graphics
		c.area();												
		System.out.println("\n\n---------------Area of square having side 6-----------");
		Square s = new Square(6);										//create object for class Square in Graphics
		s.area();
		System.out.println("\n\n---------------Area of triangle having height 3 and base 5----------");
		Triangle t = new Triangle(3,5);										//create object for class Triangle in Graphics
		t.area();												
	}
}


/*
OUTPUT

---------Area of rectangle having height 3 and width 5--------
Area of Rectangle is:15


------------Area of circle having radius 4-------------
Area of Circle:50.24


---------------Area of square having side 6-----------
Area of Square:36


---------------Area of triangle having height 3 and base 5----------
Area of Triangle is:7.0



*/
//Verified
