package Graphics;
interface R{
	public void area();
}
public class Rectangle implements R {
	int height;
	int width;
	public Rectangle(int h,int w) {
		height=h;
		width=w;
		}
	public void area() {

	System.out.println("Area of Rectangle is:"+(height*width));
	}
}
