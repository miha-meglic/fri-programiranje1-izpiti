
/*
 * tj.exe Druga.java . .
 */

import java.util.*;

public class Druga {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int h = scn.nextInt();
		int w = scn.nextInt();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int k = scn.nextInt();

		int[][] gozd = new int[h][w];

		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				gozd[y][x] = scn.nextInt();
			}
		}

		int y = 0;
		int x = 0;
		int drevesa = 0;
		int cas = 0;

		while (cas < 10000 && drevesa < k) {
			y += a;
			x += b;

			while (y >= h)
				y -= h;
			while (x >= w)
				x -= w;

			if (gozd[y][x] == 1)
				drevesa++;

			cas++;
		}

		System.out.println(cas);
	}
}
