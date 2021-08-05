/*1. Create an interface having prototypes of functions area() and perimeter(). Create
two classes Circle and Rectangle which implements the above interface. Create a
menu driven program to find area and perimeter of objects.
*/

												//interface having functions area() and perimeter()

import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();
}

												//2 classes circle and Rectangle implements interface AP
class Circle implements AP{									//class Circle having methods area and perimeter
	int r = 0;
 	double pi = 3.14 ,area = 0,perimeter = 0;
	public void input(){
		Scanner c =new Scanner(System.in);
		r = c.nextInt();
	}
	
	public void area(){
		area = pi * r * r;									
		System.out.println("area of circle is: "+area );
	}

	public void perimeter(){
		perimeter = pi * 2 * r;
		System.out.println("perimeter of circle is: "+perimeter );
	}
}


class Rectangle implements AP{									//class Rectangle have methods area and perimeter
	int l=0,b=0;
	double area,perimeter;
	public void input(){
		Scanner sc = new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
	}
	public void area(){
		area = l*b;
		System.out.println("Area of rectangle is: "+area );
	}
	public void perimeter(){
		perimeter = 2*(l+b);
		System.out.println("Perimeter of rectangle is: "+perimeter );
	}

}
												//craete a menu driven program to find area and perimeter of object
public class AreaPerim{
	public static void main(String[] args){
		int ch;
		Circle c = new Circle();							//craete object for Circle						
		Rectangle r = new Rectangle();							//craete object for Rectangle
		Scanner sc = new Scanner(System.in);
		
						
		System.out.println("..........OPTIONS...........");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of rectangle ");
		System.out.println("3.perimeter of circle");
		System.out.println("4.perimeter of rectangle");
		System.out.println("5.invalid");
		System.out.println("______________________________");

		lp : while(true) {
			System.out.print("\n\nenter your choice:");					//enter choice
			ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.print("enter the radius of circle : ");
					c.input();
					c.area();						
					break;
				case 2:
					System.out.print("enter the length and breadth of rectangle :");
					r.input();
					r.area();						
					break;
				case 3:
					System.out.print("enter the radius of circle : ");
					c.input();
					c.perimeter();						
					break;
				case 4:
					System.out.print("enter the length and breadth of rectangle :");
					r.input();
					r.perimeter();						
					break;
				case 5:
					break lp;
				default:
					System.out.print("invalid choice");
			}
		}
	}
}
	
/* OUTPUT

..........OPTIONS...........
1.Area of circle
2.Area of rectangle
3.perimeter of circle
4.perimeter of rectangle
5.invalid
______________________________


enter your choice:1
enter the radius of circle : 4
area of circle is: 50.24


enter your choice:2
enter the length and breadth of rectangle :3
5
Area of rectangle is: 15.0


enter your choice:3
enter the radius of circle : 4
perimeter of circle is: 25.12


enter your choice:4
enter the length and breadth of rectangle :8
3
Perimeter of rectangle is: 22.0


enter your choice:5
*/	


