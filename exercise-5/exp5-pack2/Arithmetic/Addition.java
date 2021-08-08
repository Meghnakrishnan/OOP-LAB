package Arithmetic;					//package Arithmatic
interface A{						//interface A
	public int add();
}
public class Addition implements A{			//class addition implements A
	int first;
	int second;
	public Addition(int a,int b) {
		first = a;
		second = b;
		}
	public int add() {				//method for finding sum

	return (first+second);
	}
}