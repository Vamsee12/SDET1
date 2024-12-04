package oops;

//Here this keyword refers to current class instant variables
//this is termed as reference varialble of object
class XYZ {
	
	int i;                                  //instance variable
	
	 void show(int i)                       // here i is local variable
	 {
		 this.i=i;
	 }
	 
	 void Print()
	 {
		 System.out.println(i);
	 }
	 
}
public class This_Keyword {

	public static void main(String[] args) {
		
		XYZ t = new XYZ();
		t.show(12);
		t.Print();

	}

}
