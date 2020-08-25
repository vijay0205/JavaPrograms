package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class PrintMajorityElementInArray {

	public static void main(String[] args) {
		// element is said to be in majority if it has occurences more than half of size of array
		
		
		Integer [] arr= {10,20,10,10,30};
		
		HashMap<Integer,Integer> hset=new HashMap<Integer,Integer>();
		
		for (Integer integer : arr) {
			if(hset.get(integer)!=null) {
				hset.put(integer, hset.get(integer) + 1);
		}
		else {
			hset.put(integer, 1);
		}
		
		}
		
	for(Map.Entry<Integer, Integer> map:hset.entrySet()){
		if(map.getValue()>arr.length/2)
		{
			System.out.println(map.getKey());
		}
	}
		
	}

}
