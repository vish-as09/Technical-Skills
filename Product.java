/*given an array of integer a find and return the product array of the
 *   same size where the ith element of the product array will be equal 
 *   to the product of all elements divided by the ith element of the array.
 *PSEUDO CODE:
 *	1. first take product of the array.
 *	2. print product/a[i]
 * */
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter length : ");
		int n = sc.nextInt();
		int [] a = new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		int product=1;
		int var=0;
		for(int i=0;i<a.length;i++)
			product*=a[i];
		for(int i=0;i<a.length;i++) {
			var=product/a[i];
			System.out.print(var+",");
		}

	}

}
