
public class ReverseInteger {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int n = 12345;
		int rev = 0;
		while (n != 0) {

			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Using logic " +rev);

//using StringBuffer
		int num = 12345;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println("Using String Buffer "+sb.reverse());
		
//		Using StringBuilder
		 int intStringBuilder=12345 ;
		StringBuilder sBuilder= new StringBuilder();
	System.out.println("Using String Builder " +sBuilder.append(intStringBuilder).reverse());
	}

}
