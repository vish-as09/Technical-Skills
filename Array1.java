/*Given an array count number of elements having atleast one element greater than itself
	itself.
	OBSRVATION : 
			1. For every max element there wont be any element greater than itself.
	PSEUDO CODE : 
		1. Iterate and find the max element greater than itself.
		2. Iterate and get the no. of elements that are smaller than max.
		3. Increment the counter value.	*/
  //SOURCE CODE 
	public class Array1 {

	public static void main(String[] args) {
		int [] a = {-3,2,6,8,4,8,5};
		int count = 0 ;
		int max = a[0];
		for (int i = 0 ; i < a.length ; i++ ) {
				if (a[i] > max)
					max=a[i];
			}
		for(int i = 0 ; i<a.length ; i++) {
			if(max > a[i])
				count++;
		}
		System.out.print("\n Count : "+count);

	}

}
