package Arrays;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		Integer [] value = {1,25,6,10,23};
		Arrays.sort(value);
		System.out.println("Second largest element in the array is "+ value[value.length-2]);
		System.out.println("Second largest element in the array is "+ value[value.length-1]);
	}

}
