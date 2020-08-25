package Arrays;

import java.util.Arrays;

public class MoveZeroToRight {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 4, 6, 0, 5};
		int[] newArr = new int[arr.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] != 0) {
				newArr[j] = arr[i];
				j++;

			}

		}

		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] == 0) {
				newArr[j] = arr[i];
				j++;

			}

		}
		System.out.println(Arrays.toString(newArr));

	}

}
