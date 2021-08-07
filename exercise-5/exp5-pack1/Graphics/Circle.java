package Graphics;
interface C{
	public void area();
}
public class Circle implements C {
	int radius;
	public Circle(int r)
	{
		radius = r;
	}
	public void area() {

	System.out.println("Area of Circle:"+(3.14*radius*radius));
	}
}
