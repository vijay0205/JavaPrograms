package Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		Integer [] arr= {1,2,4,5,7};
		int sum=0;
		
		for (Integer integer : arr) {
			sum=sum+integer;
			
			
		}
		System.out.println("Sum of elements is "+sum);
	}

}
