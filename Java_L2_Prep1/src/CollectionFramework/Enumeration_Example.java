package CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Example {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(12);
		v.add("vamsee");
		v.add('d');
		v.add(4.44);
		
		System.out.println(v);
		
		System.out.println("-----------------------");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
