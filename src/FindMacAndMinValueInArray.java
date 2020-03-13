

public class FindMacAndMinValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find max number
		int array[] = { 10, 20, 90, 60, 40 };
		int max = array[0];

		System.out.println("Array Length is " + array.length);

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Max number in array is " + max);

//Find minimum number

		int arrayMin[] = { 10, 20, 39, 02, 29 };
		int min = arrayMin[0];
		for (int i = 1; i < array.length; i++) {
			if (arrayMin[i] < min)
				min = arrayMin[i];

		}
		System.out.println("min number in array is " + min);

	}

}
