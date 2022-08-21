package com.marouane;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

	@Test
	public void sampleTest() {
		assertEquals(true, ValidParentheses.validParentheses("32423(sgsdg)"));
		assertEquals(true, ValidParentheses.validParentheses("(())((()())())"));
		assertEquals(true, ValidParentheses.validParentheses("()"));
		assertEquals(false, ValidParentheses.validParentheses("())"));
		assertEquals(false, ValidParentheses.validParentheses("(dsgdsg))2432"));
		assertEquals(true, ValidParentheses.validParentheses("adasdasfa"));
	}
}
