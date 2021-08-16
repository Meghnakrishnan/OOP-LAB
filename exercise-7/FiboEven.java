/*
2.Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface)
*/

class Fibonacci implements Runnable {				//a class for Fibonacci implements Runneble
    String name;
    Thread thread;
    Fibonacci(String threadName)					//constructure for Fibonacci
    {
        name = threadName; 
        thread = new Thread(this,name);
        thread.start();
    }
    public void run() 							//run method for finding Fibonacci series
    {
         try 
         {
	     
             int x=0;
	     int y=1;
	    
	     while(y<20)
             {
                 System.out.println(x);
		 int z = x+y;
		 x=y;
		 y=z;
		 
                 Thread.sleep(1000);
             }
         }
         catch (InterruptedException e) 
         {
             System.out.println(name + "Interrupted");
         }
    }
}




class Even implements Runnable 					//a class for Even implements Runnable
{
    String name;
    Thread thread;
    Even(String threadName)						//constructure for Even
    {
        name = threadName; 
        thread = new Thread(this,name);
        thread.start();
    }
    public void run() 							//run method for genersting Even numbers
    {
         try 
         {	
	    
             int i =2;
	     while(i<=20)
             {
                 if(i%2==0)
		 {
  		 	System.out.println("even no:"+i);
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



public class FiboEven								//main method
{
    public static void main(String args[]) 
    {
	 System.out.print("---------------------------\nFibonacci series upto 20\nEven numbers upto 20\n---------------------------\n\n");
         new Fibonacci("First thread");
         new Even("second thread");
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


/* output

---------------------------
Fibonacci series upto 20
Even numbers upto 20
---------------------------

0
even no:2
1
even no:4
1
even no:6
2
even no:8
3
even no:10
5
even no:12
8
even no:14
even no:16
even no:18
even no:20
/*
