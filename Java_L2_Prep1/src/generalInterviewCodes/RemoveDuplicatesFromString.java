package generalInterviewCodes;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		String s = "Vamseevam";
		
		char[] ch = s.toCharArray();         //converting to char array
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(char c : ch)                                  //iterating using for each
		{
			char c1 = Character.toLowerCase(c);           //coverting all char to lower cases such that elements like V v does not add into hashSet as one is capital and other is small
			if(set.add(c1) == true)                       //adding to hash set
			{
				System.out.print(c);                       //printing original string
			}
		}
	}

}
