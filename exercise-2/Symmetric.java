/*3. Read a matrix from the console and check whether it is symmetric or  not */

import java.util.Scanner;
class Symmetric{
    public static void main(String[] args){
       int i,j;							//VARIABLE DECLARATION
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of matrix:");         //INPUT SIZE
       int m=sc.nextInt();					//READ IN 'm'
       int[][] matrixA=new int[m][m];				//ARRAY DECLARATION
       
       System.out.println("Enter the elements:");		//INPUT MATRIX ELEMENTS
       for(i=0;i<m;i++){
           for(j=0;j<m;j++){
               matrixA[i][j]=sc.nextInt();
            }
        }
       
       System.out.println("Matrix is:");			//DISPLAY MATRIX
       for(i=0;i<m;i++){
            for(j=0;j<m;j++){
               System.out.print(matrixA[i][j] + "\t");
             }
            System.out.println();
        }
        System.out.println("Transpose of matrix is:");		//DISPLAY TRANSPOSE OF MATRIX
        for(i=0;i<m;i++){
           for(j=0;j<m;j++){
              System.out.print(matrixA[j][i] +"\t");
            }
            System.out.println();
        }
           
        for(i=0;i<m;i++){					//CHECK WHETHER THE GIVEN MATRIX IS SYMMETRIC OR NOT
           for(j=0;j<m;j++){             
              if(matrixA[i][j] != matrixA[j][i]){
                 System.out.println("Not a symmetric matrix");
                 return;
               }     
          
            }
        
         }
        System.out.println("Given matrix is symmetric");
}
}

/* OUTPUT

Enter the size of matrix:
3
Enter the elements:
1
2
3
4
5
6
7
8
9
Matrix is:
1       2       3
4       5       6
7       8       9
Transpose of matrix is:
1       4       7
2       5       8
3       6       9
Not a symmetric matrix

======================================

Enter the size of matrix:
3
Enter the elements:
5
6
7
6
9
8
7
8
4
Matrix is:
5       6       7
6       9       8
7       8       4
Transpose of matrix is:
5       6       7
6       9       8
7       8       4
Given matrix is symmetric

*/



       



