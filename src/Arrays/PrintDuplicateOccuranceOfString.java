package Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class PrintDuplicateOccuranceOfString {
//	***************Finding duplicate word**************
	
	public static void findDuplicateWord(String str) {
		System.out.println("***************Finding duplicate word**************");

		String[] s = str.split(" ");

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String tempString : s) {
			if (hmap.get(tempString) != null) {
				hmap.put(tempString, hmap.get(tempString) + 1);
			}  
			else {
				hmap.put(tempString,1);
			}

		}
		Iterator<String> itr = hmap.keySet().iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			if (hmap.get(temp) > 0) {
				System.out.println(temp + " : " + hmap.get(temp));
			}
		}

	}

	public static void findDuplicateCharacter(String str) {
//		***************Finding duplicate characters**************
		System.out.println("***************Finding duplicate characters**************");
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (hmap.get(c) != null) {
				hmap.put(c, hmap.get(c) + 1);
			}

			else {
				hmap.put(c, 1);
			}
		}
		Iterator<Character> itr = hmap.keySet().iterator();
		while (itr.hasNext()) {
			Character temp = itr.next();
			if (hmap.get(temp) > 1) {
				System.out.println(temp + " : " + hmap.get(temp));
			}

		}

	}

	public static void main(String[] args) {
		findDuplicateWord("I I am am Learning Java Java");
		findDuplicateCharacter("abcadkedoweed");

	}

}
