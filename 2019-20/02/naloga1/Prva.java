
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		ArrayList<Integer> stevila = new ArrayList<>();

		while (scn.hasNextInt()) {
			stevila.add(scn.nextInt());
		}

		int index = -1;
		for (int i = 1; i < stevila.size(); i++) {
			if (stevila.get(i) % stevila.get(i - 1) != 0) {
				index = i;
				break;
			}
		}

		System.out.println(index != -1 ? index : stevila.size());

	}
}
