
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

	// =========================================================================
	// V vseh testnih primerih velja:
	// 1 <= "stevilo vrstic tabele <= 100
	// 1 <= "stevilo stolpcev tabele <= 100
	// =========================================================================

	public static int zadnjaVrsticaZLocilom(char[][] krizanka) {
		int zadnja = -1;

		for (int v = 0; v < krizanka.length; v++) {
			for (int s = 0; s < krizanka[v].length; s++) {
				if (krizanka[v][s] == '-') {
					zadnja = v;
					break;
				}
			}
		}

		return zadnja;
	}

	// =========================================================================
	// V vseh testnih primerih velja:
	// 1 <= "stevilo vrstic tabele <= 100
	// 1 <= "stevilo stolpcev tabele <= 100
	// 0 <= stolpec < "stevilo stolpcev
	// =========================================================================

	public static char[] ktaBeseda(char[][] krizanka, int stolpec, int k) {
		StringBuilder sb = new StringBuilder();
		int trenutnaBeseda = 1;

		for (int v = 0; v < krizanka.length; v++) {
			if (krizanka[v][stolpec] == '-') {
				trenutnaBeseda++;
				continue;
			}
			if (trenutnaBeseda > k)
				break;
			if (trenutnaBeseda == k)
				sb.append(krizanka[v][stolpec]);
		}

		if (trenutnaBeseda < k)
			return null;

		return sb.toString().toCharArray();
	}
}
