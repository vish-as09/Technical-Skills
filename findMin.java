import java.util.Scanner;

public class findMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter length : ");
		int n = sc.nextInt();
		int [] a = new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.print("\n Enter elements : ");
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int sum=0;
		int sec=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		for(int i=0; i<a.length;i++) {
			if(a[i]<max) {
				sum=max-a[i];
				sec+=sum;
				sum=0;
			}
		}
		System.out.print("\n Minimum Time : "+sec);

	}

}
