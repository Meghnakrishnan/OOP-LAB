/*2. Program to create a class for Employee having attributes eNo, eName eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects.
*/

import java.util.Scanner;
class Employee{
	int eNo;
	String eName;
	int eSalary;
	Employee(int eNo,String eName,int eSalary)
		{
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
		}
	}
class Eno{
public static void main(String args[]){
	int n,emp,sal,search;
	String name;


      	Scanner s = new Scanner(System.in);


	System.out.print("\nEnter number of employee:");                         	//ENTER NUMBER OF EMPLOYEE
         	n = s.nextInt();							//STORE IN 'n'
	System.out.println("======================================");

	Employee a[] = new Employee[n];							//CREATE OBJECT
	for(int i=0;i<n;i++)								//DETAILS OF EMPLOYEE 
	{
	   
	   System.out.print("\nenter the emlpoyee no:");
	   emp = s.nextInt();
	   System.out.print("enter employee name:");
	   name = s.next();	
	   System.out.print("enter the salry of employee:");
	   sal = s.nextInt();
	   System.out.print("-------------------------------------");
            
   	    a[i] = new Employee(emp,name,sal);                                      	//STORE EACH EMPLOYEE DETAILS IN EACH INDEX POSITION OF ARRAY
	}
	
  	System.out.print("\n Enter employee number to search:");            		//ENTER EMPLOYEE NUMBER
         	search = s.nextInt();
  	

	int found=0;	
	for(int i=0;i<n;i++)								//SEARCH WHEATHER GIVEN ENO PRESENT IN THE ARRAY			
	{
	  if(a[i].eNo==search)
	  {
		System.out.print("found employee having Eno "+search);                         	
    		found=1;
		break;
	   }
       	}



	if(found==0)									//NOT FOUND STATEMENT
	  {
		System.out.print("not found"); 
          }


	
    }
}
	  
	




*/
OUTPUT

Enter number of employee:3
======================================

enter the emlpoyee no:1
enter employee name:Ram
enter the salry of employee:10000
-------------------------------------
enter the emlpoyee no:2
enter employee name:Jam
enter the salry of employee:10500
-------------------------------------
enter the emlpoyee no:4
enter employee name:Sam
enter the salry of employee:10600
-------------------------------------
 Enter employee number to search:2
found employee having Eno 2




Enter number of employee:2
======================================

enter the emlpoyee no:6
enter employee name:Reethu
enter the salry of employee:20000
-------------------------------------
enter the emlpoyee no:5
enter employee name:jinu
enter the salry of employee:10700
-------------------------------------
 Enter employee number to search:4
not found


*/	