/* 1. wap of sum of uppper diagonal elemeents of a matrix
 * 2. wap of sum of lower diagonal elemeents of a matrix
 * 3. wap to find sum of every column of a matrix 
 * 4. wap to find sum of every row of a matrix
 * 5. wap to fin second larget elemeent of the arrray.
 */

import java.util.Scanner;

public class sumOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("\n Enter columns : ");
		int cols = sc.nextInt();
		int [][]a= new int [rows][cols];
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print("\n a["+i+"]["+j+"] : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print("\n");
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		int sum=0;
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				if (i<j)
					sum+=a[i][j];
			}
		}
		sum=0;
		System.out.print("\n Sum of the Upper Diagonal element is : "+sum);
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				if (i>j)
					sum+=a[i][j];
			}
		}
		System.out.print("\n Sum of the Lower Diagonal element is : "+sum);
		sum=0;
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
					sum+=a[j][i];
			}
			System.out.print("\n Sum of the column element is a["+"] : "+sum);
			sum=0;
		}
		sum=0;
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
					sum+=a[i][j];
			}
			System.out.print("\n Sum of the Row element is a["+i+"] : "+sum);
			sum=0;
		}
		int max=a[0][0];
		int smax=a[0][0];
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				if (a[i][j]>max)
					max=a[i][j];
			}
		}
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				if (a[i][j]>smax && a[i][j]<max)
					smax=a[i][j];
			}
		}
		System.out.print("\n Second largest element is : "+smax);
	}

}
