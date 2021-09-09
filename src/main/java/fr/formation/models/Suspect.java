package fr.formation.models;

public class Suspect {

	private String nom;
	private String prenom;
	private String occupation;
	private String alibi;
	
	public Suspect(String nom, String prenom, String occupation, String alibi) {
		this.nom = nom;
		this.prenom = prenom;
		this.occupation = occupation;
		this.alibi = alibi;
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
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAlibi() {
		return alibi;
	}
	public void setAlibi(String alibi) {
		this.alibi = alibi;
	}	
}
