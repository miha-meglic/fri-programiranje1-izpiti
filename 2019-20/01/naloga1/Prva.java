
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		int k = scn.nextInt();

		int trenutnaVsota = 0;
		int trenutniKup = 0;

		while (trenutnaVsota < k) {
			trenutnaVsota += a;
			a += b;
			trenutniKup++;
		}

		System.out.println(trenutniKup);
	}
}
