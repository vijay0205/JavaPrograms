

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40};
		boolean flag=false;
		int searchElement=100;
		for(int i=0;i<arr.length-1;i++) {
			
			if (arr[i]==searchElement) {
				System.out.print(" Element is present is Array");
				System.out.print("  and Found At "+i + " Place");
				flag=true;
				break;
			}
		}
		if(flag==false)
		System.out.println(searchElement +" is not present");

	}

}
