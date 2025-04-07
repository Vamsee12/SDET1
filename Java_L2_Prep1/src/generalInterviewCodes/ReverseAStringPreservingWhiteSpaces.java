package generalInterviewCodes;

import java.util.Stack;

public class ReverseAStringPreservingWhiteSpaces {

	public static void main(String[] args) {
		String str = "h e l l o  w o r l d"; // Example input
		Stack<Character> stack = new Stack<>();

		// Push all non-space characters onto the stack
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				stack.push(ch);
			}
		}

		// Construct the reversed string
		StringBuilder result = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				result.append(' '); // if found spaces will append it to String (Keep spaces in place)
			} else {
				result.append(stack.pop()); // If there is no space will print string in reverse order as Stack is LIFO (Pop from stack (reversed order))
			}
		}

		System.out.println("Reversed String: " + result);
	}
}
