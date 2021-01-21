
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

	public static void main(String[] args) {
		// koda za ro"cno testiranje (po "zelji)
	}

	// =========================================================================
	public static abstract class Ukaz {

		public static int bilanca(Ukaz[] ukazi) {
			int stPostavi = 0;
			int stOdvzemi = 0;

			for (Ukaz u : ukazi) {
				if (u instanceof Postavi)
					stPostavi++;
				else if (u instanceof Odvzemi)
					stOdvzemi++;
			}

			return stPostavi - stOdvzemi;
		}

		public Ukaz zaporedje(Ukaz drugi) {
			Ukaz prvi = this;
			return new Ukaz() {
				private Ukaz[] zaporedje = new Ukaz[] { prvi, drugi };

				@Override
				public void izvedi(int[] stolpi) {
					zaporedje[0].izvedi(stolpi);
					zaporedje[1].izvedi(stolpi);
				}

				@Override
				public String toString() {
					return String.format("[%s, %s]", zaporedje[0].toString(), zaporedje[1].toString());
				}
			};
		}

		public abstract void izvedi(int[] stolpi);

		@Override
		public abstract String toString();

		// po potrebi dopolnite ...
	}

	// =========================================================================
	public static class Postavi extends Ukaz {
		private int kam;

		// V vseh testnih primerih velja:
		// kam >= 0

		public Postavi(int kam) {
			this.kam = kam;
		}

		@Override
		public void izvedi(int[] stolpi) {
			if (this.kam >= stolpi.length)
				return;

			stolpi[this.kam]++;
		}

		@Override
		public String toString() {
			return String.format("+%s", kam);
		}
	}

	// =========================================================================
	public static class Odvzemi extends Ukaz {
		private int odkod;

		// V vseh testnih primerih velja:
		// odkod >= 0

		public Odvzemi(int odkod) {
			this.odkod = odkod;
		}

		@Override
		public void izvedi(int[] stolpi) {
			if (this.odkod >= stolpi.length)
				return;
			if (stolpi[this.odkod] <= 0)
				return;

			stolpi[this.odkod]--;
		}

		@Override
		public String toString() {
			return String.format("-%s", odkod);
		}
	}

	// =========================================================================
	// po potrebi dopolnite ...
}
