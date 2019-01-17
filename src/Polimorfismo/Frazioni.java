package Polimorfismo;

public class Frazioni {
	//stato interno
	private int num=0, den=1;
	
	
	//costruttori
    public Frazioni(int _num, int _den)
    {
        num = _num;
        
        if (_den!=0) 
        	den = _den; 
        else den=1;
    }	
    
    public Frazioni(int _num)
    {this(_num, 1);}
    
//    public Frazioni(String f)
//    {
//       // f = "23/43"	
//       this(Integer.parseInt(f.split("/")[0]),  
//    		Integer.parseInt(f.split("/")[1]) );
//    	
//    	
//    }
    
    public Frazioni(String f){ // Costruttore secondario ... denominatore e numeratore in formato stringa(f ="10/5")
    	this(Integer.parseInt(f.split("/")[0]),
    		 Integer.parseInt(f.split("/")[1])); // split crea al volo un vettore di stringhe.
    	}
    
    
    public String ToString()
    { return num + "/" + den; }
    
    
    public Frazioni Somma(Frazioni altra)
    {
    	
    	return new Frazioni(num*altra.den + den*altra.num, den*altra.den);
    	
    }
	

}
