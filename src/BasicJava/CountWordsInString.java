package BasicJava;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Selenium with java";

		int count = 1;
		for (int i = 0; i < s.length(); i++)

		{

			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))

			{
				count++;
			}
		}

		System.out.println("Total words are " + count);

//		Approach 2 using split functionality
		String[] arr = s.split(" ");
		System.out.println(arr.length);

	}

}
