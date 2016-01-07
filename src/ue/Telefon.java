package ue;

//Class
public class Telefon {

	//Attributes
	String[] gespeicherteNummer;
	private String letzteNummer;
	
	//Constructor
	Telefon(int anzahl){
		this.letzteNummer = null;
		this.gespeicherteNummer = new String[anzahl];
				
		for(int i = 0;i < this.gespeicherteNummer.length;i++){
			this.gespeicherteNummer[i] = letzteNummer;
		}
	}
	
	//CopyConstructor
	Telefon(Telefon telefon){
		this.letzteNummer = telefon.letzteNummer;
		
		this.gespeicherteNummer = new String[telefon.gespeicherteNummer.length];	
		this.gespeicherteNummer = telefon.gespeicherteNummer.clone();
				
		System.out.println(java.util.Arrays.toString(this.gespeicherteNummer));
		
		//clone function	
//		this.gespeicherteNummer = telefon.gespeicherteNummer.clone();
//		//copy array to array
//		for(int i = 0;i< this.gespeicherteNummer.length;i++){
//			this.gespeicherteNummer[i] = telefon.gespeicherteNummer[i];
//		}
	}
	
	//void Function
	
	void anrufen(String nummer){
		System.out.println(nummer);
		this.letzteNummer = nummer;
	}
	
	//get Function
	String getLetzteNummer(){
		return this.letzteNummer;
	}
	
	//set Function
	void setLetzteNummer(int n){
		this.gespeicherteNummer[n] = this.letzteNummer;
	}
	
	//Function calls Function with ErrorHandling
	void anrufenSpeicher(int n){
		if(this.gespeicherteNummer[n] != null){
			this.anrufen(this.gespeicherteNummer[n]);	
		}
	}
}
