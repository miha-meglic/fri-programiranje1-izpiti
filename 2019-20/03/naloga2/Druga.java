
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

	public static void main(String[] args) {
		// koda za ro"cno testiranje (po "zelji)
	}

	public static int stPresezkov(int[][] r, int meja) {
		int stDni = 0;

		for (int m = 0; m < r.length; m++) {
			for (int d = 0; d < r[m].length; d++) {
				if (r[m][d] > meja)
					stDni++;
			}
		}

		return stDni;
	}

	public static int nedeljskoPovprecje(int[][] r) {
		int nedelja = 6;
		int sum = 0;
		int stNedelj = 0;

		for (int m = 0; m < r.length; m++) {
			for (; nedelja < r[m].length; nedelja += 7) {
				sum += r[m][nedelja];
				stNedelj++;
			}
			nedelja = nedelja - r[m].length;
		}

		return sum / stNedelj;
	}
}
