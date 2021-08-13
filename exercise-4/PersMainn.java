/*
Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor.Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data
members. Use array of objects to display details of N teachers.
*/


import java.util.Scanner;
class Person{												
	String Name;											//DATA EMBER DECLARATION
        String Gender;
	String Address;
	int Age;
	Person(String Name,String Gender,String Address,int Age){					//CONSTRUCTOR OF SUPER CLASS "Person"
		this.Name=Name;
		this.Gender=Gender;
		this.Address=Address;
		this.Age=Age;
}
void show(){												//METHOD FOR DISPLAY DATA MEMBERS OF "Person"
	System.out.println("\n================================================");
        System.out.println("Name          :"+Name);
	System.out.println("Gender        :"+Gender);
	System.out.println("Address       :"+Address);
	System.out.println("Age           :"+Age);

}

}
class Employee extends Person{										//EXTENDED CLASS FROM "Person"
	int Empid;
	String Company_name;
	String Qualification;
	double Salary;
	Employee(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,double Salary){
		super(Name,Gender,Address,Age);								//CALL SUPER CLASS CONSTRUCTOR
		this.Empid=Empid;
		this.Company_name=Company_name;
		this.Qualification=Qualification;
		this.Salary=Salary;
	}
void printt(){												//METHOD FOR DISPLAY
	super.show();											//CALL SUPER CLASS METHOD
	System.out.println();
	System.out.println("Empid         :"+Empid);
	System.out.println("Company_name  :"+Company_name);
	System.out.println("Qualification :"+Qualification);
	System.out.println("Salary        :"+Salary);
}
}
class Teacher extends Employee{										//CLASS DERRIVED FROM "Employee"
	int Teacherid;
	String Subject,Department;
	
	Teacher(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,double Salary,int Teacherid,String Department,String Subject){
		super(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary);
		this.Subject=Subject;
		this.Department=Department;
		this.Teacherid=Teacherid;
	}

void display(){												//METHOD DISPLAY
	
	super.printt();
	System.out.println();
	System.out.println("Teacher id    :"+Teacherid);
	System.out.println("Department    :"+Department);
	System.out.println("Subject       :"+Subject);
}
}

public class PersMainn{
public static void main(String[] args){
int n,i,eid,tid,age;											//VARIABLE DECLARATION
double sal;
String nam,gen,add,cnam,qua,dep,sub;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of teachers : ");							//TO ENTER NUMBER OF TEACHERS
n=sc.nextInt();												
Teacher a[]=new Teacher[n];										//ARRAY OBJECT FOR CLASS Teacher WITH SIZE n
for(i=0;i<n;i++){											//DATA ENTRY FOR EACH TEACHER
	System.out.println("================================================");
	System.out.println("Enter Name            : ");
	nam=sc.next();
	System.out.println("Enter Gender          : ");
	gen=sc.next();
	System.out.println("Enter Address         : ");
	add=sc.next();
	System.out.println("Enter Age             : ");
	age=sc.nextInt();
	System.out.println();
	System.out.println("Enter Empid           : ");
	eid=sc.nextInt();
	System.out.println("Enter Company_name    : ");
	cnam=sc.next();
	System.out.println("Enter Qualfication    : ");
	qua=sc.next();
	System.out.println("Enter Salary          : ");
	sal=sc.nextDouble();
	System.out.println();
	System.out.println("Enter Teacher id      : ");
	tid=sc.nextInt();
	System.out.println("Enter Department      : ");
	dep=sc.next();
	System.out.println("Enter Subject         : ");
	sub=sc.next();
	
        
        a[i]=new Teacher(nam,gen,add,age,eid,cnam,qua,sal,tid,dep,sub);	
}
System.out.println("\nDETAILS OF "+n+" TEACHERS");
for(i=0;i<n;i++){												//FOR DISPLAY DETAILS OF ARRAY BY CALLING dislay()
	
	a[i].display();
}
}
} 



/*
OUTPUT

Enter number of teachers :
2
================================================
Enter Name            :
Jeena
Enter Gender          :
Female
Enter Address         :
fgh
Enter Age             :
43

Enter Empid           :
101
Enter Company_name    :
fds
Enter Qualfication    :
MCA
Enter Salary          :
43000

Enter Teacher id      :
201
Enter Department      :
MCA
Enter Subject         :
ADS
================================================
Enter Name            :
Anoop
Enter Gender          :
Male
Enter Address         :
sdf
Enter Age             :
42

Enter Empid           :
204
Enter Company_name    :
jkl
Enter Qualfication    :
MBA
Enter Salary          :
42000

Enter Teacher id      :
107
Enter Department      :
MBA
Enter Subject         :
ACC

DETAILS OF 2 TEACHERS

================================================
Name          :Jeena
Gender        :Female
Address       :fgh
Age           :43

Empid         :101
Company_name  :fds
Qualification :MCA
Salary        :43000.0

Teacher id    :201
Department    :MCA
Subject       :ADS

================================================
Name          :Anoop
Gender        :Male
Address       :sdf
Age           :42

Empid         :204
Company_name  :jkl
Qualification :MBA
Salary        :42000.0

Teacher id    :107
Department    :MBA
Subject       :ACC

*/

//Verified

        
