package Arithmetic;					//package Arthmatic
interface D{						//interface D
	public double div();
}
public class Division implements D{			//class Division implements D
	int first;
	int second;
	public Division(int a,int b) {
		first = a;
		second = b;
		}
	public double div() {				//method for finding division

	return (first/second);
	}
}