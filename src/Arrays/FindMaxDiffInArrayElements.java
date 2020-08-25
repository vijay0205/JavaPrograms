package Arrays;

import java.util.Arrays;

public class FindMaxDiffInArrayElements {

	public static void main(String[] args) {
//		Max diff between the elements should be the diff between and giggest and smallest element in array
		
		int arr[]= {12,45,8,43,56,899,5};
		
		Arrays.parallelSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int maxDiff=arr[arr.length-1]-arr[0];
		
		System.out.println("Max diff of array element is "+maxDiff);

	}

}
