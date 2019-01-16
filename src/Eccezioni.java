import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Eccezioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parteVellone();
	}

	static void parteVellone() {
		//Ci sono due tipi di eccezioni unckecked e checked
		//Partiamo con le unckecked
		//Con l'eccezioni di tipo unckecked posso intercettare gli errori run-time
		//Servono per evitare di mostrare all'utilizzatore finale errori o crash dell'applicazione
		
		//esempio eccezioni unckecked
		int[] vettore = {3,8,-18,19,56,0,41,88,12,13,15,4,90};
		int media = 0;
		//media = mediaInteraVett(vettore,0);
		//System.out.println("La media del vettore è: " + media);
		
		
		try {
			//prova a fare questo, ma non preoccupari se non ce la fai
			media = mediaInteraVett(vettore,0);
			System.out.println("La media del vettore è: " + media);
		}
		catch (IllegalArgumentException err){
			//gestisco l'errore
			System.out.println("La media deve essere fatta con almeno un valore.");
			//err.printStackTrace();//mostro dove è stato creato l'errore
		}
		finally {
			//comunque vada fai questo questo...
			System.out.println("Fine calcolo");
		}
		
	
		

		
		
		//Esempio eccezioni checked
		//Eccezzioni che andranno a risolvere errori comuni.
		//Non è possible ignorare questi errori ma posso dire con non ho intenzione gestirli,
		//in questo caso l'errore verra gestito dal metodo chiamante.
		
		//PrintWriter out = new PrintWriter("risultato.txt");
		
		try {
			PrintWriter out = new PrintWriter("risultato.txt");
			out.write("Ciao bimbo. La media è: " + media);
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Il file non può essere salvato!");
			//e.printStackTrace();//mostro errore all'utente
		}
		finally{
			System.out.println("Finito. Ciao!");
		}
		
		
	}


	//usato in parteVellone
	static int mediaInteraVett(int []v, int diQuanti) {
		//banalissima funzione che restituisce la media intera
		int somma = 0;
		
		for(int i = 0; i < diQuanti; i++) {
			//faccio la somma del vettore
			somma += v[i];
		}

		//return somma / diQuanti;
		
		
		if(diQuanti > 0) {
			//valore accettabile, restituisco la media
			return somma / diQuanti;
		}else {
			//problema di divisione per 0 o negativa
			throw new IllegalArgumentException();//eccezione di tipo uncecked
			//mi blocco e ritorno il controllo al chiamante
		}

	}
	
}
