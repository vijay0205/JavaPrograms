package Arrays;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Approach 1
		int [] oldArray= {1,2,3,4};
		int [] newArray =Arrays.copyOf(oldArray, oldArray.length);

		System.out.println(Arrays.toString(newArray));
		
//		approach2
		
		int [] newArrApproach2= new int[oldArray.length];
		for(int i=0;i<oldArray.length;i++)
			
		{
			newArrApproach2[i]=oldArray[i];
		}
		System.out.println("Copy array using approch 2 " +Arrays.toString(newArrApproach2));
	}

}
