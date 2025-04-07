package generalInterviewCodes;

import java.util.HashMap;

public class CharCountInString {

	public static void main(String[] args) {
		
		String s = "Hello World";
		s = s.replaceAll("\\s", "");   //if we also want to count spaces just comment this line
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : map.keySet())
		{
			System.out.println(ch+" "+map.get(ch));
		}

	}

}
