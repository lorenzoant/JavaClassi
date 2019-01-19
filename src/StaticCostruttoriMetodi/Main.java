package StaticCostruttoriMetodi;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1;
		//Bisogna creare un costruttore poichè p1 è un puntatore
		p1=new Punto(5,-4);
		
		//p1.x=123 Non posso modificarle perchè sono private
		//p1.y=67 Non posso nemmeno vederle tramite una print 
		System.out.println("Il punto si trova nel quadrante n: " + p1.LocalizzaQuadrante());
		
		//Parte 2
		Random r = new Random(); // oggetto r di classe Random
		for(int i=0;i<10000;i++) {
			if(r.nextInt(10) == 5) // viene generato un valore r non maggiore di 10
				new Punto();	// per ogni r=5 viene creato un punto
		} 
		System.out.println("Sono stati creati " + Punto.getConta() + " punti.");
}
}