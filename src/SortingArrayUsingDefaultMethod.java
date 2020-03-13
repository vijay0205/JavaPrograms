

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayUsingDefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 3, 5, 7, 2 };

		System.out.println("Array Before Sorting " + Arrays.toString(array));

//		Approach 1
		Arrays.parallelSort(array);

		System.out.println("Array After Sorting " + Arrays.toString(array));

//		Approach 2

		int[] array1 = { 1, 3, 5, 909, 7, 2 };

		System.out.println("Array Before Sorting " + Arrays.toString(array1));

		Arrays.sort(array1);

		System.out.println("Array After Sorting " + Arrays.toString(array1));
		
//		Sort in descending order
		
		Integer[] array2 = { 1, 3, 5, 909, 7, 2 };

		System.out.println("Array Before Sorting " + Arrays.toString(array2));

		Arrays.sort(array2,Collections.reverseOrder());

		System.out.println("Array After Sorting " + Arrays.toString(array2));
		

	}

}
