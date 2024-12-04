package Strings;

//== compares adress or object references,if refer same objects it will give true else false
//.equals compares objects content, if the content is same it returns true
public class Comparison_between_equals {

	public static void main(String[] args) {
		
		String s1=new String("vamsee");
		String s2=new String("vamsee");
		String s3="maahi";
		String s4="maahi";
		
		System.out.println(s1==s2);
		
		System.out.println(s3==s4);

		
		System.out.println(s1.equals(s2));

		
		System.out.println(s3.equals(s4));

	}

}
