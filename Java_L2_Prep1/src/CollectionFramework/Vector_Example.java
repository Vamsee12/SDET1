package CollectionFramework;

import java.util.ListIterator;
import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(17);
		v.add("abd");
		v.add('l');
		v.add(18.87);
		v.add("lkjhgfghjk");
		
		v.setElementAt("maahi", 4);
		
		System.out.println(v);
		
		System.out.println("-------------------------------");
		
		ListIterator li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
