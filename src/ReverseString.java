
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Selenium";
		int length = s.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		//Using string buffer
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
