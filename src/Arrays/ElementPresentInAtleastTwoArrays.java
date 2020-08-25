package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ElementPresentInAtleastTwoArrays {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3, 4 };
		Integer[] arr2 = { 1, 2, 3, 4, 5, 7 };
		Integer[] arr3 = { 1, 2, 3, 4, 7, 5, 8 };
		List<Integer> al1 = Arrays.asList(arr1);
		List<Integer> al2 = Arrays.asList(arr2);
		List<Integer> al3 = Arrays.asList(arr3);
		HashSet<Integer> hset = new HashSet<>();
//	getting all the unique valies from the arrays

		hset.addAll(al3);
		hset.addAll(al2);
		hset.addAll(al1);
		System.out.println("Unique Values are " +hset);

		List<Integer> finalList = new ArrayList<Integer>();

		for (Integer integer : hset) {
			if (al1.contains(integer) && al2.contains(integer) || al1.contains(integer) && al3.contains(integer)
					|| al3.contains(integer) && al2.contains(integer)) {
				finalList.add(integer);
			}
		}
System.out.println("Final list is " +finalList);
	}

}
