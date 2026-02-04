/*given  an array of integer NUMS calculate the pivot index of this array.
  the pivot index is the index where the sum of all the no strictly 
to the left of the index equals to the sum of no strictly to the index of right 

if the index on the left edge of the array then the left sum is 0 because there are
 no elements to the left this also apply to the right edge of the array return the
  left most pivot index if no such index exist return -1.
  
  OBSERVATION:
  	
 */
//SOURCE CODE:

import java.util.Scanner;

public class pivot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for (int i=0;i<a.length-1;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		int total = 0;
		int sum = 0;
		int ans = -1 ;
		for (int i=0 ; i<a.length ; i++) {
			total+=a[i];
		}
		for(int i=0;i<a.length;i++) {
			int temp=(total-a[i])-sum;
			if (sum == temp) {
				ans=i;
				System.out.print("\n Left sum is equals to right sum");
				break;
			}
			sum+=a[i];
		}
		System.out.print("\n Pivot index : "+ans);
	}

}
