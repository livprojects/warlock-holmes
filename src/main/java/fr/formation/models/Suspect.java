package fr.formation.models;

import lombok.Data;

@AllArgsConstructor
@Data
public class Suspect {

	private Integer id;
	private String name;
	private String surname;
	private String occupation;
	private String alibi;
	private String urlPhoto;
	
	public Suspect(String nom, String prenom, String occupation, String alibi, String urlPhoto) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.occupation = occupation;
		this.alibi = alibi;
		this.urlPhoto = urlPhoto;
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
	public String getUrlPhoto() {
		return urlPhoto;
	}
	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
