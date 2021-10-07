package fr.formation.models;

import lombok.Data;

@Data
public class Case {

	private int id;
	private Complaint plainte;
	private Suspect coupable;
	private Clue pieceAConviction;
	
	public Case(int id, Complaint plainte, Suspect coupable, Clue pieceAConviction) {
		super();
		this.id = id;
		this.plainte = plainte;
		this.coupable = coupable;
		this.pieceAConviction = pieceAConviction;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Complaint getPlainte() {
		return plainte;
	}
	public void setPlainte(Complaint plainte) {
		this.plainte = plainte;
	}
	public Suspect getCoupable() {
		return coupable;
	}
	public void setCoupable(Suspect coupable) {
		this.coupable = coupable;
	}
	public Clue getPieceAConviction() {
		return pieceAConviction;
	}
	public void setPieceAConviction(Clue pieceAConviction) {
		this.pieceAConviction = pieceAConviction;
	}

}
