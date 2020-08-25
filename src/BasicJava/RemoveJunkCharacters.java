package BasicJava;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "@#@$@$@%JavaProgrammeUsingRegularExpression";
		s1 = s1.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(s1);
	}

}
