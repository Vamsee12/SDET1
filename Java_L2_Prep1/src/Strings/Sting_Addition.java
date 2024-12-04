package Strings;

public class Sting_Addition {

	public static void main(String[] args) {

		String s1="Vamsee";
		String s2="Java";
		
		System.out.println(s1+s2);
		
		System.out.println(s1+s2+10+20); //Vamsee1020

		System.out.println(s2+40/10); //Java4 because of bodmas rule

		System.out.println(s1+10*7);

		System.out.println(10+20+s1); //30Vamsee

		System.out.println(s1.concat(s2));

		System.out.println(String.join(",",s1,s2)); // static method of string class first we need to give delimeter and then arguments
		

		String s3="this is demo";
		
		System.out.println(s3.subSequence(3, 7)); //it will return string from 3rd index position to 7-1 6th index position
		
		System.out.println(s3.substring(4)); //it will return string from 4th index position
		
		System.out.println(s3.substring(2, 8)); //it will return string from 2nd index position to 8-1 7th index position
		
		
	}

}
