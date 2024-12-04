package Strings;

public class String_Methods4 {

	public static void main(String[] args) {

		String s1="Woah this is a bmw car";
		
		System.out.println(s1.replace("is", "was")); //replaces is with was wherever "is" is present
		
		System.out.println(s1.replaceFirst("is", "was"));//replaces only first is
		
		System.out.println(s1.replaceAll("is(.)", "was"));
	}

}
