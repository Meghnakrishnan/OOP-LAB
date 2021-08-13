/*
5. Create an Arithmetic package that has classes and interfaces for the
4 basic arithmetic operations. Test the package by implementing all
operations on two given numbers
*/
import Arithmetic.*;				//import package Arithmatic
import java.util.Scanner;												//import package Graphics
class Operations
{
	public static void main(String []args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int n1 = sc.nextInt();
		System.out.println("enter second number:");
		int n2 = sc.nextInt();
		System.out.println("\n***********operations*************");
		Addition a=new Addition(n1,n2);										//create objct for class Addition in Arithmatic
		System.out.println("Addition :"+a.add());								//call method add
		Subtraction su = new Subtraction(n1,n2);								//create objct for class Subtraction in Arithmatic
		System.out.println("Subtraction:"+su.sub());								//call method sub
		Division d = new Division(n1,n2);									//create objct for class Division in Arithmatic
		System.out.println("Division:"+d.div());								//call method div
		Multiplication m=new Multiplication(n1,n2);								//create objct for class AMultiplication in Arithmatic								
		System.out.println("Multiplication:"+m.mul());								//call method mul
		System.out.println("**********************************");										
														
	}
}

/* 
OUTPUT
enter first number:
4
enter second number:
2

***********operations*************
Addition :6
Subtraction:2
Division:2.0
Multiplication:8.0
**********************************
*/
//Verified
