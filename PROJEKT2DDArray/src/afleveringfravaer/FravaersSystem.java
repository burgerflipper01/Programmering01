package afleveringfravaer;

import java.nio.DoubleBuffer;
import java.security.KeyStore;
import java.util.logging.Level;

public class FravaersSystem {


	/**
	 * Fraværstallene udskrives på skærmen
	 *
	 * @param fravaer
	 */


	public void udskrivFravaer(int[][] fravaer) {
		for (int row = 0; row < fravaer.length; row++) {
			for (int col = 0; col < fravaer[row].length; col++) {
				System.out.print(fravaer[row][col] + "  ");
			}
			System.out.println();
		}

	}

	/**
	 * Returnerer det samlede antal fravaerdage over 12 måneder for eleven med
	 * elevnr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public int samletFravaer(int[][] fravaer, int elevNr) {
		int resultat = 0;
		for (int i = 0; i < fravaer[elevNr - 1].length; i++) {
			resultat += fravaer[elevNr - 1][i];

		}
		return resultat;
	}


	/**
	 * Returnerer det gennemsnitlige antal fraværsdage pr måned for eleven med
	 * elevNr.
	 *
	 * @param fravaer
	 * @param elevNr
	 * @return
	 */
	public double gennemsnit(int[][] fravaer, int elevNr) {
		int gennemsnit = 0;
		for (int i = 0; i < fravaer[elevNr - 1].length; i++) {
			gennemsnit += fravaer[elevNr - 1][i];
		}
		return gennemsnit / 12.0;
	}

	/**
	 * Returnerer antallet af elever der ikke har haft fravær i de 12 måneder.
	 *
	 * @param fravaer
	 * @return
	 */
	public int antalUdenFravaer(int[][] fravaer) {
		int nulfravaer = 0;
		for (int i = 0; i < fravaer.length; i++) {
			int sum = 0;
			for (int j = 0; j < fravaer.length; j++) {
				sum += fravaer[i][j];

			}
			if (sum == 0) {
				nulfravaer++;
			}
		}
		return nulfravaer;
	}

	/**
	 * Returnerer elevNr for den elev der har haft mest fravær igennem de 12
	 * måneder. Hvis flere elever har haft højst fravær, returneres elevnummer
	 * for en af disse.
	 *
	 * @param fravaer
	 * @return
	 */
	public int mestFravaer(int[][] fravaer) {
		int elevMestFravaer = 0;
		int mestfravaer = 0;
		for (int i = 0; i < fravaer.length; i++) {
			int sum = 0;
			for (int j = 0; j < fravaer[i].length; j++) {
				sum += fravaer[i][j];
			}
			if (sum > mestfravaer) {
				mestfravaer = sum;
				elevMestFravaer = i + 1;
			}

		}
		return elevMestFravaer;
	}

		/**
		 * Registrerer at elenven med elevNr ikke har haft fravær i nogen af de 12
		 * måneder.
		 *
		 * @param fravaer
		 * @param elevNr
		 */
		public void nulstil ( int[][] fravaer, int elevNr){
			for(int i = 0; i<fravaer[elevNr].length;i++){
				fravaer[elevNr][i] = 0;
			}
		}
	}


