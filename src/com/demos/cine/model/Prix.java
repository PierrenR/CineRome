package com.demos.cine.model;

public class Prix {

		private double valeur ; 
		
		public Prix (double p) throws Exception {
			
			//si prix n�gatif, on ne cr�e pas un objet Prix
			
			
			/*if(p<0){
				throw new Exception ("prix n�gatif");
			}
			valeur = p ;*/
			
			// � la place on appelle setPrix :
			
			setPrix(p) ;
		}
	
		
		
		public double getPrix () {
			
			return valeur;
		}
		
		
		public void setPrix(double p) throws Exception {
			if(p<0){
				throw new Exception ("prix n�gatif");
			}
			valeur = p ;
			
		}
		
	
}
