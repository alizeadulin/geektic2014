package com.ninja_squad.geektic.service;

public class Geek {
	
	private int id;
	private String nom;
	private String prenom;
	private String sexe;
	private String mail;
	private String interets;
	
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getNom() {
		return nom;
	}
	private void setNom(String nom) {
		this.nom = nom;
	}
	private String getPrenom() {
		return prenom;
	}
	private void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	private String getSexe() {
		return sexe;
	}
	private void setSexe(String sexe) {
		this.sexe = sexe;
	}
	private String getMail() {
		return mail;
	}
	private void setMail(String mail) {
		this.mail = mail;
	}
	private String getInterets() {
		return interets;
	}
	private void setInterets(String interets) {
		this.interets = interets;
	}
	
	public Geek(int id, String nom, String prenom, String sexe, String mail, String interets)
	{
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.mail = mail;
		this.interets = interets;
	}

}
