package myproject.collections;

import java.util.Stack;

public class ListCheck {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.capacity());
		stack.push("AA");
		stack.push("QQ");
		stack.push("CC");
		System.out.println(stack);
	}

}
