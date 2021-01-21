
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

	public static interface Generator {
		public int naslednji();
	}

	public static int stKlicev(Generator gen, int k) {
		HashMap<Integer, Integer> rez = new HashMap<>();
		int stKlicov = 0;

		while (!rez.containsValue(k)) {
			int naslednji = gen.naslednji();

			int st = rez.getOrDefault(naslednji, 0);
			st++;
			rez.put(naslednji, st);

			stKlicov++;
		}

		return stKlicov;
	}

	public static void main(String[] args) {
		// koda za ro"cno testiranje (po "zelji)
	}
}
