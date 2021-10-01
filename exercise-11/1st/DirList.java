/*
1. Program to list the sub directories and files in a given directory
and also search for a file name.
*/

import java.io.File;
import java.util.Scanner;
class DirList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory name : ");
		String dirname = sc.nextLine();

		//pass the directory name to File object
		File f1 = new File(dirname);
      
		System.out.println("Enter the file name to be searched in "+ dirname +" : ");
		String fname = sc.nextLine();

		//to store the list of files present in the directory.
		File[] list = f1.listFiles();
		
		//if the directory present
		if (f1.isDirectory()) {
			System.out.println("Directory of " + dirname);
			System.out.println("------------------------------------------");
			
			for (int i=0; i < list.length; i++) {
			
				if (list[i].isDirectory()) {
					System.out.println(list[i] + " is a directory");
				} else {
					System.out.println(list[i] + " is a file");
				}
			}
			System.out.println("------------------------------------------");
			int Flag = 0;
			
			//searching for the given file from the directory
			for ( File f2 : list){
				if(fname.equalsIgnoreCase(f2.getName())){
					System.out.println(fname+" Found");
					Flag = 1;
					break;
				}
			} 
			
			//when file not present in directory
			if(Flag == 0) System.out.println(fname+" Not Found");
		} else {
			System.out.println(dirname + " is not a directory");
		}
	}
}

/*
Output:
Enter the directory name :
1aa
Enter the file name to be searched in 1aa :
1b.txt
Directory of 1aa
------------------------------------------
1aa\1a.txt is a file
1aa\1b.txt is a file
------------------------------------------
1b.txt Found
*/