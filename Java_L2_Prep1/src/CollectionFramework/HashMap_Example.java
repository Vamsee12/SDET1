package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h = new HashMap();
		
		h.put(101, "aaa");
		h.put(102, "bbb");
		h.put(103, "ccc");
		h.put(104, "ddd");
		h.put(105, "eee");
		
		for(Map.Entry e : h.entrySet())
		{
          //System.out.println(e);
          
          System.out.println(e.getKey() +" -> "+e.getValue());
	    }

}
}
