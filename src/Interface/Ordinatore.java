package Interface;
public class Ordinatore {
  Ordinabile[] v=null;
  
  //riceve un vettore di una classe che implementa ordinabile
  
  public Ordinatore(Ordinabile[] _v)  //clona il vettore elenco del main
  {v = _v.clone(); }  //che apparteneva all'interfaccia ordinabile

  int posMin(int partiDa)
  {
	  int posizioneMinimo=partiDa, 
		  posizioneCorrente=partiDa+1;
	  
	  while (posizioneCorrente<v.length)
	  {
		  if(v[posizioneCorrente].minoreDi(v[posizioneMinimo]) )//v è un vettore che rispetta l'interfaccia ordinabile
			  posizioneMinimo = posizioneCorrente;//perciò so che espone il metodo minoreDI
		  posizioneCorrente++;
	  }
	  return posizioneMinimo;
  }
  
  
  Ordinabile[] selectionSortA_Z() //restituisce oggetti di tipo ordinabile
  {
	 for (int i=0; i<v.length - 1; i++)
	 {
		 int posizioneMinimoDeiRimanenti =
				 posMin(i);
	     Ordinabile tmp = v[i];
		 v[i] = v[posizioneMinimoDeiRimanenti];
		 v[posizioneMinimoDeiRimanenti] = tmp;
	 }
	 
	 return v;
	 
  }
}
