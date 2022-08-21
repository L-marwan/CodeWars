package com.marouane;

/**
 * https://www.codewars.com/kata/5270d0d18625160ada0000e4
 *
 */
public class Greed {

	public static int greedy(int[] dice) {
		/*
		 * Three 1's => 1000 points Three 6's => 600 points Three 5's => 500 points
		 * Three 4's => 400 points Three 3's => 300 points Three 2's => 200 points One 1
		 * => 100 points One 5 => 50 point
		 */

		int score = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;

		for (int i : dice) {
			switch (i) {
			case 1:
				ones++;
				if (ones == 3) {
					ones = 0;
					score += 1000;
				}

				break;
			case 2:
				twos++;
				if (twos == 3) {
					twos = 0;
					score += 200;
				}
				break;
			case 3:
				threes++;
				if (threes == 3) {
					threes = 0;
					score += 300;
				}
				break;
			case 4:
				fours++;
				if (fours == 3) {
					fours = 0;
					score += 400;
				}
				break;
			case 5:
				fives++;
				if (fives == 3) {
					fives = 0;
					score += 500;
				}
				break;
			case 6:
				sixes++;
				if (sixes == 3) {
					sixes = 0;
					score += 600;
				}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
		}
		if (ones>0)
			score+=ones*100;
		if(fives>0)
			score+=fives*50;

			return score;
	}
}
