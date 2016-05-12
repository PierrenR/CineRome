package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {

	
	private ArrayList <LignePanier> contenu = new ArrayList<LignePanier> () ;
	
	
	
	
	public double getPrixTotalHT () {
		
		double prix = 0 ;
		
		for(int i = 0; i < contenu.size(); i++) {
			
			prix = prix + (contenu.get(i).getArticle().getPrixHT() * contenu.get(i).getQuantite() )                  ;
			
		}
		
		return prix ; 
		
	}
	
	
	public int getNbElements () {
		
		int nb = contenu.size() ;
		return nb ;
		
	}
	
	
	public void ajouterArticle(Article a, int qte) {           //peut être améliorer car il se peut que la liste existe déjà (et il faudrait dans ce cas modifier la quantité)
		
		LignePanier lp = new LignePanier (a, qte) ;		
		contenu.add(lp);
		
	}
	
	
	public void AfficherPanier ()  {          // equivalent toString
	
		for(int j = 0; j < contenu.size(); j++) {
			System.out.println("ligne"+ (j+1)+ ":   " +contenu.get(j).getQuantite()+" fois l'article suivant : "+contenu.get(j).getArticle().getReference());
		}
	}
	
}
