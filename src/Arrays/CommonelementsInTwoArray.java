package Arrays;

public class CommonelementsInTwoArray {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5,6};
		int [] arr2= {1,3,6,9,3};
		for(int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j])
				{
					System.out.println("Common elelents are "+arr1[i]);
				}
			}
		}
	}

}
