package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "Java", "Learning", "is", "is", "Easy", "Java" };
//Approach 1

		boolean status = false;
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Element using approach 1 " + arr[i]);
					status = true;
				}

			}
		}

		if (status == false) {
			System.out.println("No Duplicate elements are found");
		}

//		 Approach 2 using HashSet

		HashSet<String> hset = new HashSet();
		boolean flag = false;
		for (String str : arr) {

			if (hset.add(str) == false) {
				System.out.println("Duplicate Element using approcah 2 " + str);
				flag = true;
			}
		}
		if (flag == false) {

			System.out.println("There are no duplicates");
		}

//		approach 3

		HashSet<String> hset3 = new HashSet();

		for (String str : arr) {
			if (hset3.contains(str)) {
				System.out.println("Duplicate element using approach 3 " + str);
			} else {
				hset3.add(str);
			}
		}
	}

}
