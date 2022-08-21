package com.marouane;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

	public static boolean validParentheses(String parens) {


		Deque<String> open = new ArrayDeque<>();

		for (int i = 0; i < parens.length(); i++) {
			if (parens.charAt(i) == '(') {
				open.push("(");
			}
			if (parens.charAt(i) == ')') {
				if (open.isEmpty())
					return false;
				open.pop();
			}
		}

		return open.isEmpty();
	}
}
