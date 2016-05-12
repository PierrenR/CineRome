package com.demos.cine.model;

public class Prix {

		private double valeur ; 
		
		public Prix (double p) throws Exception {
			
			//si prix négatif, on ne crée pas un objet Prix
			
			
			/*if(p<0){
				throw new Exception ("prix négatif");
			}
			valeur = p ;*/
			
			// à la place on appelle setPrix :
			
			setPrix(p) ;
		}
	
		
		
		public double getPrix () {
			
			return valeur;
		}
		
		
		public void setPrix(double p) throws Exception {
			if(p<0){
				throw new Exception ("prix négatif");
			}
			valeur = p ;
			
		}
		
	
}
