//Write a user defined exception class to authenticate the user name and password

import java.util.Scanner;
							
class UnameException extends Exception						//UnameException class
{
  public UnameException(String msg)
  {
    super(msg);
  }
}

class PwdException extends Exception						//PwdException class
{
 public PwdException(String msg)
  {
    super(msg);
  }
}



class Login									//main class
{
  public static void main(String args[])
  {
     Scanner sn=new Scanner(System.in);
     String uname,pwd;
         
   try
    {
	System.out.print("Enter new  username:");				
     	uname=sn.nextLine();							//store username in 'uname'
     	System.out.print("Enter new password:");
     	pwd=sn.nextLine();							//store password in 'pwd'	
	int len=uname.length();							//store length of 'uname' in 'len'
     if(len<6)									
        throw new UnameException("Username must contain minimum 6 characters");	//statemant executes when if condition is true
     else{
	  System.out.print("LOGIN\n*******");
          String username,password;
   	  System.out.print("\nEnter username:");
   	  username=sn.nextLine();
   	  System.out.print("Enter password:");
   	  password=sn.nextLine();

    	  if(pwd.equals(password) && uname.equals(username))			
		System.out.println("Successfully login!");			//statemant execute only when both are true	
     	  else 
		throw new PwdException("Incorrect password! Try again!!");
	 
        	
  	}
    }
    catch (UnameException e)
    {
       System.out.println(e);
    }
    catch (PwdException e)
    {
       System.out.println(e);
    }
   
     finally{
            System.out.println("The finally statement is executed");
       }  

   }
}

/* OUTPUT

C:\Users\SNJ\Desktop\OOP\exercise-6>java Login
Enter new  username:meghna
Enter new password:43567
LOGIN
*******
Enter username:meghna
Enter password:4359
PwdException: Incorrect password! Try again!!
The finally statement is executed


C:\Users\SNJ\Desktop\OOP\exercise-6>java Login
Enter new  username:megha
Enter new password:43567
UnameException: Username must contain minimum 6 characters
The finally statement is executed


C:\Users\SNJ\Desktop\OOP\exercise-6>java Login
Enter new  username:meghna
Enter new password:43567
LOGIN
*******
Enter username:meghna
Enter password:43567
Successfully login!
The finally statement is executed

*/
//Verified
