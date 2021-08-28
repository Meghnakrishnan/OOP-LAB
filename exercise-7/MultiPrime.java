/*
1.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. Implement using threads. (Thread class)
*/

import java.util.Scanner;
//thread class
class MultiplicationThread extends Thread {
	
	public void run(){
		try{
			Scanner in = new Scanner(System.in);
			System.out.print("enter limits : ");
			int l = in.nextInt();
			for(int i=1;i<=l;i++){
				System.out.println(i+" * 5 = "+(i*5));
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
					System.out.println("prime : "+num);
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
		MultiplicationThread Thread1 = new MultiplicationThread(); 
  		PrimeThread Thread2 = new PrimeThread();
		//threads started
		Thread1.start();
		Thread2.start();
		
	}


}

/* output

C:\Users\SNJ\Desktop\OOP\exercise-7>java MultiPrime
enter limits : enter limits : 10
10
prime : 2
1 * 5 = 5
prime : 3
2 * 5 = 10
3 * 5 = 15
prime : 5
4 * 5 = 20
5 * 5 = 25
prime : 7
6 * 5 = 30
7 * 5 = 35
8 * 5 = 40
9 * 5 = 45
prime : 11
10 * 5 = 50
prime : 13
prime : 17
prime : 19
prime : 23
prime : 29

*/
