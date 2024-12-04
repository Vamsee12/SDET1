package Strings;

public class String_Methods6 {

	public static void main(String[] args) {

		String s1="vamsee";
		String s2="MOHAN";
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		int a=12;
		
		System.out.println(String.valueOf(a));  //valueOf() static method of String class
		
		char[] c=s1.toCharArray();
		System.out.println(c);
		
		//StringBuilder sb = new StringBuilder("Vamsee");
		//System.out.println(sb);
	}

}
