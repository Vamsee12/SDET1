package generalInterviewCodes;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		//swapping of two numbers using third variable
		int a = 10;
		int b= 20;
		int swap;
		
		System.out.println("Numbers before swapiing - "+"a : "+a+", b : "+b);
		
		swap=a;
		a=b;
		b=swap;
		
		System.out.println("Numbers after swapiing - "+"a : "+a+", b : "+b);
		
		
		//swapping of two numbers without using third variable
		
		int x = 109;
		int y = 87;
		
		System.out.println("Numbers before swapiing - "+"x : "+x+", y : "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Numbers after swapiing - "+"x : "+x+", y : "+y);
		

	}

}
