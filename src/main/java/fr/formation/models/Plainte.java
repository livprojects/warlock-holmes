package fr.formation.models;

import lombok.Data;


@Data
public class Plainte {

	private String plaignant;
	private String procesVerbal;
	private Affaire affaireLiee;
	private String urlIllustration;
	
	public Plainte(String plaignant, String procesVerbal, Affaire affaireLiee, String urlIllustration) {
		super();
		this.plaignant = plaignant;
		this.procesVerbal = procesVerbal;
		this.affaireLiee = affaireLiee;
		this.urlIllustration = urlIllustration;
	}
	
	public String getPlaignant() {
		return plaignant;
	}
	public void setPlaignant(String plaignant) {
		this.plaignant = plaignant;
	}
	public String getProcesVerbal() {
		return procesVerbal;
	}
	public void setProcesVerbal(String procesVerbal) {
		this.procesVerbal = procesVerbal;
	}
	public Affaire getAffaireLiee() {
		return affaireLiee;
	}
	public void setAffaireLiee(Affaire affaireLiee) {
		this.affaireLiee = affaireLiee;
	}
	public String getUrlIllustration() {
		return urlIllustration;
	}
	public void setUrlIllustration(String urlIllustration) {
		this.urlIllustration = urlIllustration;
	}
	
}

