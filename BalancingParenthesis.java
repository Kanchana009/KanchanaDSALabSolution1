package com.thirdlab;

import java.util.Stack;

public class BalancingParenthesis {

	boolean isBalanced(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {

				stack.push(s.charAt(i)); // push to the stack

			}

			if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {

				if (stack.isEmpty()) {
					return false; // return false as there is nothing to match
				}

				Character top = stack.pop(); // to get the top element in the stack

				if (top == '(' && s.charAt(i) != ')' || top == '{' && s.charAt(i) != '}'
						|| top == '[' && s.charAt(i) != ']') {

					return false;
				}

			}

		}

		if (stack.isEmpty()) {
			return true; // check if every symbol is matched
		}

		return false; // if some symbols were unmatched
	}

	public static void main(String[] args) {

		BalancingParenthesis obj = new BalancingParenthesis();

		System.out.println(obj.isBalanced("()[]{}[][]"));

	}

}
