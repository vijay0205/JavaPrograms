package Arrays;

import java.util.HashSet;

public class CommonelementsInTwoArray {

	public static void main(String[] args) {
		int [] arr1= {1,5,2,4,5,1,4,7};
		int [] arr2= {1,4,2};
		for(int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j])
				{
					System.out.println("Common elelents are "+arr1[i]);
				}
			}
		}
		 
//		approach 2
        HashSet<Integer> set = new HashSet<>();

        // Add elements of first array into HashSet
        for(int num : arr1){
            set.add(num);
        }
     // Check elements of second array
        for(int num : arr2){
            if(set.contains(num)){
                System.out.println("Approach 2 Common element is " + num);
                set.remove(num); // avoid duplicates
            }
        }
    }

	

}