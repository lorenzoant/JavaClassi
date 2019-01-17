package Polimorfismo;
import java.awt.Color;

enum tipiTratto {fine, medio, normale, forte};
//Abstract definisce un'azione che deve essere in comune tra tutte le classi
public abstract class Figure {
  Color penna = Color.black;
  tipiTratto spessore = tipiTratto.normale;
   
   public Figure() 
  {
	  //potenziali importanti azioni di inizializzazione
	  //...
	  System.out.println("costruttore figure");
  }
  
  abstract double perimetro();
  
  public Figure(Color c, tipiTratto tratto)
  {   this();
	  penna = c; spessore=tratto;
	  System.out.println("costruttore figure2");
  }
  
  //altre caratteristiche in comune a tutte le figure ...
  //......
  
}
