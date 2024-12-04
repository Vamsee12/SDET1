package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Example {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add(200);
		s.add("maahi");
		s.add('v');
		s.add(88.11);
		
		System.out.println(s);
		
		System.out.println();

		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
