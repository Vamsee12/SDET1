package generalInterviewCodes;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse it : ");
		
		String s = sc.nextLine();
		
		//String s ="Vamsee";
		
		String rev = "";
		
		int len = s.length();
		
		System.out.println(len);   //The length of the string will be 6 here, SO here index starts from 1
		
		for(int i = len-1; i>=0; i--)    //As index starts from zero we are considering len-1 = 5, and for reverse a string traversing from last charactyer in a string
		{
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);

	}

}
