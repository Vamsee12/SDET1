package generalInterviewCodes;

import java.util.Scanner;

public class ArmstrongNumber {
	
	    public static void main(String[] args) {
	        
	    	Scanner scanner = new Scanner(System.in);

	        // Input the number
	        System.out.print("Enter a number: ");
	        
	        int number = scanner.nextInt();

	        // Check if the number is an Armstrong number
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }

	    // Method to check if the number is Armstrong
	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int digits = String.valueOf(number).length(); // Find number of digits

	        // Calculate sum of each digit raised to the power of the number of digits
	        while (number != 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, digits);
	            number /= 10;
	        }

	        // Check if sum equals the original number
	        return sum == originalNumber;
	    }
	}



