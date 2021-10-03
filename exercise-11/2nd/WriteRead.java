/*
2. Write a program to write to a file, then read from the file and
display the contents on the console.
*/


import java.io.*;
import java.util.Scanner;

class WriteRead {
public static void main(String args[]) throws IOException {							//throw exception for reading elements from file

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\nenter the name of file you want to add elements: ");				//enter the file name 	
	String name=sc.nextLine();
	
	String source = "apple\n" + "orange\n" + "grapes";					//contents to add

	byte buf[] = source.getBytes();										//write to file

	
	FileOutputStream f2 = null;

	try {
		
		f2 = new FileOutputStream(name);

		
		// write file
		f2.write(buf);

		} catch(IOException e) {
			System.out.println("An I/O Error Occured");

		} 
		finally 
		{
			
			try 
			{
				if(f2 != null) 
					f2.close();
			} 
			catch(IOException e) 
			{
				System.out.println("Error Closing 2a.txt");
			}
		}








														//to read data from enterd file

	int i;
	FileInputStream fin;
	try {
		fin = new FileInputStream(name);

	} catch(FileNotFoundException e) {

	System.out.println("File Not Found");
		return;

	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Usage: ShowFile File");
	return;

	}

	System.out.println("\n\n*************contents of file******************\n");													// read characters until EOF is encountered
	do {

		i = fin.read();
		if(i != -1)

		System.out.print((char) i);

	} while(i != -1);
	fin.close();


}
}


/*
output
------------------------------------------------

enter the name of file you want to add elements:
2a.txt


*************contents of file******************

apple
orange
grapes
*/
