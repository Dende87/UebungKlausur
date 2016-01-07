package lampenspiel;

public class Lampenspiel {

	public static void main(String[] args) {

		int spielfeldSize = (IO.readInt("Feldgroesse (2<n<10): "));
		
		while(spielfeldSize < 2 || spielfeldSize > 10){
			IO.println("Fehlerhafte eingabe! Bitte erneut eingeben.");
			spielfeldSize = (IO.readInt("Feldgroesse (2<n<10): "));
		}
		
		boolean[][] lampenfeld = new boolean[spielfeldSize][spielfeldSize];
		ausgabeSpielfeld(lampenfeld);

		while (!alleLampenAn(lampenfeld)) {
			
			int reihe = IO.readInt("Reihe angeben (0<r<" + spielfeldSize + "): ");
			while(!checkEingabe(reihe, spielfeldSize)){
				reihe = IO.readInt("Reihe angeben (0<r<" + spielfeldSize + "): ");	
			}
			int spalte = IO.readInt("Spalte angeben (0<s<" + spielfeldSize + "): ");
			while(!checkEingabe(spalte, spielfeldSize)){
				spalte = IO.readInt("Reihe angeben (0<r<" + spielfeldSize + "): ");
			}
			
			setzeLampe(reihe, spalte, lampenfeld);
			ausgabeSpielfeld(lampenfeld);
		}

	}

	private static boolean checkEingabe(int eingabe, int spielfeldSize) {
		if(eingabe < 0 || eingabe >= spielfeldSize){
			IO.println("Fehlerhafte eingabe!");
		return false;
		}
		return true;
	}

	private static boolean alleLampenAn(boolean[][] lampenfeld) {
		
		for(boolean[] i: lampenfeld){
			for(boolean j: i){
				if(!j)return false;
			}
		}
		
		return true;
	}

	private static void setzeLampe(int reihe, int spalte, boolean[][] lampenfeld) {

		lampenfeld[reihe][spalte] = !lampenfeld[reihe][spalte];
		if (reihe + 1 < lampenfeld.length)
			lampenfeld[reihe + 1][spalte] = !lampenfeld[reihe + 1][spalte];
		if (reihe - 1 > 0)
			lampenfeld[reihe - 1][spalte] = !lampenfeld[reihe - 1][spalte];
		if (spalte + 1 < lampenfeld.length)
			lampenfeld[reihe][spalte + 1] = !lampenfeld[reihe][spalte + 1];
		if (spalte - 1 > 0)
			lampenfeld[reihe][spalte - 1] = !lampenfeld[reihe][spalte - 1];

	}

	private static void ausgabeSpielfeld(boolean[][] lampenfeld) {
		IO.print(" ");
		for (int i = 0; i < lampenfeld.length; i++) {
			IO.print(i);
		}
		IO.println();

		int spNumber = 0;
		for (boolean[] i : lampenfeld) {
			IO.print(spNumber);
			for (boolean j : i) {
				if (j) {
					IO.print("+");
				} else {
					IO.print(".");
				}
			}
			IO.println();
			spNumber++;
		}

	}

}
