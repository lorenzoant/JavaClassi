package Interface;

public class Interfacce {

	public Interfacce(String[] args) {

    Atleti[] elenco = {new Atleti(1, 19, 12),  //pettorale, età, secondi
    		           new Atleti(2, 19, 13),
    		           new Atleti(3, 29, 14)};
    
    Ordinatore o = new Ordinatore(elenco);
    Atleti[] classifica = (Atleti[]) o.selectionSortA_Z();
    
    System.out.println("Classifica");  //ciclo di stampa
    for (int i=0; i<classifica.length; i++)
    	System.out.println("Pettorale: " + classifica[i].pettorale +
    			" " + (classifica[i].prestazione - Atleti.coefficienteEta*classifica[i].eta));
	
	
		}
}