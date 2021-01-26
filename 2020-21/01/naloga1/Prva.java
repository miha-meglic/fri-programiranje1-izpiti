
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

			System.out.println(jePadajoce(stevilo) ? "DA" : "NE");
		}
	}

	public static boolean jePadajoce(int n) {
		int lastDigit = -1;

		while (n > 0) {
			int digit = n % 10;

			if (lastDigit > digit) {
				return false;
			}

			lastDigit = digit;
			n /= 10;
		}

		return true;
	}
}
