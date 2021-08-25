/*
1.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)
*/

import java.util.Scanner;
//thread class
class MultiplicationThread extends Thread {
	MultiplicationThread(String name){  //constructor
		super(name);   //for naming thread
	}
	public void run(){
		try{
			Scanner in = new Scanner(System.in);
			System.out.print("enter limits : ");
			int l = in.nextInt();
			for(int i=1;i<=l;i++){
				System.out.println(this+" : "+i+" * 5 = "+(i*5));
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}	

	}
}
//thread class
class PrimeThread extends Thread {
	PrimeThread(String name){     
		super(name);  //for naming thread
	}
	public void run() {
		try{
			Scanner in = new Scanner(System.in);   
			System.out.print("enter limits : ");
			int l = in.nextInt();
			int count = 0,num = 2;
			while(count != l){ 
				boolean flag = true;
				for(int i=2;i<=Math.sqrt(num);i++){
					if(num%i==0){
						flag=false;
						break;
					}
				}
				if(flag){
					count++;
					System.out.println(this+" : "+num);
				}
				num++;
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}


class MultiPrime {
	public static void main(String args[]) {
		//object created
		MultiplicationThread Thread1 = new MultiplicationThread("Thread1"); 
  		PrimeThread Thread2 = new PrimeThread("Thread2");
		//threads started
		Thread1.start();
		Thread2.start();
		
	}


}

/* output

enter limits : enter limits : 10
5
Thread[Thread2,5,main] : 2
Thread[Thread1,5,main] : 1 * 5 = 5
Thread[Thread2,5,main] : 3
Thread[Thread1,5,main] : 2 * 5 = 10
Thread[Thread1,5,main] : 3 * 5 = 15
Thread[Thread2,5,main] : 5
Thread[Thread1,5,main] : 4 * 5 = 20
Thread[Thread1,5,main] : 5 * 5 = 25
Thread[Thread2,5,main] : 7
Thread[Thread1,5,main] : 6 * 5 = 30
Thread[Thread1,5,main] : 7 * 5 = 35
Thread[Thread1,5,main] : 8 * 5 = 40
Thread[Thread1,5,main] : 9 * 5 = 45
Thread[Thread2,5,main] : 11
Thread[Thread1,5,main] : 10 * 5 = 50

*/
Verified
Can enter limits from the main thread.
No need to print the details of thread in output.
Thread name only is enough or can give Prime no:
