package com.marouane;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

	public static String pigIt(String str) {
		return Arrays.stream(str.split(" "))
				.map(s -> Character.isAlphabetic(s.charAt(0)) ? s.substring(1) + s.charAt(0) + "ay" : s)
				.collect(Collectors.joining(" "));
	}
}
