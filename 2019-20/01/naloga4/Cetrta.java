
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

import jdk.nashorn.api.tree.Tree;

public class Cetrta {

	public static void main(String[] args) {
		// koda za ro"cno testiranje (po "zelji)
	}

	public static class Celica implements Comparable {
		private int vrstica;
		private int stolpec;

		public Celica(int vrstica, int stolpec) {
			this.vrstica = vrstica;
			this.stolpec = stolpec;
		}

		public int manhattanskaRazdalja(Celica c) {
			return Math.abs(this.vrstica - c.vrstica) + Math.abs(this.stolpec - c.stolpec);
		}

		@Override
		public String toString() {
			return String.format("(%d, %d)", this.vrstica, this.stolpec);
		}

		@Override
		public int compareTo(Object o) {
			if (o == null)
				throw new NullPointerException();
			if (!(o instanceof Celica))
				throw new ClassCastException();

			Celica comp = (Celica) o;
			if (this.vrstica == comp.vrstica) {
				return this.stolpec == comp.stolpec ? 0 : this.stolpec < comp.stolpec ? -1 : 1;
			} else if (this.vrstica < comp.vrstica) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	public static class Ovojnik implements Iterable<Celica> {
		private boolean[][] tabela;

		public Ovojnik(boolean[][] tabela) {
			this.tabela = tabela;
		}

		public NavigableSet<Celica> enice() {
			NavigableSet<Celica> set = new TreeSet<>(new Comparator<Celica>() {
				@Override
				public int compare(Celica o1, Celica o2) {
					Celica sredCelica = getSredinskaCelica();

					if (sredCelica.manhattanskaRazdalja(o1) == sredCelica.manhattanskaRazdalja(o2)) {
						return o1.compareTo(o2);
					} else if (sredCelica.manhattanskaRazdalja(o1) < sredCelica.manhattanskaRazdalja(o2)) {
						return -1;
					} else {
						return 1;
					}
				}
			});

			for (int v = 0; v < this.tabela.length; v++) {
				for (int s = 0; s < this.tabela[0].length; s++) {
					if (this.tabela[v][s] == true) {
						set.add(new Celica(v, s));
					}
				}
			}

			return set;
		}

		public Celica getSredinskaCelica() {
			return new Celica(this.tabela.length / 2, this.tabela[0].length / 2);
		}

		@Override
		public Iterator<Celica> iterator() {
			SortedSet<Celica> set = new TreeSet<>();

			for (int v = 0; v < this.tabela.length; v++) {
				for (int s = 0; s < this.tabela[0].length; s++) {
					if (this.tabela[v][s] == true) {
						set.add(new Celica(v, s));
					}
				}
			}

			return set.iterator();
		}
	}
}
