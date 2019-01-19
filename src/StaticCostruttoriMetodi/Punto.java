package StaticCostruttoriMetodi;


public class Punto {
	//Stato interno
		//Con private creiamo delle variabili private che non potranno essere viste 
		//e usate quando si richiama la classe
		private int x=0;
		private int y=0;
		static private int conta=0;	//dichiarazione membro statico
		/*
		 * 
		 * STATIC
		 * Permette di creare delle variabili comuni a tutte le istanze che si andranno a creare senza che vengano create di
		 * nuovo a ogni chiamata del costruttore ma facendo si che il loro contenuto si condivida tra le varie
		 * istanze
		 * 	
		 */
		public Punto(int x, int y) {
			//x=x sarebbe una situazione equivoca poichè non sappiamo se si tratta della x
			//della funzione o quella private
			this.setX(x);
			this.y=y;
			conta++;
			//con this risolviamo questa ambiguità
			
		}
		//oppure creare metodi setter e getter (come in c l'anno scorso)
		//Costruttore 2
		public Punto(int _x) {
			//Richiamo il primo costruttore passando i parametri ottenuti
			this(_x,0);
		}
		
		public Punto() {this(0,0);} //costruttore senza parametri richiesti
		
		//getter
		public int getX() {
			return x;
		}
		
		static public int getConta() {
			return conta;
		}
		
		//setter
		public void setX(int x) {
			this.x = x;
		}
		
		public int LocalizzaQuadrante() {
			if(x>0 && y>0)
				return 1;
			else
				if(x<0 && y>0)
					return 2;
				else
					if(x<0 && y<0)
						return 3;
					else
						if(x>0 && y<0)
							return 4;
						else 
							return 99;
		}

		
		
		
	}
