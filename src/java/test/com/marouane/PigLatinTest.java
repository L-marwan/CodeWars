package com.marouane;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PigLatinTest {

	@Test
	public void fixedTests() {
		assertEquals("ordway", 
				PigLatin.pigIt("word"));
		assertEquals("igPay atinlay siay oolcay",
				PigLatin.pigIt("Pig latin is cool"));
		assertEquals("hisTay siay ymay tringsay", 
				PigLatin.pigIt("This is my string"));
		assertEquals("elloHay orldway !", 
				PigLatin.pigIt("Hello world !"));
	}
}
