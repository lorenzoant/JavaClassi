package EsFrazioni;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Frazioni");
		
		//syso ctrl+space
		
		ClasseFrazioni f1;						//Richiamo la classe creando un tag collegata a essa
		
		f1=new ClasseFrazioni(1,7);				//Richiamo il costruttore della Classe
			
		new ClasseFrazioni(8);					//Restituisco il rislutato di 1/n
		
		new ClasseFrazioni("10/5");				//Restituisco un risultato NUMERICO da un input STRINGA
		
		f1.Somma(new ClasseFrazioni("1/7"));	//Restituisco la somma di frazioni da un'altra istanza
		
	}

}
