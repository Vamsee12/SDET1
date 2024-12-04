package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(101, "vmc");
		m.put("abc", "maahi");
		m.put(11.77,null);
		m.put(null, 12);
		m.put('c', 46.67);
		
		System.out.println(m);
		
		System.out.println(m.containsKey(101));
		
		System.out.println(m.containsValue("mnp"));
		
		System.out.println(m.get('c'));

		m.replace('c', 155.55);
		m.remove(null);
		
		System.out.println(m);
		
		System.out.println(m.size());
		
		m.put(101, "Vamsee");// Map will not store duplicate keys it will consider latest value of key
		System.out.println(m);
	}

}
