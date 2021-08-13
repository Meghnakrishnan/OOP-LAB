/*2. Prepare bill with the given format using calculate method from
interface.*/



import java.util.*;
interface BillGen{
	int calculate();
	
}
class ProductB implements BillGen{
	String name;
	int prodid ,quantity,unitprice,total;
	ProductB(){}
	ProductB(String n,int p,int q,int u ){
		name = n;
		prodid = p;
		quantity = q;
		unitprice = u;
	}
	public int calculate(){
		total = quantity * unitprice;
		return total;
	}
}

public class Bill{
	public static void main(String[] args){
		ProductB [] [] order;
		System.out.println("enter no of order :");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		order = new ProductB[n][];
		for (int i = 0;  i < n; i++){
			System.out.print("enter no of products :");
			int m = sc.nextInt();
			order[i] =new ProductB[m];
			for(int j = 0; j < m; j++){
				System.out.print("\n\nenter product "+(j+1)+" name: ");
				String a = sc.next();
				System.out.print("enter product id:");
				int b = sc.nextInt();
				System.out.print("enter product quantity:");
				int c = sc.nextInt();
				System.out.print("enter product unit price:");
				int d = sc.nextInt();
				ProductB pb = new ProductB(a,b,c,d);
				order [i][j] = pb;
				order [i][j].total = order[i][j].calculate();
			}
	}
	for(int i = 0; i < n; i++){
		int sum = 0;
		System.out.println("\n\norder no:"+(i+1));
		Date date = java.util.Calendar.getInstance().getTime();
		System.out.println(date);
		System.out.println
		("_______________________________________________________________________________________________________________________");
		System.out.printf("%5s %20s %25s %20s %10s ","prodId","name","Quantity","unit price","total");
		System.out.println();
		System.out.println
		("_______________________________________________________________________________________________________________________");
		for(int j=0;j<order[i].length;j++){
			System.out.printf("%5s %20s %25s %20s %10s",order[i][j].prodid,order[i][j].name,order[i][j].quantity,order[i][j].unitprice,order[i][j].total);
			System.out.println();
		}
		System.out.println
		("_______________________________________________________________________________________________________________________");
		for(int k=0;k<order[i].length;k++)
			sum=sum+order[i][k].total;
		System.out.println("net amount:"+sum);
		System.out.println
		("_______________________________________________________________________________________________________________________");
		}
	}
}
		

/* OUTPUT

enter no of order :
2
enter no of products :3


enter product 1 name: pen
enter product id:1
enter product quantity:2
enter product unit price:10


enter product 2 name: book
enter product id:2
enter product quantity:1
enter product unit price:40


enter product 3 name: box
enter product id:3
enter product quantity:2
enter product unit price:30
enter no of products :1


enter product 1 name: bucket
enter product id:6
enter product quantity:1
enter product unit price:60


order no:1
Thu Aug 05 19:28:50 IST 2021
_______________________________________________________________________________________________________________________
prodId                 name                  Quantity           unit price      total
_______________________________________________________________________________________________________________________
    1                  pen                         2                   10         20
    2                 book                         1                   40         40
    3                  box                         2                   30         60
_______________________________________________________________________________________________________________________
net amount:120
_______________________________________________________________________________________________________________________


order no:2
Thu Aug 05 19:28:50 IST 2021
_______________________________________________________________________________________________________________________
prodId                 name                  Quantity           unit price      total
_______________________________________________________________________________________________________________________
    6               bucket                         1                   60         60
_______________________________________________________________________________________________________________________
net amount:60
_______________________________________________________________________________________________________________________
//Verified
