// simple binary search

import java.util.Arrays;
import java.util.Scanner;
public class Binary{
	public static int binarySearch(int a[],int low,int high,int k){		//method to binarysearch
		int mid=(low+high)/2;						//find middle of array
                while(low<=high){						//loop execute only when 'low' <= 'high'
                	if(a[mid]<k){						//check whether middle element is < key
                        	low=mid+1;					//then set new low
				
                        }else if(a[mid]>k){
				high=mid-1;
                                
			}else{							//return mid while key and middle element is same
				return mid;
			}
			mid=(low+high)/2;					//new mid
                 }
                 return -1;							//not found 
          }

	public static int binarySearchRecursion(int a[],int low,int high,int k){	//method of recursive binary search
		if(low<=high){
			int mid=low+(high-low)/2;					//find mid
                        if(a[mid]<k){
				low=mid+1;
				return binarySearchRecursion(a,mid+1,high,k);		//call itself
			}
			else if(a[mid]>k){
				high=mid-1;
				return binarySearchRecursion(a,low,mid-1,k);
			}
			else{
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		System.out.println("Enter your choice: ");
                System.out.println("1.Simple binary search ");
                System.out.println("2.Recursive binary search");
                System.out.println("3.using Array.binary search() ");
                Scanner sc=new Scanner(System.in);
                int choice=sc.nextInt();
                System.out.println("enter number of elements in the array: ");
                int n=sc.nextInt();
                int arr[]=new int[n];							//array declaration
                System.out.println("array elements:");					//assigning array elements
                for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);							//sorting array
		System.out.println("Sorted array:");
                for(int i=0;i<n;i++){							//display sorted array
                	System.out.print(" "+arr[i]);
		}
                System.out.println();
		System.out.println("Enter the key to search: ");
                int key=sc.nextInt();
		int found=-1;								//set found as -1
                switch(choice){
			case 1:found=binarySearch(arr,0,n,key);
				break;
			case 2:found=binarySearchRecursion(arr,0,n,key);
				break;
			case 3:found=Arrays.binarySearch(arr,key);
                                break;
		}
		if(found>=0){
			System.out.println(key + " is present at location "+found);
		}else{
			System.out.println(key+" not found");
		}
	}
}


/* OUTPUT

Enter your choice:
1.Simple binary search
2.Recursive binary search
3.using Array.binary search()
1
enter number of elements in the array:
4
array elements:
6
8
1
3
Sorted array:
 1 3 6 8
Enter the key to search:
3
3 is present at location 1



Enter your choice:
1.Simple binary search
2.Recursive binary search
3.using Array.binary search()
2
enter number of elements in the array:
5
array elements:
5
9
1
8
4
Sorted array:
 1 4 5 8 9
Enter the key to search:
8
8 is present at location 3



Enter your choice:
1.Simple binary search
2.Recursive binary search
3.using Array.binary search()
3
enter number of elements in the array:
3
array elements:
8
9
2
Sorted array:
 2 8 9
Enter the key to search:
7
7 not found


*/
			

                

