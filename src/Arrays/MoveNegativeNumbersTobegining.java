package Arrays;

import java.util.Arrays;

public class MoveNegativeNumbersTobegining {

	public static void main(String[] args) {
		int arr[]= {-1,-3,3,5,-5};
		int newArr[]=new int[arr.length];
		int j=0;
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]<0)
			{
				newArr[j]=arr[i];
				j++;
			}
			
		}
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]>0)
			{
				newArr[j]=arr[i];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(newArr));

	}

}
