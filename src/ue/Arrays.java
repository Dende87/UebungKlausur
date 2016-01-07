package ue;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//2 Dimensionales Array in ein 1 Dimensionales Array umwandeln
public class Arrays {

	public static void main(String[] args) {
		int[][] werte = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 }, { 10 }, {}, null, { 11, 12, 13 } };
		int[] pwerte = plattmachen(werte);
		print(pwerte);

		System.out.println(java.util.Arrays.deepToString(werte));
		
		System.out.println();

		boolean[] testArray = new boolean[10];
		java.util.Arrays.fill(testArray, 4, 8, true);
		
		System.out.println(java.util.Arrays.toString(testArray));
	
		
//		int[] pwerte2 = plattmachen2(werte);
//		print(pwerte2);
		
		
		Telefon telefon = new Telefon(10);
		telefon.anrufen("0441783748");
		
		telefon.setLetzteNummer(0);
		Telefon telefonHans = new Telefon(telefon);
		
	}


	static void print(int[] werte) {
		
		for(int i : werte){
			System.out.println(i + ", ");
		}
//		for (int i = 0; i < werte.length; i++) {
//			System.out.println(werte[i] + ", ");
//		}
		System.out.println();
		
	}

	public static int[] plattmachen2(int[][] werte) {
		if (werte == null) {
			return null;
		}

		int leange = 0;
		for (int i[] : werte) {
			
			if (i != null) {
				leange += i.length;
			}
		}

		int ergebnis[] = new int[leange];

		int index = 0;
		for (int j[] : werte) {
			if (j != null) {
				for (int x : j) {
					ergebnis[index] = x;
					index++;
				}
			}
		}
		return ergebnis;
	}

	public static int[] plattmachen(int[][] werte) {
		if (werte == null) {
			return null;
		}

		int laenge = 0;
		for (int i = 0; i < werte.length; i++) {
			if (werte[i] != null) {
				laenge += werte[i].length;
			}
		}
		int[] ergebnis = new int[laenge];

		int index = 0;
		for (int i = 0; i < werte.length; i++) {
			if (werte[i] != null) {
				for (int j = 0; j < werte[i].length; j++) {
					ergebnis[index] = werte[i][j];
					index++;
				}
			}
		}
		return ergebnis;
	}

}
