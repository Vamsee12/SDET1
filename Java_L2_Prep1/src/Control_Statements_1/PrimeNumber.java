package Control_Statements_1;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num for which you want to check it is prime num or not :");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		if(count==2) {
			System.out.println("The number "+num+" is prime number");
		}
		else {
			System.out.println("The number "+num+" is not a prime number");
		}
	}

}
