package Polimorfismo;
import java.awt.Color;

enum tipiTratto {fine, medio, normale, forte};
/*
 * 
 * ABSTRACT
 * Simile alle interfacce ma permette di dichiarare direttamente metodi al suo interno o lasciare la sua
 * interpretazione alle classi che la estendono, permette inoltre di definire al suo interno variabili non static o final
 * al suo interno
 * 
 */
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
