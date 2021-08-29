
/*
2.Define 2 classes; one for generating Fibonacci numbers and other for displaying 
even numbers in a given range. Implement using threads. (Runnable Interface)
*/

import java.util.Scanner;
//thread class
class Fibonacci implements Runnable{
   	public void run() //run method
   	{	
		//fibonacci=0,1,1,2...
        		int a=0,b=1,i,c=0,limit;               
        		Scanner sn= new Scanner(System.in);
        		System.out.print("Enter limit of Fibonacci series :");
        		limit = sn.nextInt(); 
        		System.out.println("Fibonacci number: "+a);       
        		System.out.println("Fibonacci number: "+b);
  
       		try{	
			//already first 2 digits are declared so,i=2 
           			for(i=2;i<limit;i++)   
            			{    
                   			c=a+b;    
                   			System.out.println("Fibonacci number: "+c);    
                   			a=b;    //change 2nd no to 1st no and 3rd no to second 
                   			b=c;    
                   			Thread.sleep(500); 
             			}    
        
     		}
		catch(InterruptedException e)
     		{
            			System.out.println(e);       
     		}           
    	}          
}

//thread class
class Even implements Runnable{
  	public void run()
  	{
    		int limit,i;
    		Scanner sn = new Scanner(System.in);
    		System.out.print("Enter limit of even numbers : ");
    		limit = sn.nextInt();
  
   		try{
        			for(i=1;i<=limit;i++)
        			{
            				if(i%2==0)
            				{
               					System.out.println("Even number:" +i);
               					Thread.sleep(1000);
            				}
        			}
        
     		}
		catch(InterruptedException e)
     		{
        			System.out.println(e);       
     		} 
 	}          
}

//main class
class FiboEven {
    	public static void main(String args[])
    	{        	
		//object create
      		Fibonacci f= new Fibonacci(); 
      		Even e = new Even(); 
      		//create threads
      		Thread fib = new Thread(f);       
      		Thread eve = new Thread(e);   
                      
      		//start threads 
       		fib.start();  
       		eve.start();                   
    	}
}

/*output
Enter limit of even numbers : Enter limit of Fibonacci series :10
10
Fibonacci number: 0
Even number:2
Fibonacci number: 1
Fibonacci number: 1
Fibonacci number: 2
Even number:4
Fibonacci number: 3
Fibonacci number: 5
Even number:6
Fibonacci number: 8
Fibonacci number: 13
Even number:8
Fibonacci number: 21
Fibonacci number: 34
Even number:10
*/
