import java.util.Scanner;

public class MatrixDiagonalSum {

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
		int sum=0;
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				if (i==j)
					sum+=a[i][j];
			}
		}
		System.out.print("\n Sum of the Diagonal elemnt is : "+sum);
	}

}
