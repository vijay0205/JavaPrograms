package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayIntoArrayList {

	public static void main(String[] args) {
		
		
		String [] colours= {"a", "b", "c" };
		
//		approach 1
		
		List<String> al1=Arrays.asList(colours);
		
		System.out.println(al1);
		
		
//		approach 2
		
		List <String> al2= new ArrayList<String>();
		Collections.addAll(al2, colours);
		System.out.println(al2);
		
//		approach 3
		List <String> al3= new ArrayList<String>();
		for (String arr : colours) {
			al3.add(arr);
			
		}
		System.out.println(al3);
		
	}

}
