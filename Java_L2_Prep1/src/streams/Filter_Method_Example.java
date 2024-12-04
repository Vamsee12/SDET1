package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter_Method_Example {

	public static void main(String[] args) {
		
	 /* List<String> l1 = new ArrayList<String>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		l1.add("ddd");
		l1.add("eee"); */
		
		
		List<String> names = Arrays.asList("MSD007","VK","ABD17","RGS45","RJ"); //without add method we can create ArrayList
		
		List<String> newnames = new ArrayList<String>();
		
		newnames = names.stream().filter(s -> s.length()>=5).collect(Collectors.toList());
		
		System.out.println(newnames);
		
		System.out.println();
		
		names.stream().filter(s -> s.length()>=5).forEach(s -> System.out.println(s));
		
		System.out.println();
		
		names.stream().filter(s -> s.length()>=5).forEach(System.out::println);
		
		



	}

}
