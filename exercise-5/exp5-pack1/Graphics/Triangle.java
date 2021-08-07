package Graphics;					//package Graphics
interface T{						//interface T
	public void area();
}
public class Triangle implements T {			//class  Triangle implements T
	int height;
	int base;
	public Triangle(int h,int b) {
		height=h;
		base=b;
		}
	public void area() {				//method for finding area
	double a =(height*base)*1/2;
	System.out.println("Area of Triangle is:"+a);
	}
}
