package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Example {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(100);
		l.add(1, "vmc");
		l.add('c');
		l.add(11.77);
		
		System.out.println(l);
		
		System.out.println();
		
//		Iterator itr = l.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
		
		System.out.println("---------------------------------------");
			
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
