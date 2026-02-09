import java.util.Scanner;

public class checkIandJEqualstoElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter length : ");
		int n = sc.nextInt();
		System.out.print("\n Enter value: ");
		int target = sc.nextInt();
		boolean found=false;
		int []a= new int [n];
		for (int i=0;i<n;i++) {
				System.out.print("\n enter element : ");
				a[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (a[i]+a[j]==target && a[i]!=a[j]) {
					found=true;
				}
			}
		}
		System.out.print("\n Yes");
	}

}
