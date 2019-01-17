package Interface;
public class Atleti implements Ordinabile {
	
	/*
	 * 
	 * Le interfacce permettono di definire degli standard con i quali creare una classe 
	 * ad esempio se dovessi creare delle classi che permettano di gestire degli stack
	 * creerei una interface che contenda le due istruzioni fondamentali quali push() e pop()
	 * in questo modo tutte le classi che implementano questa interfaccia dovranno 
	 * necessariamente definire questi due metodi per poter essere utilizzabili
	 * 
	 */
    
	int pettorale=0;
	int eta=0, prestazione=0; //in secondi
	public final static double coefficienteEta=0.4; //non modificabile
	
	public Atleti(int _pettorale, int _eta, int _prestazione)  //costruttore
	{ pettorale=_pettorale; eta=_eta; prestazione=_prestazione;}
    
	public boolean minoreDi(Object altroAtleta)//metodo definito nell'interface
	{
		if(altroAtleta==null || !(altroAtleta instanceof Atleti))//instnace of mi permette di controllare il tipo della variabile
			return false;  //se altroAtleta è nullo o non è un instanza della classe atleti
		else
		{
			double indicePrestazioneQuestoAtleta = 
				prestazione - coefficienteEta*eta;
		
		    double indicePrestazioneAltro = 
				((Atleti)altroAtleta).prestazione - //trasformo in puntatore della classe atleti
				  coefficienteEta*((Atleti)altroAtleta).eta;
		
		    return indicePrestazioneQuestoAtleta <
			   indicePrestazioneAltro; 	
		}
	}

	public boolean maggioreDi(Object altroAtleta)//metodo definito nell'interface
	{
		return ! minoreDi(altroAtleta);
	}
}
