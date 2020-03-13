

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java   Selenium   java   selenium";
		System.out.println("Before removing spaces "+s);
		s=s.replaceAll("\\s", "");
		System.out.println("After removing spaces "+s);
	
	}

}
