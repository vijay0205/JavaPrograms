package Arrays;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 1, 2, 3, 4, 5 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

//	Approach 2
		int temp;

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
//Approach 3 using stack
		int[] arr3 = { 1, 2, 3, 4, 6 };

		Stack stack = new Stack();

		for (int i = 0; i < arr3.length; i++) {
			stack.push(arr3[i]);
//	System.out.println(stack);
		}
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (int) stack.pop();
		}
		System.out.println(Arrays.toString(arr3));
	}
}