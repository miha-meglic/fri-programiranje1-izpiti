
/*
 * Testiranje:
 *
 * tj.exe Cetrta.java . .
 */

import java.util.*;

public class Cetrta {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		HashMap<String, Stranka> glasovi = new HashMap<>();

		int stGlasov = scn.nextInt();
		for (int i = 0; i < stGlasov; i++) {
			String prim = scn.next();
			String sek = scn.next();

			Stranka pGlasovi = glasovi.getOrDefault(prim, new Stranka(prim));
			pGlasovi.dodajPrimarniGlas();
			glasovi.put(prim, pGlasovi);

			Stranka sGlasovi = glasovi.getOrDefault(sek, new Stranka(sek));
			sGlasovi.dodajSekundarniGlas();
			glasovi.put(sek, sGlasovi);
		}

		SortedSet<Stranka> stranke = new TreeSet<>(glasovi.values());

		System.out.println(stranke);
	}

	static class Stranka implements Comparable<Stranka> {
		private int primarniGlasovi = 0;
		private int sekundarniGlasovi = 0;
		private String ime;

		public Stranka(String ime) {
			this.ime = ime;
		}

		public void dodajPrimarniGlas() {
			this.primarniGlasovi++;
		}

		public void dodajSekundarniGlas() {
			this.sekundarniGlasovi++;
		}

		@Override
		public int compareTo(Stranka o) {
			if (this.primarniGlasovi == o.primarniGlasovi) {
				if (this.sekundarniGlasovi == o.sekundarniGlasovi)
					return this.ime.compareTo(o.ime);
				else if (this.sekundarniGlasovi > o.sekundarniGlasovi)
					return -1;
				else
					return 1;
			} else if (this.primarniGlasovi > o.primarniGlasovi) {
				return -1;
			} else {
				return 1;
			}
		}

		@Override
		public String toString() {
			return this.ime;
		}
	}
}
