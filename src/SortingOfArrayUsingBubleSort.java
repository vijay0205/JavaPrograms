

import java.util.Arrays;

public class SortingOfArrayUsingBubleSort {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 7, 2 };

		System.out.println("Array Before Sorting " + Arrays.toString(array));

		for (int i = 0; i < (array.length) - 1; i++)

		{

			for (int j = 0; j < (array.length) - 1; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
		System.out.println("Array After Sorting " + Arrays.toString(array));

	}

}
