/* 
LINEAR SEARCH
*/

import java.util.Scanner;
class Linear{
public static void linearSearch(int a[],int n){
int i;
for(i=0;i<a.length;i++){
if(a[i]==n){
System.out.println(n +" found at location " +i);
}
}
}

public static void main(String[] args){
int a[]={4,7,8,9};
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Array elements are:");
for(i=0;i<a.length;i++){
System.out.print(" "+a[i]);
}
System.out.println();
System.out.println("Enter a number to search:");
int n=sc.nextInt();
Linear ob=new Linear();
ob.linearSearch(a,n);
}
}

/*OUTPUT
Array elements are:
 4 7 8 9
Enter a number to search:
7
7 found at location 1
*/






