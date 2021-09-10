package fr.formation.models;


public class Affaire {

	private Plainte plainte;
	private Suspect coupable;
	private Indice pieceAConviction;
	
	
	public Plainte getPlainte() {
		return plainte;
	}
	public void setPlainte(Plainte plainte) {
		this.plainte = plainte;
	}
	public Suspect getCoupable() {
		return coupable;
	}
	public void setCoupable(Suspect coupable) {
		this.coupable = coupable;
	}
	public Indice getIndice() {
		return pieceAConviction;
	}
	public void setIndice(Indice indice) {
		this.pieceAConviction = indice;
	}
	
	public Affaire(Plainte plainte, Suspect coupable, Indice indice) {
		super();
		this.plainte = plainte;
		this.coupable = coupable;
		this.pieceAConviction = indice;
	}
	
	
	

}
