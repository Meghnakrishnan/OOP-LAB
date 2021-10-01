/*
3. Write a program to copy one file to another.
*/

import java.io.*;
import java.util.*;

class CopyFile {

	public static void main(String args[])throws IOException
	{	
		int i;
		FileInputStream fin;         //creates a file input stream to read from the specified file name
		FileOutputStream fout;       //creates a file output stream to write to the specified file name
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file name to be copied from : ");
		String f1 = sc.nextLine();

		System.out.print("Enter the file name to be copied to : ");
		String f2 = sc.nextLine();

		
		
		// open input file
			

		fin = new FileInputStream(f1);


  		// open output file



		fout = new FileOutputStream(f2);





		// Copy File


		do {
			i = fin.read();
			if(i != -1)
				fout.write(i);
			} while(i != -1);

		System.out.println("The output of "+f2+" :");
		fin = new FileInputStream(f2);
		// read characters until EOF is encountered
		do {

			i = fin.read();
			if(i != -1)
				//read a character with read() and cast the value into a char.
				System.out.print((char) i);

		} while(i != -1);
		fin.close();
		fout.close();
	}

}

/*
Output:
C:\Users\SNJ\Desktop\OOP\exercise-11\3rd>java CopyFile
Enter the file name to be copied from : 3a.txt
Enter the file name to be copied to : 3b
The output of 3b :
hi
hello
hai

*/