
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

	// =========================================================================
	public static class Opravilo {
		private String naziv;
		private int zahtevnost;

		public Opravilo(String naziv, int zahtevnost) {
			this.naziv = naziv;
			this.zahtevnost = zahtevnost;
		}
	}

	// =========================================================================
	public static class Projekt {
		private String naziv;
		private Opravilo[] opravila;

		public Projekt(String naziv, Opravilo[] opravila) {
			this.naziv = naziv;
			this.opravila = opravila;
		}

		public int zahtevnost() {
			int maxZahtevnost = 0;

			for (Opravilo o : opravila) {
				if (o.zahtevnost > maxZahtevnost)
					maxZahtevnost = o.zahtevnost;
			}

			return maxZahtevnost;
		}

		public boolean jePermutacijaOd(Object drugi) {
			if (!(drugi instanceof Projekt))
				return false;

			Projekt dr = (Projekt) drugi;

			if (this.opravila.length != dr.opravila.length)
				return false;

			for (Opravilo o2 : dr.opravila) {
				if (!this.containsOpravilo(o2))
					return false;
			}

			return true;
		}

		private boolean containsOpravilo(Opravilo op) {
			for (Opravilo o : this.opravila)
				if (o == op)
					return true;

			return false;
		}
	}

	// =========================================================================
	public static class Delavec {
		private String ip;
		private int usposobljenost;

		public Delavec(String ip, int usposobljenost) {
			this.ip = ip;
			this.usposobljenost = usposobljenost;
		}
	}

	// =========================================================================
	public static class Delavnica {
		private Delavec[] delavci;

		public Delavnica(Delavec[] delavci) {
			this.delavci = delavci;
		}

		public int univerzalci(Projekt[] projekti) {
			int univerzalci = 0;

			for (Delavec d : delavci) {
				boolean jeUniverzalec = true;

				for (Projekt p : projekti) {
					if (p.zahtevnost() > d.usposobljenost) {
						jeUniverzalec = false;
						break;
					}
				}

				if (jeUniverzalec)
					univerzalci++;
			}

			return univerzalci;
		}
	}

	// =========================================================================
	public static void main(String[] args) {
		// koda za ro"cno testiranje (po potrebi)
	}

}
