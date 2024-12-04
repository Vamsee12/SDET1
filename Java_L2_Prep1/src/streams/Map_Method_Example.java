package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Method_Example {

	public static void main(String[] args) {
		
		List<String> cars = Arrays.asList("bmw", "audi", "mercedes", "lamborgini");
		
		List<String> new_cars = new ArrayList<String>();
		
	/*	for(String carname : cars)
		{
			new_cars.add(carname.toUpperCase());
		}
		
		System.out.println(new_cars); */
		
		new_cars = cars.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
		System.out.println(new_cars);
		
		System.out.println();
		
		cars.stream().map(c -> c.toUpperCase()).forEach(c -> System.out.println(c));
		
		System.out.println();

		
		cars.stream().map(c -> c.toUpperCase()).forEach(System.out::println);
		
		System.out.println();
		
		cars.stream().map(c -> c.length()>=5).forEach(System.out::println);
	}

}
