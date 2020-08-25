package Arrays;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		int givenSum=50;
		
		int [] arr= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=1;j<arr.length;j++) 
			
			{
				if(arr[j]+arr[i]==givenSum)
					
				{
				System.out.println(" Pairs are "+arr[i] +"," +arr[j]);	
				}
			}
		}

	}

}
