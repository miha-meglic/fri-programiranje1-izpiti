
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		while (!jeObilno(n))
			n++;

		System.out.println(n);
	}

	public static boolean jeObilno(int n) {
		ArrayList<Integer> deljitelji = new ArrayList<>();
		deljitelji.add(1);

		for (int d = 2; d < n / 2 + 1; d++) {
			if (n % d == 0)
				deljitelji.add(d);
		}

		int sum = 0;
		for (Integer i : deljitelji)
			sum += i;

		return n < sum;
	}
}
