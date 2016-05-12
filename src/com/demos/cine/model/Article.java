package com.demos.cine.model;

public class Article {

	private String reference ;
	private double prixHT ;
	private String designation ;
	private int qteStcock ;
	
	
	
	public Article(String reference, double prixHT, String designation, int qteStcock) {
		
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStcock = qteStcock;
	}



	public double getPrixHT() {
		return prixHT;
	}


	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}


	public String getReference() {
		return reference;
	}


	public String getDesignation() {
		return designation;
	}


	public int getQteStcock() {
		return qteStcock;
	}
	
	
	public void incrementeStock (int qte) {
		this.qteStcock = this.qteStcock + qte ;
		
	}
	
	
	public void decrementeStock (int qte) {
		this.qteStcock = this.qteStcock - qte ;
		
	}
	
	
	
	
}