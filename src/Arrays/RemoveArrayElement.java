package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveArrayElement {

	public static void main(String[] args) {
//		approach 1 using collection
		String[] str = { "a", "b", "c" };
		System.out.println(Arrays.toString(str));
		List<String> l1 = new ArrayList(Arrays.asList(str));
		l1.remove(1);
		System.out.println(l1);

//		approach 2 using new array

		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println("Old array with actual size is " + Arrays.toString(arr1));
		int[] newArr = new int[arr1.length - 1];
		int index = 2;
		int k = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (i == index) {
				continue;
			}

			newArr[k] = arr1[i];
			k++;
		

		}
System.out.println("New Array with reduced size is "+ Arrays.toString(newArr));
	}

}
