package Arithmetic;					//package Arithmetic
interface S{						//interface S
	public int sub();
}
public class Subtraction implements S{			//class Subtraction implements S
	int first;
	int second;
	public Subtraction(int a,int b) {
		first = a;
		second = b;
		}
	public int sub() {				//method for subtraction

	return (first-second);
	}
}