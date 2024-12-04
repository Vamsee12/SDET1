package CollectionFramework;

import java.util.ArrayList;

public class Collection_Example1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add("vmc");
		al.add('x');
		
		System.out.println(al);

		
ArrayList al2 = new ArrayList();
		
		al2.add(300);
		al2.add(400);
		al2.add("Maahi");
		al2.add('Y');
		
		al.addAll(al2);
		System.out.println(al);
		
		al.removeAll(al2);
		System.out.println(al);
		
		System.out.println("al2 contains 300 : " +al2.contains(300));
		System.out.println("al2 contains 300 : " +al2.contains("hey"));
		
		System.out.println("is al2 empty : "+al2.isEmpty());
		
		al2.add(600);
		System.out.println(al2);
		
		al2.remove(4);  //use index value
		System.out.println(al2);
		
		al2.set(1, 301); //replacing a value
		System.out.println(al2);
		
		
		al2.clear(); //removes all the elements
		System.out.println(al2);
		
		
		

	}

}
