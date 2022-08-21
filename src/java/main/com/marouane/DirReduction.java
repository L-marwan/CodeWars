package com.marouane;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/550f22f4d758534c1100025a
 *
 */
public class DirReduction {

	public static String[] dirReduc(String[] arr) {

		List<String> result = new ArrayList<>();
		boolean reduced = false;
		for (int i = 0; i < arr.length; i++) {
			String dir = arr[i];
			String nextDir = (i + 1) >= arr.length ? "" : arr[i + 1];
			if ("SOUTH".equals(dir) && "NORTH".equals(nextDir) || "NORTH".equals(dir) && "SOUTH".equals(nextDir)
					|| "EAST".equals(dir) && "WEST".equals(nextDir) || "WEST".equals(dir) && "EAST".equals(nextDir)) {
				i++;
				reduced = true;
				continue;
			}
			result.add(dir);
		}
		if (!reduced)
			return arr;

		return dirReduc(result.toArray(new String[] {}));
	}
}
