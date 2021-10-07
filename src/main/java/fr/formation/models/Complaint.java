package fr.formation.models;

import lombok.Data;


@Data
public class Complaint {

	private String plaignant;
	private String procesVerbal;
	private Case affaireLiee;
	private String urlIllustration;
	
	public Complaint(String plaignant, String procesVerbal, Case affaireLiee, String urlIllustration) {
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
	public Case getAffaireLiee() {
		return affaireLiee;
	}
	public void setAffaireLiee(Case affaireLiee) {
		this.affaireLiee = affaireLiee;
	}
	public String getUrlIllustration() {
		return urlIllustration;
	}
	public void setUrlIllustration(String urlIllustration) {
		this.urlIllustration = urlIllustration;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

