package Graphics;
interface S{
	public void area();
}
public class Square implements S {
	int sides;
	public Square(int s)
	{
		sides = s;
	}
	public void area() {

	System.out.println("Area of Square:"+(sides*sides));
	}
}
