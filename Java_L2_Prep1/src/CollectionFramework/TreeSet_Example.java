package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
//		ts.add(40);
//		ts.add(10);
//		ts.add(30);
//		ts.add(50);
//		ts.add(20);
		
		System.out.println(ts);  //TreeSet follows sorting order
		
    	ts.add("xyz");
		ts.add("mnp");
		ts.add("def");
		ts.add("uvw");
		ts.add("abc");   
		
		System.out.println(ts);
		
		System.out.println("--------------------------------------");
		
		Iterator i = ts.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
