/*
1. Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.
*/

import java.util.Scanner;
class Employee{							//BASE CLASS EMPLOYEE WITH DATA 4 MEMBERS
	int Empid;
	String Name;
	double Salary;
	String Address;

	Employee(int i,String n,double s,String a){		//CONSTRUCTOR
    		Empid=i;
                Name=n;
                Salary=s;
                Address=a;
		}
        Employee(){}						
}
       

class Teacher extends Employee{					//CLASS Teacher DERRIVED FROM BASE CLASS Employee
	String Department;
        String Subject;

	Teacher(int i,String n,double s,String a,String d,String sub){		//CONSTRUCTOR
		
	        Empid=i;
                Name=n;
                Salary=s;
                Address=a;
	        Department=d;
		Subject=sub;
        }
         void dis() {								//METHOD TO  DISPLAY
		System.out.println("Employee id         =  "+Empid);
		System.out.println("employee name       =  "+Name);
		System.out.println("employee salary     =  "+Salary);
		System.out.println("employee address    =  "+Address);
		System.out.println("employee Department =  "+Department);
		System.out.println("employee Subject    =  "+Subject);
		System.out.println("-----------------------------------\n");
	}

 }

public class Main{
public static void main(String[] args){
int emp;									//VARIBLE DECLARATION
String nam,addr,dep,subj;
Double sal;
Scanner sc=new Scanner(System.in);
System.out.println("How many teachers : ");					//ENTER NUMBER OF TEACHERS
int num=sc.nextInt();								//STORED IN NUM
Teacher a[] = new Teacher[num];							//ARRAY OBJECT OF SIZE num
for(int i=0;i<num;i++){								//ENTER DETAILS
        System.out.println("=============================");
	System.out.println("Enter Employee id   : ");
        emp=sc.nextInt();
	System.out.println("Enter Employee Name : ");
        nam=sc.next();
	System.out.println("Enter Salary        : ");
        sal=sc.nextDouble();
	System.out.println("Enter Address       : ");
        addr=sc.next();
        System.out.println("Enter Department    : ");
        dep=sc.next();
	System.out.println("Enter Subject       : ");
        subj=sc.next();

        a[i]=new Teacher(emp,nam,sal,addr,dep,subj);				
}

System.out.println("\nDETAILS OF "+num+" TEACHERS ");
System.out.println("=============================");
for(int i=0;i<num;i++){
     a[i].dis();						//METHOD INVOCATION USING ARRAY OBJECT
}

}
}

/*  OUTPUT
How many teachers :
2
=============================
Enter Employee id   :
1
Enter Employee Name :
Indira
Enter Salary        :
50000
Enter Address       :
abc
Enter Department    :
MCA
Enter Subject       :
AOS
=============================
Enter Employee id   :
2
Enter Employee Name :
Rajeev
Enter Salary        :
50000
Enter Address       :
gvf
Enter Department    :
MBA
Enter Subject       :
ED

DETAILS OF 2 TEACHERS
=============================
Employee id         =  1
employee name       =  Indira
employee salary     =  50000.0
employee address    =  abc
employee Department =  MCA
employee Subject    =  AOS
-----------------------------------

Employee id         =  2
employee name       =  Rajeev
employee salary     =  50000.0
employee address    =  gvf
employee Department =  MBA
employee Subject    =  ED
-----------------------------------

*/

//Verified
        
