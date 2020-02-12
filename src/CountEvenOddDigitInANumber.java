
public class CountEvenOddDigitInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int digit=123456;
		int evenCount=0;
		int oddCount=0;
		
		while (digit>0) {
			int num=digit%10;
			
			if(num%2==0) {
				evenCount++;	
			}
			else {
				oddCount++;
			}
			digit=digit/10;
		}  
		System.out.println(" Even digit count is " +evenCount + " Odd digit count is " +oddCount);

	}

}
