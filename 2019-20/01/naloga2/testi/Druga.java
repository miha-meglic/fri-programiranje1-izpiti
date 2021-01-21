
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

	public static int najCas(int[][] t, int krog) {
		int bestTime = t[0][krog];

		for (int i = 1; i < t.length; i++) {
			if (t[i][krog] < bestTime) {
				bestTime = t[i][krog];
			}
		}

		return bestTime;
	}

	public static int[][] kumulativa(int[][] t) {

		for (int[] casi : t) {
			int kumulativa = 0;
			for (int j = 0; j < casi.length; j++) {
				kumulativa += casi[j];
				casi[j] = kumulativa;
			}
		}

		return t;
	}
}
