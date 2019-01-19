package EsFrazioni;
/*
 * 
 * Vediamo qui come è possibile creare e utilizzare più costruttori per una solo classe cambiando solamente le variabili che richiedono
 * 
 */

public class ClasseFrazioni {
		
	
		float num, den;
		
		float ris;
		//Metodi
		
		
		//Costruttori
		
		public ClasseFrazioni(float numx, float denx) {


			num=numx;								//Dichiaro la variabile senza usare this.
			
			if(denx!=0){							//Controllo se denominatore=0
				den=denx;
				
				System.out.println(ris=num/den);
				
				return;
				
			} else {
				System.out.println("Mettere Denominatore DIVERSO da Zero!");		
			}
			
		
		}
		
		
		public ClasseFrazioni(float denx) {
			
			if(denx!=0){
				den=denx;
				
				System.out.println(ris=1/den);			//Restituisco 1/n
				
				return;
				
			} else {
				System.out.println("Mettere Denominatore DIVERSO da Zero!");
			}
			
		}
		
		
		public ClasseFrazioni(String a) {
			
			this(Integer.parseInt(a.split("/")[0]),		//Gli dico di dividere in 2 parti la stringa in base
				Integer.parseInt(a.split("/")[1]));		//al separatore "/", e le inserisce come interi in 2 vettori
			
			if (Integer.parseInt(a.split("/")[1])==0){	//Controllo se il denominatore è uguale a 0
				
				System.out.println("Inserire denominatore diverso da zero");
				
				return;
			}
			
			return;
		}
		

		public ClasseFrazioni Somma(ClasseFrazioni b) {
			
			return new ClasseFrazioni(num*b.den+den*b.num, den*b.num);	//Richiamo a sua volta la classe
		}
		
		


}
