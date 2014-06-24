package com.ninja_squad.geektic.service;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GEEK")
public class Geek {
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String sexe;
	private String mail;
	private String interets;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getInterets() {
		return interets;
	}

	public void setInterets(String interets) {
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
	
	public Geek()
	{
	}

}
