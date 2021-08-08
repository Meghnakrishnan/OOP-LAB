package Arithmetic;					//package Arthmatic
interface M{						//interface M
	public double mul();
}
public class Multiplication implements M{			//class Multiplication implements M
	int first;
	int second;
	public Multiplication(int a,int b) {
		first = a;
		second = b;
		}
	public double mul() {				//method for finding multiplication

	return (first*second);
	}
}