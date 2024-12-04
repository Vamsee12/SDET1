package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(77);
		hs.add("vmc");
		hs.add('a');
		hs.add(99.11);
		hs.add(null);
		hs.add(77);
		hs.add(null);
		
		System.out.println(hs); //hashset does not follow insertion and sorting
		
		ArrayList al = new ArrayList();
		al.add("maahi");
		al.add("VK");
		
		hs.addAll(al);
		System.out.println(hs);
		
		System.out.println("-----------------------");
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
