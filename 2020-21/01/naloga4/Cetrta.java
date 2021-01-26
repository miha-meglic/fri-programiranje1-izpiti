
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

	// =========================================================================
	public static class Barva implements Comparable<Barva> {
		private int r;
		private int g;
		private int b;

		public Barva(int r, int g, int b) {
			this.r = r;
			this.g = g;
			this.b = b;
		}

		@Override
		public int compareTo(Barva o) {
			Barva druga = (Barva) o;

			if (this.r == druga.r) {
				if (this.g == druga.g) {
					if (this.b == druga.b)
						return 0;
					else if (this.b < druga.b)
						return -1;
					else
						return 1;
				} else if (this.g < druga.g) {
					return -1;
				} else {
					return 1;
				}
			} else if (this.r < druga.r) {
				return -1;
			} else {
				return 1;
			}
		}

		@Override
		public String toString() {
			return String.format("(%d, %d, %d)", this.r, this.g, this.b);
		}
	}

	// =========================================================================
	public static abstract class Lik {
		private Barva barva;

		protected Lik(Barva barva) {
			this.barva = barva;
		}

		public abstract String vrsta();

		public abstract String mere();

		public abstract int ploscina();

		@Override
		public String toString() {
			return String.format("%s [%s, %s]", this.vrsta(), this.barva, this.mere());
		}
	}

	// =========================================================================
	public static class Pravokotnik extends Lik {
		private int a;
		private int b;

		public Pravokotnik(Barva barva, int a, int b) {
			super(barva);
			this.a = a;
			this.b = b;
		}

		public int vrniA() {
			return this.a;
		}

		@Override
		public int ploscina() {
			return a * b;
		}

		@Override
		public String vrsta() {
			return "pravokotnik";
		}

		@Override
		public String mere() {
			return String.format("a = %d, b = %d", this.a, this.b);
		}
	}

	// =========================================================================
	public static class Kvadrat extends Pravokotnik {
		public Kvadrat(Barva barva, int a) {
			super(barva, a, a);
		}

		@Override
		public String vrsta() {
			return "kvadrat";
		}

		@Override
		public String mere() {
			return String.format("a = %d", this.vrniA());
		}
	}

	// =========================================================================
	public static class Krog extends Lik {
		private int r;

		public Krog(Barva barva, int r) {
			super(barva);
			this.r = r;
		}

		@Override
		public int ploscina() {
			return (int) Math.round(Math.PI * Math.pow(r, 2));
		}

		@Override
		public String vrsta() {
			return "krog";
		}

		@Override
		public String mere() {
			return String.format("r = %d", this.r);
		}
	}

	// =========================================================================
	public static void urediNaravno(List<Lik> liki) {
		liki.sort((Lik l1, Lik l2) -> {
			if (l1.ploscina() == l2.ploscina())
				return 0;
			else if (l1.ploscina() < l2.ploscina())
				return -1;
			else
				return 1;
		});
	}

	// =========================================================================
	public static Collection<Lik> poTipuInBarvi(Collection<Lik> liki) {
		List<Lik> seznam = new ArrayList<>(liki);

		seznam.sort(new Comparator<Lik>() {
			@Override
			public int compare(Cetrta.Lik o1, Cetrta.Lik o2) {
				return 0;
			}
		});

		seznam.sort((Lik l1, Lik l2) -> {
			if (l1.vrsta() == l2.vrsta()) {
				return l1.barva.compareTo(l2.barva);
			} else {
				if (l1.vrsta().equals("pravokotnik"))
					return -1;
				else if (l2.vrsta().equals("pravokotnik"))
					return 1;
				else if (l1.vrsta().equals("kvadrat"))
					return -1;
				else if (l2.vrsta().equals("kvadrat"))
					return 1;
				else if (l1.vrsta().equals("krog"))
					return -1;
				else
					return 1;
			}
		});

		return (Collection<Lik>) seznam;
	}

	// =========================================================================
	public static void main(String[] args) {
		// koda za ro"cno testiranje (po potrebi)
	}
}
