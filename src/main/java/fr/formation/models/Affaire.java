package fr.formation.models;

import lombok.Data;

@Data
public class Affaire {

	private Plainte plainte;
	private Suspect coupable;
	private Indice pieceAConviction;
	
	public Affaire(Plainte plainte, Suspect coupable, Indice pieceAConviction) {
		super();
		this.plainte = plainte;
		this.coupable = coupable;
		this.pieceAConviction = pieceAConviction;
	}
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
	public Indice getPieceAConviction() {
		return pieceAConviction;
	}
	public void setPieceAConviction(Indice pieceAConviction) {
		this.pieceAConviction = pieceAConviction;
	}

}
