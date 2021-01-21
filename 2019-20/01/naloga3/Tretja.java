
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

	public static class Zaposleni {
		private String ip;
		private int placa;
		private Vodja nadrejeni;

		public Zaposleni(String ip, int placa, Vodja nadrejeni) {
			this.ip = ip;
			this.placa = placa;
			this.nadrejeni = nadrejeni;
		}

		@Override
		public String toString() {
			return this.ip;
		}

		public int placaNadrejenega() {
			if (this.nadrejeni == null)
				return -1;
			else
				return this.nadrejeni.getPlaca();
		}

		public static int steviloAnomalij(Zaposleni[] zaposleni) {
			int stevecAnomalij = 0;

			for (Zaposleni zap : zaposleni) {
				if (zap instanceof Delavec) {
					for (Zaposleni zap2 : zaposleni) {
						if (zap2 instanceof Vodja && zap2.getPlaca() < zap.getPlaca())
							stevecAnomalij++;
					}
				}
			}

			return stevecAnomalij;
		}

		public int getPlaca() {
			return this.placa;
		}

		public Vodja getNadrejeni() {
			return this.nadrejeni;
		}
	}

	public static class Delavec extends Zaposleni {
		public Delavec(String ip, int placa, Vodja nadrejeni) {
			super(ip, placa, nadrejeni);
		}
	}

	public static class Vodja extends Zaposleni {
		public Vodja(String ip, int placa, Vodja nadrejeni) {
			super(ip, placa, nadrejeni);
		}

		public Vodja vrhovni() {
			if (this.getNadrejeni() == null)
				return this;
			else
				return this.getNadrejeni().vrhovni();
		}
	}
}
