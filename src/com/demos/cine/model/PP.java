package com.demos.cine.model;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		Article a1 = new Article ( "aaa",  10.5,  "TV",  45) ; 
		Article b1 = new Article ( "bbb",  10,  "ordinateur",  3) ; 
		
		
		
		Panier myPanier = new Panier() ;
		
		myPanier.ajouterArticle(a1, 2) ;
		myPanier.ajouterArticle(b1, 3) ;
		
		
		
		double prixT = myPanier.getPrixTotalHT () ;
		System.out.println("le prix total de mon panier est : "+prixT);
		
		
		
		int nbE = myPanier.getNbElements () ;
		System.out.println("le nb d'élements de mon panier est : "+nbE);
		
		
		System.out.println("---------------------");
		System.out.println("-------affichage du panier--------------");
		
		
		myPanier.AfficherPanier () ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
