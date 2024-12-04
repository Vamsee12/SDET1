package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		
		TreeMap t = new TreeMap();
		
		t.put(101, "aaa");
		t.put(105, "bbb");
		t.put(103, "ccc");
		t.put(107, "ddd");
		t.put(109, "eee");
		
		System.out.println(t);
		
		System.out.println(t.ceilingEntry(108)); //if 108 is not present it provides next biggest key value pair
		
				

	}

}
