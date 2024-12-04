package generalInterviewCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i == 0)
					count++;
			}
			
			if(count == 2)
			{
				System.out.println("Given num is a prime number");
			}
			
			else
			{
				System.out.println("Given num is not a prime number");
			}
		}
		
		else
		{
			System.out.println("Entered num should be greater than 1");
		}
	}

}
