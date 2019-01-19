package Polimorfismo;
@SuppressWarnings("unused")

 public class Rettangolo extends Figure {
  private Punto AngoloUpSx=null;
  //Protected definisce una variabile che può essere modificata solo dalla classe stessa in cui definita o dalle classi figlie
  //Se avessimo posto invece la keyword "final" il metodo o variabile non sarebbe potuto essere modificato in alcun modo
  protected int base = 0, altezza=0;

  
  public Rettangolo(int x1, int y1, int b, int h)
  {   
	  super();
	  //costruttore rettangolo prende costruttore madre
	  AngoloUpSx = new Punto(x1,y1); base=b; altezza=h;}
  
  public Rettangolo()
  { this(0,1,2,1);}
  
  
  //con coordinate angolo in alto a sinistra e quelle dell'angolo in basso a destra
  public Rettangolo(Punto p, int x2, int y2)
  { this(p.getX(), p.getY(), x2-p.getX(), Math.abs(y2-p.getY()) );}
    
  public double perimetro() {return 2*(base+altezza);}
  
  public double area() {return base*altezza;}
  
  
}
