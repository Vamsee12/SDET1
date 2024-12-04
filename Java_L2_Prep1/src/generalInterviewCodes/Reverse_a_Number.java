package generalInterviewCodes;

import java.util.Scanner;

public class Reverse_a_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;           //here 0*10 + 1234%10 ==  0+4 so rev=4
			num = num/10;                    //1234/10 = 123.4 as num is integer it will only consider 123 and ignore decimal value
		}
		
		System.out.println(rev);
		
		
		//using StringBuffer
		int num1 = 1234;
		StringBuffer sb = new StringBuffer(String.valueOf(num1));		//valueOf() coverts num to a string
		System.out.println("Reverse a num using StringBuffer " + sb.reverse());
		
		
		//using StringBuilder
		int num2 = 1234;
		StringBuilder s = new StringBuilder();
		s.append(num2);
		System.out.println("Reverse a num using StringBuilder " + s.reverse());
		
		
		
	}
	
	

}
