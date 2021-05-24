/*2. Read 2 matrices from the console and perform matrix addition.*/

import java.util.Scanner;
class Addition{
	
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number of Rows:");					//INPUT NUMBER OF ROWS
		int m = sc.nextInt();
		System.out.print("Enter the number of Columns:");				//INPUT NUMBER OF COLUMNS
		int n = sc.nextInt();
		int[][] matA = new int[m][n];							//MATRIX DECLARATION
		int[][] matB = new int[m][n];
		int[][] matC = new int[m][n];
		
		System.out.println("Enter the  elements of first matrix: ");			//INPUT ELEMENTS FOR FIRST MATRIX
		
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				matA[i][j] = sc.nextInt();
			
			}
		}
                System.out.println("First Matrix: ");								//DISPLAY FIRST MATRIX
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print(matA[i][j]+ "\t");
			}
			System.out.println();
		}
                System.out.println();
		

		System.out.println("Enter the elements of second matrix: ");

		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				matB[i][j] = sc.nextInt();
			}
		}
                
                System.out.println("Second Matrix: ");								//DISPLAY SECOND MATRIX
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print(matB[i][j]+ "\t");
			}
			System.out.println();
		}
                System.out.println();
		
		
		
		for(int i=0; i<m;i++){										//ADDITION OF 2 MATRICES
			for(int j=0; j<n; j++){
				matC[i][j] = matA[i][j] + matB[i][j];
			
			}
		}
		
		
		System.out.println("Result Matrix: ");								//DISPLAY NEW MATRIX
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print(matC[i][j]+ "\t");
			}
			System.out.println();
		}
	
	}
}


/*
OUTPUT

Enter the number of Rows:2
Enter the number of Columns:3
Enter the  elements of first matrix:
5
7
9
4
2
1
First Matrix:
5       7       9
4       2       1

Enter the elements of second matrix:
8
6
4
5
2
3
Second Matrix:
8       6       4
5       2       3

Result Matrix:
13      13      13
9       4       4


*/
