package ue;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 }, null, { 1, 2, 3, 2 }, {} };

		System.out.println(anzahlElemente(matrix));

	}

	static int anzahlElemente(int[][] matrix) {

		int anzahlElemente = 0;
		if (matrix != null) {

			for (int i[] : matrix) {
				if (i != null) {
					anzahlElemente += i.length;
				}
			}

			return anzahlElemente;
		}
		return anzahlElemente;

	}

}// 2 dimension in 1ner dimension umwandeln
