
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int stStevil = scn.nextInt();

		for (int i = 0; i < stStevil; i++) {
			int stevilo = scn.nextInt();
			int[] digits = getDigitArray(stevilo);

			int lastDigit = 0;
			boolean foundFirst = false;
			boolean descending = true;
			for (int digit : digits) {
				if (digit == 0 && foundFirst == false)
					continue;

				if (foundFirst == false) {
					lastDigit = digit;
					foundFirst = true;
				}

				if (lastDigit < digit) {
					descending = false;
					break;
				}

				lastDigit = digit;
			}

			System.out.println(descending ? "DA" : "NE");
		}
	}

	public static int[] getDigitArray(int n) {
		int[] digits = new int[10];
		int index = 0;

		for (int div = (int) Math.pow(10, 9); div > 0; div /= 10) {
			digits[index++] = n / div;
			n = n % div;
		}

		return digits;
	}
}
