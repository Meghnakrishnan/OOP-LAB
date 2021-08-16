/*
1.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)
*/

class Multiplication implements Runnable {				//a class for Multilplication implements Runneble
    String name;
    Thread thread;
    Multiplication(String threadName)					//constructure for Multiplication
    {
        name = threadName; 
        thread = new Thread(this,name);
        thread.start();
    }
    public void run() 							//run method for finding multiplication table of 5
    {
         try 
         {
	     
             int i =1;
	     while(i<=10)
             {
                 System.out.println("5 * "+i+" = " +(5*i));
		 i=i+1;
                 Thread.sleep(1000);
             }
         }
         catch (InterruptedException e) 
         {
             System.out.println(name + "Interrupted");
         }
    }
}




class Prime implements Runnable 					//a class for Prime implements Runnable
{
    String name;
    Thread thread;
    Prime(String threadName)						//constructure for Tread
    {
        name = threadName; 
        thread = new Thread(this,name);
        thread.start();
    }
    public void run() 							//run method for genersting prime numbers
    {
         try 
         {	
	    
             int i =2;
	     while(i<=40)
             {
		 int flag=1;
                 for(int j=2;j<i;j++)
		 {
			if(i%j==0)
			{
				flag=0;
				break;
			}
		  }
		  if(flag==1)
		  {
			System.out.println("prime number :"+i);
		  }
		 i=i+1;	
                 Thread.sleep(500);
             }
         }
         catch (InterruptedException e) 
         {
             System.out.println(name + "Interrupted");
         }
    }
}




 
public class MulPrime 								//main method
{
    public static void main(String args[]) 
    {
	 System.out.print("---------------------------\nmultiplication table of 5\nprime numbers upto 40\n---------------------------\n\n");
         new Multiplication("First thread");
         new Prime("second thread");
         try 
         {
             Thread.sleep(10000);
         } 
         catch (InterruptedException e) 
         {
             System.out.println("Main thread Interrupted");
         }
     }
}


/* OUTPUT
--------------------------
multiplication table of 5
prime numbers upto 40
---------------------------

prime number :2
5 * 1 = 5
prime number :3
5 * 2 = 10
prime number :5
5 * 3 = 15
prime number :7
5 * 4 = 20
5 * 5 = 25
prime number :11
5 * 6 = 30
prime number :13
5 * 7 = 35
5 * 8 = 40
prime number :17
5 * 9 = 45
prime number :19
5 * 10 = 50
prime number :23
prime number :29
prime number :31
prime number :37

/*


