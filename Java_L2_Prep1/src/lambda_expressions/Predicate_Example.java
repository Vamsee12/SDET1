package lambda_expressions;

import java.util.function.Predicate;

//interface Predicate<T>
//{
//	public abstract boolean test(T t);
//}

public class Predicate_Example {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> (i>=12);
		
		System.out.println(p.test(12)); //true
		
		
        Predicate<String> p1 = s -> (s.length() >= 12);
		
		System.out.println(p1.test("vamsee"));  //false
	}

}
