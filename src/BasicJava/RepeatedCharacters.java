package BasicJava;

import java.util.HashMap;

public class RepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print repeated characters
        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " = " + map.get(key));
            }
        }

	}

}
