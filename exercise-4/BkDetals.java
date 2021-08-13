/*Write a program has class Publisher, Book, Literature and Fiction. Read the information and print the details of books from either the category, using inheritance.
*/
import java.util.Scanner;
class Publisher {
	String pname;
	int year;
	Publisher(String pname,int year) {
		this.pname=pname;
		this.year=year;
	}
	Publisher(){}
}
class Book extends Publisher {
	String title;
	String author; 
	int price;
	Book(String pname,int year,String title,String author,int price) {
		super(pname,year);
		this.title=title;
		this.author=author;
		this.price=price;
	}
	Book(){}
}
class Fiction extends Book {
	Fiction(){}
	Fiction(String pname,int year,String title,String author,int price){
		super(pname,year,title,author,price);
	}
	void inputData() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the title of the book:");
		title=in.next();
		System.out.println("Enter the name of publisher:");
		pname=in.next();
		System.out.println("Enter the year:");
		year=in.nextInt();
		System.out.println("Enter the name of the Author:");
		author=in.next();
		System.out.println("Enter the price of the book:");
		price=in.nextInt();
		System.out.println();
	}
	void display(){
		System.out.println("FICTION");
		System.out.println("Name of the book:"+title);
		System.out.println("Name of publisher:"+pname);
		System.out.println("Publishing year:"+year);
		System.out.println("Author:"+author);
		System.out.println("Price :"+price);
		System.out.println();
		}
}
class Literature extends Book {
	Literature(){}
	Literature(String pname,int year,String title,String Aname,int price){
		super(pname,year,title,Aname,price);
		}
	void inputData(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the title of the book:");
		title=in.next();
		System.out.println("Enter the name of book publisher:");
		pname=in.next();
		System.out.println("Enter the year of publishing:");
		year=in.nextInt();
		
		System.out.println("Enter the name of the Author:");
		author=in.next();
		System.out.println("Enter the price of the book:");
		price=in.nextInt();
	}
	void display(){
		System.out.println("LITERATURE");
		System.out.println("Name of the book:" +title);
		System.out.println("Name of the publisher:"+pname);
		System.out.println("Publishing year:"+year);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		System.out.println();
		
	}

}
class BkDetals {
	public static void main(String args[]){
		Fiction ficobj=new Fiction();
		Literature litobj=new Literature();
		
		System.out.println("Enter the datails Fiction");
		System.out.println();
		ficobj.inputData();
		System.out.println("Enter the datails Literature");
		System.out.println();
		litobj.inputData();
		System.out.println("\nBOOK DETAILS");
		ficobj.display();
		litobj.display();
		
	}
}

/* OUTPUT

Enter the title of the book:
beloved
Enter the name of publisher:
vintage
Enter the year:
2004
Enter the name of the Author:
Toni
Enter the price of the book:
400

Enter the datails Literature

Enter the title of the book:
Diary
Enter the name of book publisher:
DC
Enter the year of publishing:
2000
Enter the name of the Author:
kumar
Enter the price of the book:
200

BOOK DETAILS
FICTION
Name of the book:beloved
Name of publisher:vintage
Publishing year:2004
Author:Toni
Price :400

LITERATURE
Name of the book:Diary
Name of the publisher:DC
Publishing year:2000
Author:kumar
Price:200

*/