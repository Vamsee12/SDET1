package Control_Statements_1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rev=0; int rem;
		
	System.out.println("Enter the number for reverse a number : ");
	    int num = sc.nextInt();
	    
	    while(num!=0){
	    	rem =num%10;
	    	rev =rev*10+rem;
	    	num=num/10;
	    	
	                 }
	    
	    System.out.print(rev);
	    

	}

}
