package CollectionFramework;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("vamsee");  //push() is used to add elements in stack
		s.push(12);
		s.push('v');
		s.push(12.03);
		
		System.out.println(s);
		System.out.println(s.search("vamsee")); //we can search the object/element in the stack and returns element position
		System.out.println(s.peek());//returns the top most/last inserted element
		
		System.out.println(s);
		System.out.println(s.pop());//removes the top most/last inserted element
		System.out.println(s);
		

	}

}
