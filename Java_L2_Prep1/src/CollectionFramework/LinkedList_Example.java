package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(12);
		l.add("maahi");
		l.add('k');
		l.add(7.78);
		
		System.out.println(l);
		
		l.addFirst("abc");
		l.addLast("xyz");
		
		System.out.println(l);
		
		System.out.println("---------------------------");
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
