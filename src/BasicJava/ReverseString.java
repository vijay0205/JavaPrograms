package BasicJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Selenium";
		int length = s.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Using CharAt method = " +rev);
		
		//Using string buffer
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Using String buffer = " +sb.reverse());
		
		//Using charArray
		
		char[] a=s.toCharArray();
		String reverse="";
		for(int i=a.length -1;i>=0;i--) {
			
			reverse=reverse+a[i];
			
					
		}
		System.out.println("Using toChar = " +reverse);
	}

}
