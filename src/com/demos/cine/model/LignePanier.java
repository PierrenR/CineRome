package com.demos.cine.model;

public class LignePanier {

	
	private Article article ; 
	private int quantite ;
	
	
	
	
	public LignePanier(Article article, int quantite) {
		
		this.article = article;
		this.quantite = quantite;
	}
	
	
	
	
	public Article getArticle() {
		return article;
	}
	public int getQuantite() {
		return quantite;
	}
	
	
	
	
	
}
