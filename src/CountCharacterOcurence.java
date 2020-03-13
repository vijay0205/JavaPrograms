

public class CountCharacterOcurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java Programing";

		int InitialLength = s.length();
		s = s.replaceAll("a", "");
		int finalLength = s.length();
		System.out.println(s);
		int occuranceOfGivenCharacter = InitialLength - finalLength;
		System.out.println("Occurence of character is " + occuranceOfGivenCharacter + " times");
	}

}
