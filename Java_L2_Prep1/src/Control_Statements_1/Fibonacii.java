package Control_Statements_1;

public class Fibonacii {
// 0 1 1 2 3 5 8 13 21 -----
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1;
		int c;
		
		System.out.print(a+" "+b);
		 for(int i=1;i<=10;i++) {
			 
			 c=a+b;
			 System.out.print(" "+c);
			 a=b;
			 b=c;
		 }
		

	}

}
