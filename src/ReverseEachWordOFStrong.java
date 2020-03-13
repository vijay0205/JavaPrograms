

public class ReverseEachWordOFStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is Selenium with Java";
		String reverseString = "";
		

		String[] words = s.split(" ");

		for (String w : words) {
			String reverseWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {

				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + "  ";
		}

		System.out.println(reverseString);
	}

}
