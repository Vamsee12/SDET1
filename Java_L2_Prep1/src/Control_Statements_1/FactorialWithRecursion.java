package Control_Statements_1;

import java.util.Scanner;

public class FactorialWithRecursion {
static long fact=1;
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for finding factorial : ");
	    long num = sc.nextLong();
	    
	    FactorialWithRecursion f = new FactorialWithRecursion();
	    f.factorial(num);
	    System.out.println(fact);

	}
	
	void factorial(long num) {
		if(num>1) {
			fact=fact*num;
			factorial(num-1);
		
	              }

   }
}
