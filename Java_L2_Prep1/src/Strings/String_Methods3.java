package Strings;

public class String_Methods3 {

	public static void main(String[] args) {
		
		String s1="a";
		String s2="A";
		
		System.out.println(s1.compareTo(s2));  //compareTo() method provides integer output eg: a ascii value 97 A ascii value 65 => 97-65=32

		String s3="AB";
		String s4="Ab";
		
		System.out.println(s3.compareTo(s4)); // here as first character is same in both s3 and s4 it go for second character
		
		String s5="vamsee";
		String s6="";
		System.out.println(s5.compareTo(s6)); // as s6 is empty it will return size of s5
	}

}
